package Negocio.Interfaces;

import Negocio.Clases.Habitación;
import java.util.List;

public interface InterfazHabitacion {
    void agregarHabitacion(Habitación habitación);
    void eliminarHabitacion(long id);
    List<Habitación> listarHabitacion();
    void guardarDatosHabitacion();
    void cargarDatosHabitacion();
}
