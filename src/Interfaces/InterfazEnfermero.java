package Interfaces;

import Negocio.Enfermero;
import java.util.List;

public interface InterfazEnfermero {
    void agregarEnfermero(Enfermero enfermero);
    void matarEnfermero(long id);
    List<Enfermero> listarEnfermero();
    void guardarDatosEnfermero();
    void cargarDatosEnfermero();
}
