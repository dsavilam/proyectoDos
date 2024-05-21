package Negocio.Clases;

public class Paramedico extends Persona {
    private boolean lider;
    private boolean sabeConducir;

    public Paramedico(String nombre, String apellido, String noIdentificacion, TipoIdentificacion tipoIdentificacion, boolean lider, boolean sabeConducir) {
        super(nombre, apellido, noIdentificacion, tipoIdentificacion);
        this.lider = lider;
        this.sabeConducir = sabeConducir;
    }

    public boolean isLider() {
        return lider;
    }

    public void setLider(boolean lider) {
        this.lider = lider;
    }

    public boolean isSabeConducir() {
        return sabeConducir;
    }

    public void setSabeConducir(boolean sabeConducir) {
        this.sabeConducir = sabeConducir;
    }
}
