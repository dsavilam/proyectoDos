package Negocio.Interfaces;

import Negocio.Clases.Doctor;
import java.util.List;

public interface InterfazDoctor {
    void agregarDoctor(Doctor doctor);
    void matarDoctor(long id);
    List<Doctor> listarDoctor();
    void guardarDatosDoctor();
    void cargarDatosDoctor();
}