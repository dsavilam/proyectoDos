package Negocio.Implementaciones;

import Negocio.Clases.Doctor;
import Negocio.Interfaces.InterfazDoctor;

import java.util.ArrayList;
import java.util.List;

public class ImpDoctor implements InterfazDoctor {
    private List<Doctor> doctores;

    public ImpDoctor() {
        this.doctores = new ArrayList<>();
    }

    @Override
    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    @Override
    public void eliminarDoctor(long id) {
        doctores.removeIf(d -> d.getId() == id);
    }

    @Override
    public List<Doctor> listarDoctor() {
        return new ArrayList<>(doctores);
    }

    @Override
    public void guardarDatosDoctor() {
        // Implementación para guardar los datos de los doctores
        // Esto podría involucrar escribir en un archivo o una base de datos
    }

    @Override
    public void cargarDatosDoctor() {
        // Implementación para cargar los datos de los doctores
        // Esto podría involucrar leer de un archivo o una base de datos
    }
}
