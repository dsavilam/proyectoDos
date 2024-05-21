package Negocio.Clases;

public class Enfermero extends Persona {
    private boolean administrativo;

    public Enfermero(String nombre, String apellido, String noIdentificacion, TipoIdentificacion tipoIdentificacion, boolean administrativo) {
        super(nombre, apellido, noIdentificacion, tipoIdentificacion);
        this.administrativo = administrativo;
    }

    public boolean isAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(boolean administrativo) {
        this.administrativo = administrativo;
    }
}
