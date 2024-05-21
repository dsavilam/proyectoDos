package Interfaces;

import Negocio.Ambulancia;
import java.util.List;

public interface InterfazAmbulancia {
    void agregarAmbulancia(Ambulancia ambulancia);
    void eliminarAmbulancia(long id);
    List<Ambulancia> listarAmbulancia();
    void guardarDatosAmbulancia();
    void cargarDatosAmbulancia();
}
