package negocio;

public class Enfermero extends Persona{
    private boolean administrativo;

    public Enfermero(Long id, String nombre, String apellido, String noIdentificacion, TipoIdentificacion tipoIdentificacion, boolean administrativo) {
        super(id, nombre, apellido, noIdentificacion, tipoIdentificacion);
        this.administrativo = administrativo;
    }

    public boolean isAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(boolean administrativo) {
        this.administrativo = administrativo;
    }
}
