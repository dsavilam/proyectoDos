package Negocio.Implementaciones;

import Negocio.Clases.CasoMedico;
import Negocio.Interfaces.InterfazCasoMedico;

import java.util.ArrayList;
import java.util.List;

public class ImpCasoMedico implements InterfazCasoMedico {
    private List<CasoMedico> casosMedicos;

    public ImpCasoMedico() {
        this.casosMedicos = new ArrayList<>();
    }

    @Override
    public void agregarCasoMedico(CasoMedico casoMedico) {
        casosMedicos.add(casoMedico);
    }

    @Override
    public void eliminarCasoMedico(long id) {
        casosMedicos.removeIf(c -> c.getId() == id);
    }

    @Override
    public List<CasoMedico> listarCasosEmergencia() {
        return new ArrayList<>(casosMedicos);
    }

    @Override
    public void guardarDatosCasoMedico() {
        // Implementación para guardar los datos de los casos médicos
        // Esto podría involucrar escribir en un archivo o una base de datos
    }

    @Override
    public void cargarDatosCasoMedico() {
        // Implementación para cargar los datos de los casos médicos
        // Esto podría involucrar leer de un archivo o una base de datos
    }
}

