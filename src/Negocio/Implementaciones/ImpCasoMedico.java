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
    public List<CasoMedico> listarCasosMedicos() {
        return new ArrayList<>(casosMedicos);
    }

    @Override
    public void modificarCasoMedico(CasoMedico casoMedico) {
        for (int i = 0; i < casosMedicos.size(); i++) {
            if (casosMedicos.get(i).getId() == casoMedico.getId()) {
                casosMedicos.set(i, casoMedico);
                break;
            }
        }
    }

    @Override
    public void registrarCasoMedico(CasoMedico casoMedico) {
        // Implementación específica para registrar un caso médico
    }

    @Override
    public void guardarDatosCasoMedico() {
        // Implementación para guardar los datos de los casos médicos
    }

    @Override
    public void cargarDatosCasoMedico() {
        // Implementación para cargar los datos de los casos médicos
    }
}

