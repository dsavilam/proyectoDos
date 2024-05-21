package Negocio.Implementaciones;

import Negocio.Clases.CasoEmergencia;
import Negocio.Interfaces.InterfazCasoEmergencia;

import java.util.ArrayList;
import java.util.List;

public class ImpCasoEmergencia implements InterfazCasoEmergencia {
    private List<CasoEmergencia> casosEmergencia;

    public ImpCasoEmergencia() {
        this.casosEmergencia = new ArrayList<>();
    }

    @Override
    public void agregarCasoEmergencia(CasoEmergencia casoEmergencia) {
        casosEmergencia.add(casoEmergencia);
    }

    @Override
    public void eliminarCasoEmergencia(long id) {
        casosEmergencia.removeIf(c -> c.getId() == id);
    }

    @Override
    public List<CasoEmergencia> listarCasosEmergencia() {
        return new ArrayList<>(casosEmergencia);
    }

    @Override
    public void guardarDatosCasoEmergencia() {
        // Implementación para guardar los datos de los casos de emergencia
        // Esto podría involucrar escribir en un archivo o una base de datos
    }

    @Override
    public void cargarDatosCasoEmergencia() {
        // Implementación para cargar los datos de los casos de emergencia
        // Esto podría involucrar leer de un archivo o una base de datos
    }
}
