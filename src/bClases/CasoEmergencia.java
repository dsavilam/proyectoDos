package bClases;

import java.time.LocalDate;

public class CasoEmergencia {
    private Long id;
    private static Long idAux;
    private String direccion;
    private LocalDate fecha;
    private String descripcion;

    public CasoEmergencia(Long id, String direccion, LocalDate fecha, String descripcion) {
        this.id = idAux;
        this.direccion = direccion;
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
}
