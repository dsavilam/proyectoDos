package Negocio.Interfaces;

import Negocio.Clases.Enfermero;
import Negocio.Clases.Paramedico;
import java.util.List;

public interface InterfazParamedico {
    void agregarParamedico(Paramedico paramedico);
    void eliminarParamedico(long id);
    List<Paramedico> listarParamedico();
    void modificarParamedico(Paramedico paramedico);
    void guardarDatosParamedico();
    void cargarDatosParamedico();
}
