package Negocio.Interfaces;

import Negocio.Clases.Paramedico;
import java.util.List;

public interface InterfazParamedico {
    void agregarParamedico(Paramedico paramedico);
    void eliminarParamedico(long id);
    List<Paramedico> listarParamedico();
    void guardarDatosParamedico();
    void cargarDatosParamedico();
}
