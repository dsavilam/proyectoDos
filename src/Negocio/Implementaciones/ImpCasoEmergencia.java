package Negocio.Implementaciones;

import Negocio.Clases.CasoEmergencia;
import Negocio.Interfaces.InterfazCasoEmergencia;
import java.util.ArrayList;
import java.util.List;

public class ImpCasoEmergencia implements InterfazCasoEmergencia {
    private List<CasoEmergencia> casosEmergencia;

    public ImpCasoEmergencia() {
        this.casosEmergencia = new ArrayList<>();
    }

    @Override
    public void agregarCasoEmergencia(CasoEmergencia casoEmergencia) {
        casosEmergencia.add(casoEmergencia);
    }

    @Override
    public void eliminarCasoEmergencia(long id) {
        casosEmergencia.removeIf(c -> c.getId() == id);
    }

    @Override
    public List<CasoEmergencia> listarCasosEmergencia() {
        return new ArrayList<>(casosEmergencia);
    }

    @Override
    public void modificarCasoEmergencia(CasoEmergencia casoEmergencia) {
        for (int i = 0; i < casosEmergencia.size(); i++) {
            if (casosEmergencia.get(i).getId() == casoEmergencia.getId()) {
                casosEmergencia.set(i, casoEmergencia);
                break;
            }
        }
    }

    @Override
    public void registrarCasoEmergencia(CasoEmergencia casoEmergencia) {
        // Implementación específica para registrar un caso de emergencia
    }

    @Override
    public void guardarDatosCasoEmergencia() {
        // Implementación para guardar los datos de los casos de emergencia
    }

    @Override
    public void cargarDatosCasoEmergencia() {
        // Implementación para cargar los datos de los casos de emergencia
    }
}
