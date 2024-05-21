package Interfaces;

import Negocio.Paciente;
import java.util.List;

public interface InterfazPaciente {
    void agregarPaciente(Paciente paciente);
    void matarPaciente(long id);
    List<Paciente> listarPaciente();
    void guardarDatosPaciente();
    void cargarDatosPaciente();
}
