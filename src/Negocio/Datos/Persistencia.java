package Negocio.Datos;

import Negocio.Clases.*;
import java.io.*;
import java.util.List;

//Creamos la clase para poder guardar los datos jaja
public class Persistencia {
    public static void guardarDatos(List<?> lista, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<?> cargarDatos(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<?>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
