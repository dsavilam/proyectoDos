package Fachada;

import Negocio.Datos.LectorDatos;
import Negocio.Clases.*;
import Negocio.Implementaciones.*;
import Negocio.Interfaces.*;
import Negocio.Excepciones.ObjetoNoEncontradoException;
import java.util.List;

public class SEmergencias {
    private InterfazDoctor impDoctor;
    private InterfazCasoEmergencia impCasoEmergencia;
    private InterfazCasoMedico impCasoMedico;
    private InterfazAmbulancia impAmbulancia;
    private InterfazTipoIdentificacion impTipoIdentificacion;
    private InterfazParamedico impParamedico;
    private InterfazEnfermero impEnfermero;

    public SEmergencias() {
        this.impDoctor = new ImpDoctor();
        this.impCasoEmergencia = new ImpCasoEmergencia();
        this.impCasoMedico = new ImpCasoMedico();
        this.impAmbulancia = new ImpAmbulancia();
        this.impTipoIdentificacion = new ImpTipoIdentificacion();
        this.impParamedico = new ImpParamedico();
        this.impEnfermero = new ImpEnfermero();
    }

    public void cargarDatosDesdeArchivo(String archivo) {
        LectorDatos lector = new LectorDatos();
        lector.cargarDatosDesdeArchivo(archivo);
    }

    // Métodos para manejar doctores
    public void agregarDoctor(Doctor doctor) {
        impDoctor.agregarDoctor(doctor);
    }

    public void eliminarDoctor(long id) throws ObjetoNoEncontradoException {
        try {
            impDoctor.eliminarDoctor(id);
        } catch (Exception e) {
            throw new ObjetoNoEncontradoException("Doctor no encontrado");
        }
    }

    public List<Doctor> listarDoctores() {
        return impDoctor.listarDoctores();
    }

    public void modificarDoctor(Doctor doctor) {
        impDoctor.modificarDoctor(doctor);
    }

    public List<Doctor> filtrarDoctoresPorEspecialidad(String especialidad) {
        return impDoctor.filtrarDoctoresPorEspecialidad(especialidad);
    }

    // Métodos para manejar casos de emergencia
    public void agregarCasoEmergencia(CasoEmergencia casoEmergencia) {
        impCasoEmergencia.agregarCasoEmergencia(casoEmergencia);
    }

    public void eliminarCasoEmergencia(long id) throws ObjetoNoEncontradoException {
        try {
            impCasoEmergencia.eliminarCasoEmergencia(id);
        } catch (Exception e) {
            throw new ObjetoNoEncontradoException("Caso de emergencia no encontrado");
        }
    }

    public List<CasoEmergencia> listarCasosEmergencia() {
        return impCasoEmergencia.listarCasosEmergencia();
    }

    public void modificarCasoEmergencia(CasoEmergencia casoEmergencia) {
        impCasoEmergencia.modificarCasoEmergencia(casoEmergencia);
    }

    public void registrarCasoEmergencia(CasoEmergencia casoEmergencia) {
        impCasoEmergencia.registrarCasoEmergencia(casoEmergencia);
    }

    // Métodos para manejar casos médicos
    public void agregarCasoMedico(CasoMedico casoMedico) {
        impCasoMedico.agregarCasoMedico(casoMedico);
    }

    public void eliminarCasoMedico(long id) throws ObjetoNoEncontradoException {
        try {
            impCasoMedico.eliminarCasoMedico(id);
        } catch (Exception e) {
            throw new ObjetoNoEncontradoException("Caso médico no encontrado");
        }
    }

    public List<CasoMedico> listarCasosMedicos() {
        return impCasoMedico.listarCasosMedicos();
    }

    public void modificarCasoMedico(CasoMedico casoMedico) {
        impCasoMedico.modificarCasoMedico(casoMedico);
    }

    public void registrarCasoMedico(CasoMedico casoMedico) {
        impCasoMedico.registrarCasoMedico(casoMedico);
    }

    // Métodos para manejar ambulancias
    public void agregarAmbulancia(Ambulancia ambulancia) {
        impAmbulancia.agregarAmbulancia(ambulancia);
    }

    public void eliminarAmbulancia(long id) throws ObjetoNoEncontradoException {
        try {
            impAmbulancia.eliminarAmbulancia(id);
        } catch (Exception e) {
            throw new ObjetoNoEncontradoException("Ambulancia no encontrada");
        }
    }

    public List<Ambulancia> listarAmbulancias() {
        return impAmbulancia.listarAmbulancias();
    }

    public void modificarAmbulancia(Ambulancia ambulancia) {
        impAmbulancia.modificarAmbulancia(ambulancia);
    }

    // Métodos para guardar y cargar datos
    public void guardarDatos() {
        impDoctor.guardarDatosDoctor();
        impCasoEmergencia.guardarDatosCasoEmergencia();
        impCasoMedico.guardarDatosCasoMedico();
        impAmbulancia.guardarDatosAmbulancia();
    }

    public void cargarDatos() {
        impDoctor.cargarDatosDoctor();
        impCasoEmergencia.cargarDatosCasoEmergencia();
        impCasoMedico.cargarDatosCasoMedico();
        impAmbulancia.cargarDatosAmbulancia();
    }
}
