package Negocio.Implementaciones;

import Negocio.Clases.Habitacion;
import Negocio.Datos.Persistencia;
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
    public void modificarHabitacion(Habitacion habitacion) {
        for (int i = 0; i < habitaciones.size(); i++) {
            if (habitaciones.get(i).getId() == habitacion.getId()) {
                habitaciones.set(i, habitacion);
                break;
            }
        }
    }

    @Override
    public void guardarDatosHabitacion() {
        Persistencia.guardarDatos(habitaciones, "habitaciones.dat");
    }

    @Override
    public void cargarDatosHabitacion() {
        habitaciones = (List<Habitacion>) Persistencia.cargarDatos("habitaciones.dat");
    }

}
