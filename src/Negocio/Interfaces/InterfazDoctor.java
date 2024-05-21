package Negocio.Interfaces;

import Negocio.Clases.Doctor;
import java.util.List;

public interface InterfazDoctor {
    void agregarDoctor(Doctor doctor);
    void eliminarDoctor(long id);
    List<Doctor> listarDoctores();
    void modificarDoctor(Doctor doctor);
    List<Doctor> filtrarDoctoresPorEspecialidad(String especialidad);
    void guardarDatosDoctor();
    void cargarDatosDoctor();
}

