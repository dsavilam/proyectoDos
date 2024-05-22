package Negocio.Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CasoEmergencia {
    private Long id;
    private static Long idAux = 1L;
    private String direccion;
    private LocalDate fecha;
    private String descripcion;
    private Ambulancia ambulancia;
    private List<Paramedico> paramedicos;
    private List<Paciente> pacientes;

    public CasoEmergencia(String direccion, LocalDate fecha, String descripcion, Ambulancia ambulancia) {
        this.id = idAux;
        this.direccion = direccion;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.ambulancia = ambulancia;
        this.paramedicos = new ArrayList<>();
        this.pacientes = new ArrayList<>();
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
        CasoEmergencia.idAux = idAux;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public Ambulancia getAmbulancia() { return ambulancia; }

    public void setAmbulancia(Ambulancia ambulancia) { this.ambulancia = ambulancia; }

    public List<Paramedico> getParamedicos() { return paramedicos; }

    public void setParamedicos(List<Paramedico> paramedicos) { this.paramedicos = paramedicos; }

    public List<Paciente> getPacientes() { return pacientes; }

    public void setPacientes(List<Paciente> pacientes) { this.pacientes = pacientes; }
}
