package Negocio.Implementaciones;

import Negocio.Clases.Doctor;
import Negocio.Datos.Persistencia;
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
    public List<Doctor> listarDoctores() {
        return new ArrayList<>(doctores);
    }

    @Override
    public void modificarDoctor(Doctor doctor) {
        for (int i = 0; i < doctores.size(); i++) {
            if (doctores.get(i).getId() == doctor.getId()) {
                doctores.set(i, doctor);
                break;
            }
        }
    }

    @Override
    public List<Doctor> filtrarDoctoresPorEspecialidad(String especialidad) {
        List<Doctor> resultado = new ArrayList<>();
        for (Doctor doctor : doctores) {
            if (doctor.getEspecialidad().equalsIgnoreCase(especialidad)) {
                resultado.add(doctor);
            }
        }
        return resultado;
    }

    @Override
    public void guardarDatosDoctor() {
        Persistencia.guardarDatos(doctores, "doctores.dat");
    }

    @Override
    public void cargarDatosDoctor() {
        doctores = (List<Doctor>) Persistencia.cargarDatos("doctores.dat");
    }
}