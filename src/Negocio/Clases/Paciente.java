package Negocio.Clases;

public class Paciente extends Persona {
    private String sintomas;
    private Habitacion habitacion;

    public Paciente(String nombre, String apellido, String noIdentificacion, TipoIdentificacion tipoIdentificacion, String sintomas) {
        super(nombre, apellido, noIdentificacion, tipoIdentificacion);
        this.sintomas = sintomas;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
