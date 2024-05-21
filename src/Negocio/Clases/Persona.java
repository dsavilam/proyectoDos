package Negocio.Clases;

public abstract class Persona {
    protected Long id;
    protected static Long idAux;
    protected String nombre;
    protected String apellido;
    protected String noIdentificacion;
    protected TipoIdentificacion tipoIdentificacion;

    public Persona(String nombre, String apellido, String noIdentificacion, TipoIdentificacion tipoIdentificacion) {
        this.id = idAux;
        this.nombre = nombre;
        this.apellido = apellido;
        this.noIdentificacion = noIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        idAux++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNoIdentificacion() {
        return noIdentificacion;
    }

    public void setNoIdentificacion(String noIdentificacion) {
        this.noIdentificacion = noIdentificacion;
    }

    public TipoIdentificacion getTipoIdentificacion() { return tipoIdentificacion; }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) { this.tipoIdentificacion = tipoIdentificacion; }
}
