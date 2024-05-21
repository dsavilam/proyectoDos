package Interfaces;

import Negocio.CasoMedico;
import java.util.List;

public interface InterfazCasoMedico {
    void agregarCasoMedico(CasoMedico casoMedico);
    void eliminarCasoMedico (long id);
    List<CasoMedico> listarCasosEmergencia();
    void guardarDatosCasoMedico();
    void cargarDatosCasoMedico();
}
