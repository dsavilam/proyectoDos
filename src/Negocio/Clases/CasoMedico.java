package Negocio.Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CasoMedico {
    private Long id;
    private static Long idAux = 1L;
    private LocalDate fecha;
    private String descripcion;
    private Doctor doctor;
    private List<Paciente> pacientes;
    private List<Paramedico> paramedicos;
    public CasoMedico(LocalDate fecha, String descripcion, Doctor doctor, List<Paciente> pacientes) {
        this.id = idAux;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.doctor = doctor;
        this.pacientes = new ArrayList<>();
        this.paramedicos = new ArrayList<>();
        idAux++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Long getIdAux() {
        return idAux;
    }

    public static void setIdAux(Long idAux) {
        CasoMedico.idAux = idAux;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Doctor getDoctor() { return doctor; }

    public void setDoctor(Doctor doctor) { this.doctor = doctor; }

    public List<Paciente> getPacientes() { return pacientes; }

    public void setPacientes(List<Paciente> pacientes) { this.pacientes = pacientes; }

    public List<Paramedico> getParamedicos() { return paramedicos; }

    public void setParamedicos(List<Paramedico> paramedicos) { this.paramedicos = paramedicos; }
}
