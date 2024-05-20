package bClases;

public class Enfermero extends Persona{
    private boolean administrativo;

    public Enfermero(Long id, String nombre, String apellido, String noIdentificacion, boolean administrativo) {
        super(id, nombre, apellido, noIdentificacion);
        this.administrativo = administrativo;
    }

    public boolean isAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(boolean administrativo) {
        this.administrativo = administrativo;
    }
}
