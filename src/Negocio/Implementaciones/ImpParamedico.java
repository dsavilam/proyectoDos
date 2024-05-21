package Negocio.Implementaciones;

import Negocio.Clases.Paramedico;
import Negocio.Datos.Persistencia;
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
    public void modificarParamedico(Paramedico paramedico) {
        for (int i = 0; i < paramedicos.size(); i++) {
            if (paramedicos.get(i).getId() == paramedico.getId()) {
                paramedicos.set(i, paramedico);
                break;
            }
        }
    }

    @Override
    public void guardarDatosParamedico() {
        Persistencia.guardarDatos(paramedicos, "paramedicos.dat");
    }

    @Override
    public void cargarDatosParamedico() {
        paramedicos = (List<Paramedico>) Persistencia.cargarDatos("paramedicos.dat");
    }

}
