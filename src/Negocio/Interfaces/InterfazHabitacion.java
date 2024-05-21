package Negocio.Interfaces;

import Negocio.Clases.Habitacion;
import java.util.List;

public interface InterfazHabitacion {
    void agregarHabitacion(Habitacion habitacion);
    void eliminarHabitacion(long id);
    List<Habitacion> listarHabitacion();
    void guardarDatosHabitacion();
    void cargarDatosHabitacion();
}
