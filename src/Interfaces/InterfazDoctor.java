package Interfaces;

import Negocio.Doctor;
import java.util.List;

public interface InterfazDoctor {
    void agregarDoctor(Doctor doctor);
    void matarDoctor(long id);
    List<Doctor> listarDoctor();
    void guardarDatosDoctor();
    void cargarDatosDoctor();
}
