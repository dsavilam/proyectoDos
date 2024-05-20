package negocio;

import java.util.ArrayList;
import java.util.List;

public class SEmergencias {
    //Esto solo tiene métodos, lo típico. Y listas
    private List<TipoIdentificacion> tipoidentificaciones;
    private List<Paciente> pacientes;
    private List<Paramedico> paramedicos;
    private List<Doctor> doctores;
    private List<Enfermero> enfermeros;
    private List<Habitación> habitaciones;
    private List<CasoMedico> casosMedicos;
    private List<CasoEmergencia> casosDeEmergencia;
    private List<Ambulancia> ambulancias;

    public SEmergencias(List<TipoIdentificacion> tipoidentificaciones, List<Paciente> pacientes, List<Paramedico> paramedicos, List<Doctor> doctores, List<Enfermero> enfermeros, List<Habitación> habitaciones, List<CasoMedico> casosMedicos, List<CasoEmergencia> casosDeEmergencia, List<Ambulancia> ambulancias) {
        this.tipoidentificaciones = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.paramedicos = new ArrayList<>();
        this.doctores = new ArrayList<>();
        this.enfermeros = new ArrayList<>();
        this.habitaciones = new ArrayList<>();
        this.casosMedicos = new ArrayList<>();
        this.casosDeEmergencia = new ArrayList<>();
        this.ambulancias = new ArrayList<>();
    }

    public List<TipoIdentificacion> getTipoidentificaciones() { return tipoidentificaciones; }

    public void setTipoidentificaciones(List<TipoIdentificacion> tipoidentificaciones) { this.tipoidentificaciones = tipoidentificaciones; }

    public List<Paciente> getPacientes() { return pacientes; }

    public void setPacientes(List<Paciente> pacientes) { this.pacientes = pacientes; }

    public List<Paramedico> getParamedicos() { return paramedicos; }

    public void setParamedicos(List<Paramedico> paramedicos) { this.paramedicos = paramedicos; }

    public List<Doctor> getDoctores() { return doctores; }

    public void setDoctores(List<Doctor> doctores) { this.doctores = doctores; }

    public List<Enfermero> getEnfermeros() { return enfermeros; }

    public void setEnfermeros(List<Enfermero> enfermeros) { this.enfermeros = enfermeros; }

    public List<Habitación> getHabitaciones() { return habitaciones; }

    public void setHabitaciones(List<Habitación> habitaciones) { this.habitaciones = habitaciones; }

    public List<CasoMedico> getCasosMedicos() { return casosMedicos; }

    public void setCasosMedicos(List<CasoMedico> casosMedicos) { this.casosMedicos = casosMedicos; }

    public List<CasoEmergencia> getCasosDeEmergencia() { return casosDeEmergencia; }

    public void setCasosDeEmergencia(List<CasoEmergencia> casosDeEmergencia) { this.casosDeEmergencia = casosDeEmergencia; }

    public List<Ambulancia> getAmbulancias() { return ambulancias; }

    public void setAmbulancias(List<Ambulancia> ambulancias) { this.ambulancias = ambulancias; }

}
