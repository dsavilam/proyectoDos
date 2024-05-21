package Negocio.Interfaces;

import Negocio.Clases.Enfermero;
import Negocio.Clases.Paciente;
import java.util.List;

public interface InterfazPaciente {
    void agregarPaciente(Paciente paciente);
    void eliminarPaciente(long id);
    List<Paciente> listarPaciente();
    void modificarPaciente(Paciente paciente);
    void guardarDatosPaciente();
    void cargarDatosPaciente();
}
