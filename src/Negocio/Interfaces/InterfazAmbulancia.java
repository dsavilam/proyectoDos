package Negocio.Interfaces;

import Negocio.Clases.Ambulancia;
import java.util.List;

public interface InterfazAmbulancia {
    void agregarAmbulancia(Ambulancia ambulancia);
    void eliminarAmbulancia(long id);
    List<Ambulancia> listarAmbulancias();
    void modificarAmbulancia(Ambulancia ambulancia);
    void guardarDatosAmbulancia();
    void cargarDatosAmbulancia();
}
