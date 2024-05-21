package Negocio;

import java.util.ArrayList;
import java.util.List;

public class Habitación {
    private Long id;
    private static Long idAux;
    private String numero;
    private int capacidad;
    private float area;
    private List<Enfermero> enfermeros;

    public Habitación(String numero, int capacidad, float area) {
        this.id = idAux;
        this.numero = numero;
        this.capacidad = capacidad;
        this.area = area;
        this.enfermeros = new ArrayList<>();
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
        Habitación.idAux = idAux;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public List<Enfermero> getEnfermeros() { return enfermeros; }

    public void setEnfermeros(List<Enfermero> enfermeros) { this.enfermeros = enfermeros; }
}
