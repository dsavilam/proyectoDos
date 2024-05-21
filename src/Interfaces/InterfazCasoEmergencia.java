package Interfaces;

import Negocio.CasoEmergencia;
import java.util.List;

public interface InterfazCasoEmergencia {
    void agregarCasoEmergencia(CasoEmergencia casoEmergencia);
    void eliminarCasoEmergencia(long id);
    List<CasoEmergencia> listarCasosEmergencia();
    void guardarDatosCasoEmergencia();
    void cargarDatosCasoEmergencia();
}

