package Negocio.Implementaciones;

import Negocio.Clases.Ambulancia;
import Negocio.Datos.Persistencia;
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
        Persistencia.guardarDatos(ambulancias, "ambulancias.dat");
    }

    @Override
    public void cargarDatosAmbulancia() {
        ambulancias = (List<Ambulancia>) Persistencia.cargarDatos("ambulancias.dat");
    }

    @Override
    public Ambulancia obtenerAmbulanciaPorId(long idAmbulancia) {
        for (Ambulancia ambulancia : ambulancias) {
            if (ambulancia.getId() == idAmbulancia) {
                return ambulancia;
            }
        }
        return null; //Si no encuentra ni mierda
    }
}