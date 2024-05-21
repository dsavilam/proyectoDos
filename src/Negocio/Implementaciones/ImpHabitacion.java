package Negocio.Implementaciones;

import Negocio.Clases.Habitacion;
import Negocio.Interfaces.InterfazHabitacion;

import java.util.ArrayList;
import java.util.List;

public class ImpHabitacion implements InterfazHabitacion{
    private List<Habitacion> habitaciones;

    public ImpHabitacion () {
        this.habitaciones = new ArrayList<>();
    }

    @Override
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    @Override
    public void eliminarHabitacion(long id) {
        habitaciones.removeIf(c -> c.getId() == id);
    }

    @Override
    public List<Habitacion> listarHabitacion() {
        return new ArrayList<>(habitaciones);
    }

    @Override
    public void guardarDatosHabitacion() {
        // Implementación para guardar los datos de los casos médicos
        // Esto podría involucrar escribir en un archivo o una base de datos
    }

    @Override
    public void cargarDatosHabitacion() {
        // Implementación para cargar los datos de los casos médicos
        // Esto podría involucrar leer de un archivo o una base de datos
    }
}
