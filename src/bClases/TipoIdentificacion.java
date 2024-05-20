package bClases;

public class TipoIdentificacion {
    private Long id;
    private static Long idAux;
    private String codigo;
    private String nombre;

    public TipoIdentificacion(Long id, String codigo, String nombre) {
        this.id = idAux;
        this.codigo = codigo;
        this.nombre = nombre;
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
        TipoIdentificacion.idAux = idAux;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
