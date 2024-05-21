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
    public List<Ambulancia> listarAmbulancias() {
        return new ArrayList<>(ambulancias);
    }

    @Override
    public void modificarAmbulancia(Ambulancia ambulancia) {
        for (int i = 0; i < ambulancias.size(); i++) {
            if (ambulancias.get(i).getId() == ambulancia.getId()) {
                ambulancias.set(i, ambulancia);
                break;
            }
        }
    }

    @Override
    public void guardarDatosAmbulancia() {
        // Implementación para guardar los datos de las ambulancias
    }

    @Override
    public void cargarDatosAmbulancia() {
        // Implementación para cargar los datos de las ambulancias
    }
}