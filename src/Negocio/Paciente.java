package Negocio;

public class Paciente extends Persona{
    private String sintomas;

    public Paciente(Long id, String nombre, String apellido, String noIdentificacion, TipoIdentificacion tipoIdentificacion, String sintomas) {
        super(id, nombre, apellido, noIdentificacion, tipoIdentificacion);
        this.sintomas = sintomas;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
}
