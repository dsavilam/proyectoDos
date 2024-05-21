package Negocio.Interfaces;

import Negocio.Clases.CasoEmergencia;
import java.util.List;

public interface InterfazCasoEmergencia {
    void agregarCasoEmergencia(CasoEmergencia casoEmergencia);
    void eliminarCasoEmergencia(long id);
    List<CasoEmergencia> listarCasosEmergencia();
    void modificarCasoEmergencia(CasoEmergencia casoEmergencia);
    void registrarCasoEmergencia(CasoEmergencia casoEmergencia);
    void guardarDatosCasoEmergencia();
    void cargarDatosCasoEmergencia();
}


