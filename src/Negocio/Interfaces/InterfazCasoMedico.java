package Negocio.Interfaces;

import Negocio.Clases.CasoMedico;
import java.util.List;

public interface InterfazCasoMedico {
    void agregarCasoMedico(CasoMedico casoMedico);
    void eliminarCasoMedico(long id);
    List<CasoMedico> listarCasosMedicos();
    void modificarCasoMedico(CasoMedico casoMedico);
    void registrarCasoMedico(CasoMedico casoMedico);
    void guardarDatosCasoMedico();
    void cargarDatosCasoMedico();
}

