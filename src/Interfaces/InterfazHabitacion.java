package Interfaces;

import Negocio.Habitación;
import java.util.List;

public interface InterfazHabitacion {
    void agregarHabitacion(Habitación habitación);
    void eliminarHabitacion(long id);
    List<Habitación> listarHabitacion();
    void guardarDatosHabitacion();
    void cargarDatosHabitacion();
}
