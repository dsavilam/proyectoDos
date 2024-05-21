package Negocio.Interfaces;

import Negocio.Clases.Enfermero;
import Negocio.Clases.TipoIdentificacion;
import java.util.List;

public interface InterfazTipoIdentificacion {
    void agregarTipoIdentificacion(TipoIdentificacion tipoIdentificacion);
    void eliminarTipoIdentificacion(long id);
    List<TipoIdentificacion> listarTipoIdentificacion();
    void modificarTipoIdentificacion(TipoIdentificacion tipoIdentificacion);
    void guardarDatosTipoIdentificacion();
    void cargarDatosTipoIdentificacion();
}