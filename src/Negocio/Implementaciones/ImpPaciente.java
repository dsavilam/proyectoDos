package Negocio.Implementaciones;

import Negocio.Clases.Paciente;
import Negocio.Datos.Persistencia;
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
    public void modificarPaciente(Paciente paciente) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getId() == paciente.getId()) {
                pacientes.set(i, paciente);
                break;
            }
        }
    }

    @Override
    public void guardarDatosPaciente() {
        Persistencia.guardarDatos(pacientes, "pacientes.dat");
    }

    @Override
    public void cargarDatosPaciente() {
        pacientes = (List<Paciente>) Persistencia.cargarDatos("pacientes.dat");
    }

}
