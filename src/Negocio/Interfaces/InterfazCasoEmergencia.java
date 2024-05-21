package Negocio.Interfaces;

import Negocio.Clases.CasoEmergencia;
import java.util.List;

public interface InterfazCasoEmergencia {
    void agregarCasoEmergencia(CasoEmergencia casoEmergencia);
    void eliminarCasoEmergencia(long id);
    List<CasoEmergencia> listarCasosEmergencia();
    void guardarDatosCasoEmergencia();
    void cargarDatosCasoEmergencia();
}

