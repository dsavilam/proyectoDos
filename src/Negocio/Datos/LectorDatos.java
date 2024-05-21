package Negocio.Datos;

import Negocio.Clases.*;
import Negocio.Implementaciones.*;
import Negocio.Interfaces.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LectorDatos {

    private Map<Long, TipoIdentificacion> tiposIdentificacionMap = new HashMap<>();

    public void cargarDatosDesdeArchivo(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("TiposIdentificacion")) {
                    leerTiposIdentificacion(br);
                } else if (linea.startsWith("Ambulancias")) {
                    leerAmbulancias(br);
                } else if (linea.startsWith("Doctores")) {
                    leerDoctores(br);
                } else if (linea.startsWith("Paramedicos")) {
                    leerParamedicos(br);
                } else if (linea.startsWith("Enfermeros")) {
                    leerEnfermeros(br);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void leerTiposIdentificacion(BufferedReader br) throws IOException {
        String linea;
        InterfazTipoIdentificacion impTipoIdentificacion = new ImpTipoIdentificacion();
        while ((linea = br.readLine()) != null && !linea.isEmpty()) {
            String[] datos = linea.split(",");
            TipoIdentificacion tipo = new TipoIdentificacion(datos[1], datos[2]);
            tipo.setId(Long.parseLong(datos[0]));
            impTipoIdentificacion.agregarTipoIdentificacion(tipo);
            tiposIdentificacionMap.put(tipo.getId(), tipo);
        }
    }

    private void leerAmbulancias(BufferedReader br) throws IOException {
        String linea;
        InterfazAmbulancia impAmbulancia = new ImpAmbulancia();
        while ((linea = br.readLine()) != null && !linea.isEmpty()) {
            String[] datos = linea.split(",");
            Ambulancia ambulancia = new Ambulancia(datos[1], Integer.parseInt(datos[2]), Float.parseFloat(datos[3]));
            ambulancia.setId(Long.parseLong(datos[0]));
            impAmbulancia.agregarAmbulancia(ambulancia);
        }
    }

    private void leerDoctores(BufferedReader br) throws IOException {
        String linea;
        InterfazDoctor impDoctor = new ImpDoctor();
        while ((linea = br.readLine()) != null && !linea.isEmpty()) {
            String[] datos = linea.split(",");
            TipoIdentificacion tipo = tiposIdentificacionMap.get(Long.parseLong(datos[4]));
            Doctor doctor = new Doctor(datos[1], datos[2], datos[3], tipo, datos[5], datos[6]);
            doctor.setId(Long.parseLong(datos[0]));
            impDoctor.agregarDoctor(doctor);
        }
    }

    private void leerParamedicos(BufferedReader br) throws IOException {
        String linea;
        InterfazParamedico impParamedico = new ImpParamedico();
        while ((linea = br.readLine()) != null && !linea.isEmpty()) {
            String[] datos = linea.split(",");
            TipoIdentificacion tipo = tiposIdentificacionMap.get(Long.parseLong(datos[4]));
            Paramedico paramedico = new Paramedico(datos[1], datos[2], datos[3], tipo, Boolean.parseBoolean(datos[5]), Boolean.parseBoolean(datos[6]));
            paramedico.setId(Long.parseLong(datos[0]));
            impParamedico.agregarParamedico(paramedico);
        }
    }

    private void leerEnfermeros(BufferedReader br) throws IOException {
        String linea;
        InterfazEnfermero impEnfermero = new ImpEnfermero();
        while ((linea = br.readLine()) != null && !linea.isEmpty()) {
            String[] datos = linea.split(",");
            TipoIdentificacion tipo = tiposIdentificacionMap.get(Long.parseLong(datos[4]));
            Enfermero enfermero = new Enfermero(datos[1], datos[2], datos[3], tipo, Boolean.parseBoolean(datos[5]));
            enfermero.setId(Long.parseLong(datos[0]));
            impEnfermero.agregarEnfermero(enfermero);
        }
    }
}
