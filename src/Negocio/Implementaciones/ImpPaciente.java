package Negocio.Implementaciones;

import Negocio.Clases.Paciente;
import Negocio.Interfaces.InterfazPaciente;

import java.util.ArrayList;
import java.util.List;

public class ImpPaciente implements InterfazPaciente {
    private List<Paciente> pacientes;

    public ImpPaciente() {
        this.pacientes = new ArrayList<>();
    }

    @Override
    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    @Override
    public void eliminarPaciente(long id) {
        pacientes.removeIf(d -> d.getId() == id);
    }

    @Override
    public List<Paciente> listarPaciente() {
        return new ArrayList<>(pacientes);
    }

    @Override
    public void guardarDatosPaciente() {
        // Implementación para guardar los datos de los doctores
        // Esto podría involucrar escribir en un archivo o una base de datos
    }

    @Override
    public void cargarDatosPaciente() {
        // Implementación para cargar los datos de los doctores
        // Esto podría involucrar leer de un archivo o una base de datos
    }
}
