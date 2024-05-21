package Negocio.Interfaces;

import Negocio.Clases.Paramedico;
import java.util.List;

public interface InterfazParamedico {
    void agregarCasoEmergencia(Paramedico paramedico);
    void matarParamedico(long id);
    List<Paramedico> listarParamedico();
    void guardarDatosParamedico();
    void cargarDatosParamedico();
}
