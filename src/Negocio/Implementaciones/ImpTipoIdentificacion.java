package Negocio.Implementaciones;

import Negocio.Clases.Enfermero;
import Negocio.Clases.TipoIdentificacion;
import Negocio.Interfaces.InterfazTipoIdentificacion;

import java.util.ArrayList;
import java.util.List;

public class ImpTipoIdentificacion implements InterfazTipoIdentificacion {
    private List<TipoIdentificacion> tipoIdentificacionLista;

    public ImpTipoIdentificacion() {
        this.tipoIdentificacionLista = new ArrayList<>();
    }

    @Override
    public void agregarTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        tipoIdentificacionLista.add(tipoIdentificacion);
    }

    @Override
    public void eliminarTipoIdentificacion(long id) {
        tipoIdentificacionLista.removeIf(d -> d.getId() == id);
    }

    @Override
    public List<TipoIdentificacion> listarTipoIdentificacion() {
        return new ArrayList<>(tipoIdentificacionLista);
    }

    @Override
    public void modificarTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        for (int i = 0; i < tipoIdentificacionLista.size(); i++) {
            if (tipoIdentificacionLista.get(i).getId() == tipoIdentificacion.getId()) {
                tipoIdentificacionLista.set(i, tipoIdentificacion);
                break;
            }
        }
    }

    @Override
    public void guardarDatosTipoIdentificacion() {
        // Implementación para guardar los datos de los doctores
        // Esto podría involucrar escribir en un archivo o una base de datos
    }

    @Override
    public void cargarDatosTipoIdentificacion() {
        // Implementación para cargar los datos de los doctores
        // Esto podría involucrar leer de un archivo o una base de datos
    }
}
