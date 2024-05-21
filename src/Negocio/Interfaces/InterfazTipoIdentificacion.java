package Negocio.Interfaces;

import Negocio.Clases.TipoIdentificacion;
import java.util.List;

public interface InterfazTipoIdentificacion {
    void agregarTipoIdentificacion(TipoIdentificacion tipoIdentificacion);
    void eliminarTipoIdentificacion(long id);
    List<TipoIdentificacion> listarTipoIdentificación();
    void guardarDatosTipoIdentificacion();
    void cargarDatosTipoIdentificacion();
}