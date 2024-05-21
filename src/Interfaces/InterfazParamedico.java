package Interfaces;

import Negocio.Paramedico;
import java.util.List;

public interface InterfazParamedico {
    void agregarCasoEmergencia(Paramedico paramedico);
    void matarParamedico(long id);
    List<Paramedico> listarParamedico();
    void guardarDatosParamedico();
    void cargarDatosParamedico();
}
