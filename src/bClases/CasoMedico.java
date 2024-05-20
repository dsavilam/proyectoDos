package bClases;

import java.time.LocalDate;

public class CasoMedico {
    private Long id;
    private static Long idAux;
    private LocalDate fecha;
    private String descripcion;

    public CasoMedico(Long id, LocalDate fecha, String descripcion) {
        this.id = idAux;
        this.fecha = fecha;
        this.descripcion = descripcion;
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
}
