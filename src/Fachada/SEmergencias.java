package Fachada;

import Negocio.Datos.LectorDatos;
import Negocio.Clases.*;
import Negocio.Implementaciones.*;
import Negocio.Interfaces.*;
import Negocio.Excepciones.ObjetoNoEncontradoException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SEmergencias {
    private InterfazDoctor impDoctor;
    private InterfazCasoEmergencia impCasoEmergencia;
    private InterfazCasoMedico impCasoMedico;
    private InterfazAmbulancia impAmbulancia;
    private InterfazTipoIdentificacion impTipoIdentificacion;
    private InterfazParamedico impParamedico;
    private InterfazEnfermero impEnfermero;
    private List<Paciente> pacientesGenerales;  // Lista general de pacientes
    private List<Habitacion> habitacionesDisponibles;  // Lista general de habitaciones disponibles

    public SEmergencias() {
        this.impDoctor = new ImpDoctor();
        this.impCasoEmergencia = new ImpCasoEmergencia();
        this.impCasoMedico = new ImpCasoMedico();
        this.impAmbulancia = new ImpAmbulancia();
        this.impTipoIdentificacion = new ImpTipoIdentificacion();
        this.impParamedico = new ImpParamedico();
        this.impEnfermero = new ImpEnfermero();
        this.pacientesGenerales = new ArrayList<>();
        this.habitacionesDisponibles = new ArrayList<>();
    }

    public void cargarDatosDesdeArchivo(String archivo) {
        LectorDatos lector = new LectorDatos();
        lector.cargarDatosDesdeArchivo(archivo);
    }

    // Métodos para manejar doctores
    public void agregarDoctor(Doctor doctor) {
        impDoctor.agregarDoctor(doctor);
    }

    public void eliminarDoctor(long id) throws ObjetoNoEncontradoException {
        try {
            impDoctor.eliminarDoctor(id);
        } catch (Exception e) {
            throw new ObjetoNoEncontradoException("Doctor no encontrado");
        }
    }

    public List<Doctor> listarDoctores() {
        return impDoctor.listarDoctores();
    }

    public void modificarDoctor(Doctor doctor) {
        impDoctor.modificarDoctor(doctor);
    }

    public List<Doctor> filtrarDoctoresPorEspecialidad(String especialidad) {
        return impDoctor.filtrarDoctoresPorEspecialidad(especialidad);
    }

    // Métodos para manejar casos de emergencia
    public void agregarCasoEmergencia(CasoEmergencia casoEmergencia) {
        impCasoEmergencia.agregarCasoEmergencia(casoEmergencia);
    }

    public void eliminarCasoEmergencia(long id) throws ObjetoNoEncontradoException {
        try {
            impCasoEmergencia.eliminarCasoEmergencia(id);
        } catch (Exception e) {
            throw new ObjetoNoEncontradoException("Caso de emergencia no encontrado");
        }
    }

    public List<CasoEmergencia> listarCasosEmergencia() {
        return impCasoEmergencia.listarCasosEmergencia();
    }

    public void modificarCasoEmergencia(CasoEmergencia casoEmergencia) {
        impCasoEmergencia.modificarCasoEmergencia(casoEmergencia);
    }

    public void registrarCasoEmergencia(String direccion, String descripcion, LocalDate fecha, List<Paramedico> paramedicos, Ambulancia ambulancia, List<Paciente> pacientes) {
        CasoEmergencia casoEmergencia = new CasoEmergencia(direccion, descripcion, fecha);
        casoEmergencia.setParamedicos(paramedicos);
        casoEmergencia.setAmbulancia(ambulancia);
        impCasoEmergencia.agregarCasoEmergencia(casoEmergencia);

        for (Paciente paciente : pacientes) {
            // Registro de los pacientes en el sistema
            pacientesGenerales.add(paciente);
        }

        // Relacionar los pacientes al caso de emergencia
        casoEmergencia.setPacientes(pacientes);
        impCasoEmergencia.modificarCasoEmergencia(casoEmergencia);
    }

    // Métodos para manejar casos médicos
    public void agregarCasoMedico(CasoMedico casoMedico) {
        impCasoMedico.agregarCasoMedico(casoMedico);
    }

    public void eliminarCasoMedico(long id) throws ObjetoNoEncontradoException {
        try {
            impCasoMedico.eliminarCasoMedico(id);
        } catch (Exception e) {
            throw new ObjetoNoEncontradoException("Caso médico no encontrado");
        }
    }

    public List<CasoMedico> listarCasosMedicos() {
        return impCasoMedico.listarCasosMedicos();
    }

    public void modificarCasoMedico(CasoMedico casoMedico) {
        impCasoMedico.modificarCasoMedico(casoMedico);
    }

    public void registrarCasoMedico(List<Paciente> pacientes, Doctor doctor) {
        CasoMedico casoMedico = new CasoMedico(LocalDate.now(), "Descripción del caso", doctor, pacientes);
        impCasoMedico.agregarCasoMedico(casoMedico);

        // Asignar habitaciones disponibles a los pacientes
        for (Paciente paciente : pacientes) {
            if (!habitacionesDisponibles.isEmpty()) {
                Habitacion habitacion = habitacionesDisponibles.remove(0);  // Asignar la primera habitación disponible
                paciente.setHabitacion(habitacion);  // Asignar la habitación al paciente
            } else {
                System.out.println("No hay habitaciones disponibles para el paciente " + paciente.getNombre());
            }
        }

        // Asignar el médico al caso
        casoMedico.setDoctor(doctor);
        impCasoMedico.modificarCasoMedico(casoMedico);
    }

    // Métodos para manejar ambulancias
    public void agregarAmbulancia(Ambulancia ambulancia) {
        impAmbulancia.agregarAmbulancia(ambulancia);
    }

    public void eliminarAmbulancia(long id) throws ObjetoNoEncontradoException {
        try {
            impAmbulancia.eliminarAmbulancia(id);
        } catch (Exception e) {
            throw new ObjetoNoEncontradoException("Ambulancia no encontrada");
        }
    }

    public List<Ambulancia> listarAmbulancias() {
        return impAmbulancia.listarAmbulancias();
    }

    public void modificarAmbulancia(Ambulancia ambulancia) {
        impAmbulancia.modificarAmbulancia(ambulancia);
    }

    // Métodos para guardar y cargar datos
    public void guardarDatos() {
        impDoctor.guardarDatosDoctor();
        impCasoEmergencia.guardarDatosCasoEmergencia();
        impCasoMedico.guardarDatosCasoMedico();
        impAmbulancia.guardarDatosAmbulancia();
    }

    public void cargarDatos() {
        impDoctor.cargarDatosDoctor();
        impCasoEmergencia.cargarDatosCasoEmergencia();
        impCasoMedico.cargarDatosCasoMedico();
        impAmbulancia.cargarDatosAmbulancia();
    }

    // Método para el menú interactivo
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar Doctor");
            System.out.println("2. Eliminar Doctor");
            System.out.println("3. Listar Doctores");
            System.out.println("4. Modificar Doctor");
            System.out.println("5. Filtrar Doctores por Especialidad");
            System.out.println("6. Registrar Caso de Emergencia");
            System.out.println("7. Registrar Caso Médico");
            System.out.println("8. Guardar Datos");
            System.out.println("9. Cargar Datos");
            System.out.println("10. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (opcion) {
                case 1:
                    // Implementar agregar doctor
                    System.out.println("Ingrese el nombre del doctor:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el apellido del doctor:");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingrese el número de identificación del doctor:");
                    String noIdentificacion = scanner.nextLine();
                    System.out.println("Ingrese el tipo de identificación del doctor:");
                    String tipoIdentificacionStr = scanner.nextLine();
                    TipoIdentificacion tipoIdentificacion = new TipoIdentificacion(tipoIdentificacionStr, "Descripción del tipo"); // Simple implementación
                    System.out.println("Ingrese la especialidad del doctor:");
                    String especialidad = scanner.nextLine();
                    System.out.println("Ingrese el número de matrícula del doctor:");
                    String noMatricula = scanner.nextLine();
                    Doctor doctor = new Doctor(nombre, apellido, noIdentificacion, tipoIdentificacion, especialidad, noMatricula);
                    agregarDoctor(doctor);
                    System.out.println("Doctor agregado exitosamente.");
                    break;
                case 2:
                    // Implementar eliminar doctor
                    System.out.println("Ingrese el ID del doctor a eliminar:");
                    long idEliminarDoctor = scanner.nextLong();
                    try {
                        eliminarDoctor(idEliminarDoctor);
                        System.out.println("Doctor eliminado exitosamente.");
                    } catch (ObjetoNoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    // Implementar listar doctores
                    List<Doctor> doctores = listarDoctores();
                    for (Doctor d : doctores) {
                        System.out.println(d);
                    }
                    break;
                case 4:
                    // Implementar modificar doctor
                    System.out.println("Ingrese el ID del doctor a modificar:");
                    long idModificarDoctor = scanner.nextLong();
                    scanner.nextLine();  // Consume newline
                    System.out.println("Ingrese el nuevo nombre del doctor:");
                    String nuevoNombre = scanner.nextLine();
                    System.out.println("Ingrese el nuevo apellido del doctor:");
                    String nuevoApellido = scanner.nextLine();
                    System.out.println("Ingrese el nuevo número de identificación del doctor:");
                    String nuevoNoIdentificacion = scanner.nextLine();
                    System.out.println("Ingrese el nuevo tipo de identificación del doctor:");
                    String nuevoTipoIdentificacionStr = scanner.nextLine();
                    TipoIdentificacion nuevoTipoIdentificacion = new TipoIdentificacion(nuevoTipoIdentificacionStr, "Descripción del nuevo tipo"); // Simple implementación
                    System.out.println("Ingrese la nueva especialidad del doctor:");
                    String nuevaEspecialidad = scanner.nextLine();
                    System.out.println("Ingrese el nuevo número de matrícula del doctor:");
                    String nuevoNoMatricula = scanner.nextLine();
                    Doctor doctorModificado = new Doctor(nuevoNombre, nuevoApellido, nuevoNoIdentificacion, nuevoTipoIdentificacion, nuevaEspecialidad, nuevoNoMatricula);
                    doctorModificado.setId(idModificarDoctor);
                    modificarDoctor(doctorModificado);
                    System.out.println("Doctor modificado exitosamente.");
                    break;
                case 5:
                    // Implementar filtrar doctores por especialidad
                    System.out.println("Ingrese la especialidad por la que desea filtrar:");
                    String especialidadFiltrar = scanner.nextLine();
                    List<Doctor> doctoresFiltrados = filtrarDoctoresPorEspecialidad(especialidadFiltrar);
                    for (Doctor d : doctoresFiltrados) {
                        System.out.println(d);
                    }
                    break;
                case 6:
                    // Implementar registrar caso de emergencia
                    System.out.println("Ingrese la dirección de la emergencia:");
                    String direccion = scanner.nextLine();
                    System.out.println("Ingrese la descripción de la emergencia:");
                    String descripcion = scanner.nextLine();
                    System.out.println("Ingrese la fecha de la emergencia (YYYY-MM-DD):");
                    LocalDate fecha = LocalDate.parse(scanner.nextLine());
                    System.out.println("Ingrese los IDs de los paramédicos que atenderán la emergencia (separados por coma):");
                    String[] paramedicoIds = scanner.nextLine().split(",");
                    List<Paramedico> paramedicos = new ArrayList<>();
                    for (String id : paramedicoIds) {
                        paramedicos.add(impParamedico.obtenerParamedicoPorId(Long.parseLong(id)));
                    }
                    System.out.println("Ingrese el ID de la ambulancia que se usará:");
                    long idAmbulancia = scanner.nextLong();
                    scanner.nextLine();  // Consume newline
                    Ambulancia ambulancia = impAmbulancia.obtenerAmbulanciaPorId(idAmbulancia);
                    List<Paciente> pacientes = new ArrayList<>();
                    System.out.println("Ingrese el número de pacientes a registrar:");
                    int numPacientes = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    for (int i = 0; i < numPacientes; i++) {
                        System.out.println("Ingrese el nombre del paciente:");
                        String nombrePaciente = scanner.nextLine();
                        System.out.println("Ingrese el apellido del paciente:");
                        String apellidoPaciente = scanner.nextLine();
                        System.out.println("Ingrese el número de identificación del paciente:");
                        String noIdentificacionPaciente = scanner.nextLine();
                        System.out.println("Ingrese el tipo de identificación del paciente:");
                        String tipoIdentificacionPacienteStr = scanner.nextLine();
                        TipoIdentificacion tipoIdentificacionPaciente = new TipoIdentificacion(tipoIdentificacionPacienteStr, "Descripción del tipo"); // Simple implementación
                        Paciente paciente = new Paciente(nombrePaciente, apellidoPaciente, noIdentificacionPaciente, tipoIdentificacionPaciente);
                        pacientes.add(paciente);
                    }
                    registrarCasoEmergencia(direccion, descripcion, fecha, paramedicos, ambulancia, pacientes);
                    System.out.println("Caso de emergencia registrado exitosamente.");
                    break;
                case 7:
                    // Implementar registrar caso médico
                    List<Paciente> pacientesCasoMedico = new ArrayList<>();
                    System.out.println("Ingrese el número de pacientes a registrar en el caso médico:");
                    int numPacientesCasoMedico = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    for (int i = 0; i < numPacientesCasoMedico; i++) {
                        System.out.println("Ingrese el nombre del paciente:");
                        String nombrePaciente = scanner.nextLine();
                        System.out.println("Ingrese el apellido del paciente:");
                        String apellidoPaciente = scanner.nextLine();
                        System.out.println("Ingrese el número de identificación del paciente:");
                        String noIdentificacionPaciente = scanner.nextLine();
                        System.out.println("Ingrese el tipo de identificación del paciente:");
                        String tipoIdentificacionPacienteStr = scanner.nextLine();
                        TipoIdentificacion tipoIdentificacionPaciente = new TipoIdentificacion(tipoIdentificacionPacienteStr, "Descripción del tipo"); // Simple implementación
                        String sintomas = scanner.nextLine();
                        Paciente paciente = new Paciente(nombrePaciente, apellidoPaciente, noIdentificacionPaciente, tipoIdentificacionPaciente, sintomas);
                        pacientesCasoMedico.add(paciente);
                    }
                    System.out.println("Ingrese el ID del doctor que se encargará del caso médico:");
                    long idDoctorCasoMedico = scanner.nextLong();
                    scanner.nextLine();  // Consume newline
                    long idDoctorCasoMedico = idDoctorCasoMedico;
                    Doctor doctorCasoMedico = Doctor.getIdAux() (idDoctorCasoMedico1);
                    registrarCasoMedico(pacientesCasoMedico, doctorCasoMedico);
                    System.out.println("Caso médico registrado exitosamente.");
                    break;
                case 8:
                    // Implementar guardar datos
                    guardarDatos();
                    System.out.println("Datos guardados exitosamente.");
                    break;
                case 9:
                    // Implementar cargar datos
                    cargarDatos();
                    System.out.println("Datos cargados exitosamente.");
                    break;
                case 10:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}



