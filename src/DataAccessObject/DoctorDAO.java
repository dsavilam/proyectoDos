package DataAccessObject;

import Negocio.Doctor;
import java.io.*;
import java.util.List;

public class DoctorDAO {
    private static final String fileName = "doctores.dat";

    public void guardarDoctores(List<Doctor> doctores) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(doctores);
        }
    }

    public List<Doctor> cargarDoctores() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Doctor>) ois.readObject();
        }
    }
}
