package Negocio.Clases;

public class Ambulancia {
    private Long id;
    private static Long idAux;
    private String placa;
    private int capacidad;
    private float areaPaciente;

    public Ambulancia(String placa, int capacidad, float areaPaciente) {
        this.id = idAux;
        this.placa = placa;
        this.capacidad = capacidad;
        this.areaPaciente = areaPaciente;
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

    public static void setIdAux(Long idAux) { Ambulancia.idAux = idAux; }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getAreaPaciente() {
        return areaPaciente;
    }

    public void setAreaPaciente(float areaPaciente) {
        this.areaPaciente = areaPaciente;
    }
}
