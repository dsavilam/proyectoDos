package Negocio.Implementaciones;

import Negocio.Clases.Paramedico;
import Negocio.Interfaces.InterfazParamedico;

import java.util.ArrayList;
import java.util.List;

public class ImpParamedico implements InterfazParamedico {
    private List<Paramedico> paramedicos;

    public ImpParamedico() {
        this.paramedicos = new ArrayList<>();
    }

    @Override
    public void agregarParamedico(Paramedico paramedico) {
        paramedicos.add(paramedico);
    }

    @Override
    public void eliminarParamedico(long id) {
        paramedicos.removeIf(d -> d.getId() == id);
    }

    @Override
    public List<Paramedico> listarParamedico() {
        return new ArrayList<>(paramedicos);
    }

    @Override
    public void guardarDatosParamedico() {
        // Implementación para guardar los datos de los doctores
        // Esto podría involucrar escribir en un archivo o una base de datos
    }

    @Override
    public void cargarDatosParamedico() {
        // Implementación para cargar los datos de los doctores
        // Esto podría involucrar leer de un archivo o una base de datos
    }
}
