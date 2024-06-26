package Negocio.Clases;

public class Doctor extends Persona {
    private String especialidad;
    private String noMatricula;

    public Doctor(String nombre, String apellido, String noIdentificacion, TipoIdentificacion tipoIdentificacion, String especialidad, String noMatricula) {
        super(nombre, apellido, noIdentificacion, tipoIdentificacion);
        this.especialidad = especialidad;
        this.noMatricula = noMatricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNoMatricula() {
        return noMatricula;
    }

    public void setNoMatricula(String noMatricula) {
        this.noMatricula = noMatricula;
    }
}
