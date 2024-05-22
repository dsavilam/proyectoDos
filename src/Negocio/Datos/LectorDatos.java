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
                if (linea.startsWith("##TIPO_DOC##")) {
                    leerTiposIdentificacion(br);
                } else if (linea.startsWith("##AMBULANCIA##")) {
                    leerAmbulancias(br);
                } else if (linea.startsWith("##DOCTOR##")) {
                    leerDoctores(br);
                } else if (linea.startsWith("##PARAMEDICO##")) {
                    leerParamedicos(br);
                } else if (linea.startsWith("##ENFERMERO##")) {
                    leerEnfermeros(br);
                } else if (linea.startsWith("##HABITACION##")) {
                    leerHabitaciones(br);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void leerTiposIdentificacion(BufferedReader br) throws IOException {
        String linea;
        InterfazTipoIdentificacion impTipoIdentificacion = new ImpTipoIdentificacion();
        while ((linea = br.readLine()) != null && !linea.startsWith("##") && !linea.isEmpty()) {
            String[] datos = linea.split(" ");
            TipoIdentificacion tipo = new TipoIdentificacion(datos[0], datos[1]);
            tipo.setId(TipoIdentificacion.getIdAux());
            impTipoIdentificacion.agregarTipoIdentificacion(tipo);
            tiposIdentificacionMap.put(tipo.getId(), tipo);
        }
    }

    private void leerAmbulancias(BufferedReader br) throws IOException {
        String linea;
        InterfazAmbulancia impAmbulancia = new ImpAmbulancia();
        while ((linea = br.readLine()) != null && !linea.startsWith("##") && !linea.isEmpty()) {
            String[] datos = linea.split(" ");
            Ambulancia ambulancia = new Ambulancia(datos[0], Integer.parseInt(datos[1]), Float.parseFloat(datos[2]));
            ambulancia.setId(Ambulancia.getIdAux());
            impAmbulancia.agregarAmbulancia(ambulancia);
        }
    }

    private void leerDoctores(BufferedReader br) throws IOException {
        String linea;
        InterfazDoctor impDoctor = new ImpDoctor();
        while ((linea = br.readLine()) != null && !linea.startsWith("##") && !linea.isEmpty()) {
            String[] datos = linea.split(" ");
            TipoIdentificacion tipo = tiposIdentificacionMap.values().stream()
                    .filter(t -> t.getCodigo().equals(datos[2]))
                    .findFirst()
                    .orElse(null);
            Doctor doctor = new Doctor(datos[0], datos[1], datos[3], tipo, datos[4], datos[5]);
            doctor.setId(Doctor.getIdAux());
            impDoctor.agregarDoctor(doctor);
        }
    }

    private void leerParamedicos(BufferedReader br) throws IOException {
        String linea;
        InterfazParamedico impParamedico = new ImpParamedico();
        while ((linea = br.readLine()) != null && !linea.startsWith("##") && !linea.isEmpty()) {
            String[] datos = linea.split(" ");
            TipoIdentificacion tipo = tiposIdentificacionMap.values().stream()
                    .filter(t -> t.getCodigo().equals(datos[2]))
                    .findFirst()
                    .orElse(null);
            Paramedico paramedico = new Paramedico(datos[0], datos[1], datos[2], tipo, Boolean.parseBoolean(datos[3]), Boolean.parseBoolean(datos[4]));
            paramedico.setId(Paramedico.getIdAux());
            impParamedico.agregarParamedico(paramedico);
        }
    }

    private void leerEnfermeros(BufferedReader br) throws IOException {
        String linea;
        InterfazEnfermero impEnfermero = new ImpEnfermero();
        while ((linea = br.readLine()) != null && !linea.startsWith("##") && !linea.isEmpty()) {
            String[] datos = linea.split(" ");
            TipoIdentificacion tipo = tiposIdentificacionMap.values().stream()
                    .filter(t -> t.getCodigo().equals(datos[2]))
                    .findFirst()
                    .orElse(null);
            Enfermero enfermero = new Enfermero(datos[0], datos[1], datos[2], tipo, Boolean.parseBoolean(datos[3]));
            enfermero.setId(Enfermero.getIdAux());
            impEnfermero.agregarEnfermero(enfermero);
        }
    }

    private void leerHabitaciones(BufferedReader br) throws IOException {
        String linea;
        InterfazHabitacion impHabitacion = new ImpHabitacion();
        while ((linea = br.readLine()) != null && !linea.startsWith("##") && !linea.isEmpty()) {
            String[] datos = linea.split(" ");
            Habitacion habitacion = new Habitacion(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]), Integer.parseInt(datos[2]));
            habitacion.setId(Habitacion.getIdAux());
            impHabitacion.agregarHabitacion(habitacion);
        }
    }
}

