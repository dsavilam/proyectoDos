package Negocio.Interfaces;

import Negocio.Clases.Doctor;
import Negocio.Clases.Enfermero;
import java.util.List;

public interface InterfazEnfermero {
    void agregarEnfermero(Enfermero enfermero);
    void eliminarEnfermero(long id);
    List<Enfermero> listarEnfermero();
    void modificarEnfermero(Enfermero enfermero);
    void guardarDatosEnfermero();
    void cargarDatosEnfermero();
}
