package Negocio.Implementaciones;

import Negocio.Clases.Enfermero;
import Negocio.Datos.Persistencia;
import Negocio.Interfaces.InterfazEnfermero;

import java.util.ArrayList;
import java.util.List;

public class ImpEnfermero implements InterfazEnfermero{
    private List<Enfermero> enfermeros;

    public ImpEnfermero () {
        this.enfermeros = new ArrayList<>();
    }

    @Override
    public void agregarEnfermero(Enfermero enfermero) {
        enfermeros.add(enfermero);
    }

    @Override
    public void eliminarEnfermero(long id) {
        enfermeros.removeIf(c -> c.getId() == id);
    }

    @Override
    public List<Enfermero> listarEnfermero() {
        return new ArrayList<>(enfermeros);
    }

    @Override
    public void modificarEnfermero(Enfermero enfermero) {
        for (int i = 0; i < enfermeros.size(); i++) {
            if (enfermeros.get(i).getId() == enfermero.getId()) {
                enfermeros.set(i, enfermero);
                break;
            }
        }
    }

    @Override
    public void guardarDatosEnfermero() {
        Persistencia.guardarDatos(enfermeros, "enfermeros.dat");
    }

    @Override
    public void cargarDatosEnfermero() {
        enfermeros = (List<Enfermero>) Persistencia.cargarDatos("enfermeros.dat");
    }

}
