package Negocio.Implementaciones;

import Negocio.Clases.Ambulancia;
import Negocio.Interfaces.InterfazAmbulancia;

import java.util.ArrayList;
import java.util.List;

public class ImpAmbulancia implements InterfazAmbulancia {
    private List<Ambulancia> ambulancias;

    public ImpAmbulancia() {
        this.ambulancias = new ArrayList<>();
    }

    @Override
    public void agregarAmbulancia(Ambulancia ambulancia) {
        ambulancias.add(ambulancia);
    }

    @Override
    public void eliminarAmbulancia(long id) {
        ambulancias.removeIf(a -> a.getId() == id);
    }

    @Override
    public List<Ambulancia> listarAmbulancia() {
        return new ArrayList<>(ambulancias);
    }

    @Override
    public void guardarDatosAmbulancia() {
        // Implementación para guardar los datos de las ambulancias
        // Esto podría involucrar escribir en un archivo o una base de datos
    }

    @Override
    public void cargarDatosAmbulancia() {
        // Implementación para cargar los datos de las ambulancias
        // Esto podría involucrar leer de un archivo o una base de datos
    }
}