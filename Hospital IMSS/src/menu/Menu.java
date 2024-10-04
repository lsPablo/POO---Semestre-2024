package menu;

import consultas.Consulta;
import consultorios.Consultorio;
import hospital.Hospital;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;
import usuarios.utils.Rol;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Hospital hospital = new Hospital();
    private final String USUARIO_PACIENTE = "Juan123";
    private final String CONTRASENIA_PACIENTE = "12345*";
    private final String USUARIO_MEDICO = "ale123";
    private final String CONTRASENIA_MEDICO = "12345*";
    private final String USUARIO_ADMIN = "admin123";
    private final String CONTRASENIA_ADMIN = "12345*";

    public void login(){
        int intentosMaximos=5, intentosUsuario = 0;
        while(intentosUsuario < intentosMaximos){
            System.out.println("Bienvenido");
            System.out.println("Inicia sesion para continuar");
            System.out.println("Ingrese su usuario");
            String usuario = sc.next();

            System.out.println("Ingresa tu contrasenia");
            String contrasenia = sc.next();

            if (usuario.equals(this.USUARIO_PACIENTE)){
                if(contrasenia.equals(CONTRASENIA_PACIENTE)){
                    this.mostrarMenuPaciente();
                    intentosUsuario = 0;
                }
            } else if (usuario.equals(this.USUARIO_MEDICO)) {
                if(contrasenia.equals(CONTRASENIA_MEDICO)){
                    this.mostrarMenuMedico();
                    intentosUsuario = 0;
                }
                intentosUsuario = mostrarErrorInicioSesion(intentosUsuario);
            }

            if (usuario.equals(this.USUARIO_ADMIN) && contrasenia.equals(this.CONTRASENIA_ADMIN)){
                System.out.println("\nInicio de sesion exitoso");
                this.mostrarMenu();
            }else {
                intentosUsuario = mostrarErrorInicioSesion(intentosUsuario);
                //System.out.println("Usuario o contrasenia incorrecto");
                //intentosUsuaio ++;
            }
        }
        System.out.println("Intentos maximos permitidos alcanzados");
    }
    private int mostrarErrorInicioSesion(int intentosUsuario){
        System.out.println("\nUsuario o contrasenia incorrectos");
        return intentosUsuario +1;

    }

    private void mostrarMenuPaciente(){
        int opcion=0;
        while(opcion != 3){
            System.out.println("** Sistema Hospital **");
            System.out.println("Bienvenido Paciente");
            System.out.println("1. Ver mis consultas");
            System.out.println("2. Salir");

            System.out.println("Selecciona una opcion");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Has elegido ver consultas");

                    break;
                case 2:
                    return;
            }
        }
    }
    private void mostrarMenuMedico(){
        int opcion=0;
        while(opcion != 3) {
            System.out.println("** Sistema Hospital **");
            System.out.println("Bienvenido Medico");
            System.out.println("1. Ver mis consultas");
            System.out.println("2. Ver mis usuarios.pacientes");
            System.out.println("3. Consutar paciente");
            System.out.println("4. Salir");

            System.out.println("Selecciona una opcion");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Has elegido ver consultas");

                    break;
                case 2:
                    System.out.println("Has elegido ver usuarios.pacientes");

                    break;

                case 3:
                    System.out.println("Consultar Paciente");
                    System.out.println("Ingrese el ID del paciente a buscar: ");
                    sc.nextLine();
                    String idMP = sc.nextLine();
                    hospital.mostrarPacientePorId(idMP);

            }
        }
    }

    private void mostrarMenu() {

        int opcion = 0;

        while(opcion != 9) {
            System.out.println("Bienvenido al Hospital IMSS ");
            System.out.println("Introduzca la opción que desee:  ");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar medico");
            System.out.println("3. Registrar consultorio");
            System.out.println("4. Registrar consulta");
            System.out.println("5. Mostrar usuarios.pacientes");
            System.out.println("6. Mostrar médicos");
            System.out.println("7. Mostrar consultorios");
            System.out.println("8. Mostrar consultas");
            System.out.println("9. Mostrar paciente por id");
            System.out.println("10. Mostrar medico por id");
            System.out.println("11. Mostrar consultorio por id");
            System.out.println("12. Salir");
            System.out.println("13. Que extremidad quieres que te mochen :)");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("A elegido la opcion REGISTRAR PACIENTE");
                    sc.nextLine();
                    String id = hospital.generarIdPaciente();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre del paciente: ");
                    String nombre = sc.nextLine();
                    sc.nextLine();

                    System.out.println("Ingrese el apellido del paciente: ");
                    String apellido = sc.nextLine();
                    sc.nextLine();

                    System.out.println("Ingresa el ano de nacimiento del paciente: ");
                    int anoNacimiento = sc.nextInt();

                    System.out.println("Ingresa el mes de nacimiento");
                    int mesNacimiento = sc.nextInt();

                    System.out.println("Ingresa el dia de nacimiento");
                    int diaNacimiento = sc.nextInt();

                    LocalDate fechaNacimiento = LocalDate.of(anoNacimiento, mesNacimiento, diaNacimiento);

                    System.out.println("Ingrese el tipo de sangre del paciente: ");
                    String tipoSangre = sc.nextLine();
                    sc.nextLine();

                    System.out.println("Ingrese el sexo del paciente: ");
                    char sexo = sc.next().charAt(0);
                    sc.nextLine();

                    System.out.println("Ingrese el teléfono del paciente: ");
                    String telefono = sc.nextLine();
                    sc.nextLine();

                    boolean numeroTelefono = hospital.numeroPaciente(telefono);

                    while (!numeroTelefono) {
                        System.out.println("El telefono ingresado ya existe ");
                        System.out.println("Ingrese el teléfono del paciente: ");
                        telefono = sc.nextLine();
                        sc.nextLine();

                        numeroTelefono = hospital.numeroPaciente(telefono);
                    }
                    System.out.println("Ingresa la contrasenia");
                    String contraseniaPaciente = sc.nextLine();

                    Paciente paciente = new Paciente(id, nombre, apellido, fechaNacimiento, tipoSangre, sexo, telefono, contraseniaPaciente, Rol.PACIENTE);
                    hospital.registrarPaciente(paciente);

                    System.out.println("Paciente registrado exitosamente");
                    break;

                case 2:
                    System.out.println("A elegido la opcion REGISTRAR MEDICO");
                    sc.nextLine();


                    System.out.println("Ingrese el nombre del medico: ");
                    String nombreMedico = sc.nextLine();


                    System.out.println("Ingrese el apellido del medico: ");
                    String apellidoMedico = sc.nextLine();
                    sc.nextLine();

                    System.out.println("Ingresa el ano de nacimiento del medico: ");
                    int anoNacimientoMedico = sc.nextInt();

                    System.out.println("Ingresa el mes de nacimiento del medico");
                    int mesNacimientoMedico = sc.nextInt();

                    System.out.println("Ingresa el dia de nacimiento del medico");
                    int diaNacimientoMedico = sc.nextInt();
                    LocalDate fechaNacimientoMedico = LocalDate.of(anoNacimientoMedico, mesNacimientoMedico, diaNacimientoMedico);

                    System.out.println("Ingrese el telefono del medico: ");
                    String telefonoMedico = sc.nextLine();
                    sc.nextLine();

                    boolean numeroMedico = hospital.numeroMedico(telefonoMedico);
                    while (!numeroMedico) {
                        System.out.println("El telefono ingresado ya existe ");
                        System.out.println("Ingrese el teléfono del medico: ");
                        telefono = sc.nextLine();
                        sc.nextLine();

                        numeroMedico = hospital.numeroPaciente(telefono);
                    }


                    System.out.println("Ingrese el RFC del medico: ");
                    String rfcMedico = sc.nextLine();
                    sc.nextLine();

                    boolean rfcMedicoValido = hospital.rfcMedico(rfcMedico);
                    while (!rfcMedicoValido) {
                        System.out.println("El RFC ingresado ya existe ");
                        System.out.println("Ingrese el RFC del medico: ");
                        rfcMedico = sc.nextLine();
                        sc.nextLine();

                        rfcMedicoValido = hospital.rfcMedico(rfcMedico);
                    }

                    System.out.println("Ingresa la contrasenia");
                    String contraseniaMedico = sc.nextLine();

                    String idMedico = hospital.generarIdMedico(apellidoMedico, anoNacimientoMedico);

                    Medico medico = new Medico(idMedico, nombreMedico, apellidoMedico, fechaNacimientoMedico, telefonoMedico, rfcMedico, contraseniaMedico, Rol.MEDICO);
                    hospital.registrarMedico(medico);
                    break;

                case 3:
                    System.out.println("A elegido la opcion REGISTRAR CONSULTORIO");
                    sc.nextLine();
                    String idConsultorio = hospital.generarIdConsultorio();
                    sc.nextLine();

                    System.out.println("Ingrese el piso del consultorio: ");
                    int piso = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el numero del consultorio: ");
                    int numero = sc.nextInt();
                    sc.nextLine();

                    Consultorio consultorio = new Consultorio(idConsultorio, piso, numero);
                    hospital.registrarConsultorios(consultorio);
                    break;
                case 4:
                    System.out.println("Seleccionaste la opcion para registrar una consulta");
                    sc.nextLine();

                    String idConsulta = hospital.generarIdConsulta();

                    System.out.println("Ingrese el dia de la consulta: ");
                    int diaConsulta = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el mes de la consulta: ");
                    int mesConsulta = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el ano de la consulta: ");
                    int anoConsulta = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese la hora de la consulta: ");
                    int horaConsulta = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese los minutos de la consulta: ");
                    int minutosConsulta = sc.nextInt();
                    sc.nextLine();

                    LocalDateTime fechaConsulta = LocalDateTime.of(anoConsulta,mesConsulta,diaConsulta,horaConsulta,minutosConsulta);

                    while (!hospital.validarFechaConsulta(fechaConsulta)){
                        System.out.println("La fecha no puede estar en el pasado ");
                        System.out.println("Ingrese el dia de la consulta: ");
                        diaConsulta = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ingrese el mes de la consulta: ");
                        mesConsulta = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ingrese el ano de la consulta: ");
                        anoConsulta = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ingrese la hora de la consulta: ");
                        horaConsulta = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ingrese los minutos de la consulta: ");
                        minutosConsulta = sc.nextInt();
                        sc.nextLine();

                        fechaConsulta = LocalDateTime.of(anoConsulta,mesConsulta,diaConsulta,horaConsulta,minutosConsulta);
                    }

                    System.out.println("Ingrese el ID del paciente: ");
                    String idPaciente = sc.nextLine();
                    Paciente paciente1 = hospital.obtenerPacientePorId(idPaciente);
                    sc.nextLine();

                    while (paciente1 == null) {
                        System.out.println("El paciente no existe");
                        System.out.println("Ingrese el ID del paciente: ");
                        idPaciente = sc.nextLine();
                        paciente1 = hospital.obtenerPacientePorId(idPaciente);
                        sc.nextLine();
                    }

                    System.out.println("Ingrese el ID del medico: ");
                    String idDoctor = sc.nextLine();
                    Medico medico1 = hospital.obtenerMedicoPorId(idDoctor);
                    sc.nextLine();

                    while (medico1 == null) {
                        System.out.println("El medico no existe");
                        System.out.println("Ingrese el ID del medico: ");
                        idDoctor = sc.nextLine();
                        medico1 = hospital.obtenerMedicoPorId(idDoctor);
                        sc.nextLine();
                    }

                    System.out.println("Ingrese el numero del consultorio: ");
                    int numeroConsultorio = sc.nextInt();
                    sc.nextLine();
                    Consultorio consultorio2 = hospital.obtenerConsultorioPorNumero(numeroConsultorio);

                    while (consultorio2 == null) {
                        System.out.println("El consultorio no existe");
                        System.out.println("Ingrese el numero del consultorio: ");
                        numeroConsultorio = sc.nextInt();
                        sc.nextLine();
                        consultorio2 = hospital.obtenerConsultorioPorNumero(numeroConsultorio);
                    }


                    Consulta consulta = new Consulta(idConsulta, fechaConsulta, paciente1, medico1, consultorio2);
                    hospital.registrarConsulta(consulta);
                    if (!hospital.registrarConsulta(consulta)){
                        System.out.println("No se puede registrar la consulta");
                        break;
                    }
                    System.out.println("Se registro la consulta exitosamente");


                    break;
                case 5:
                    System.out.println("A elegido la opcion MOSTRAR PACIENTES");
                    System.out.println("Los usuarios.pacientes son los siguientes: ");
                    hospital.mostrarPacientes();
                    sc.nextLine();
                    break;
                case 6:
                    System.out.println("A elegido la opcion MOSTRAR MEDICOS");
                    System.out.println("Los usuarios.medicos son los siguientes: ");
                    hospital.mostrarMedicos();
                    break;
                case 7:
                    System.out.println("A elegido la opcion MOSTRAR CONSULTORIOS");
                    System.out.println("Los consultorios son los siguientes: ");
                    hospital.mostrarConsultorios();
                    break;
                case 8:
                    System.out.println("A elegido la opcion de mostrar consultas");
                    System.out.println("Las consultas son las siguientes: ");
                    hospital.mostrarConsultas();
                    break;
                case 9:
                    System.out.println("Mostrar paciente");
                    System.out.println("Ingrese el ID del paciente a buscar: ");
                    sc.nextLine();
                    String idMP = sc.nextLine();
                    hospital.mostrarPacientePorId(idMP);
                    break;
                case 10:
                    System.out.println("Mostrar medico");
                    System.out.println("Ingrese el ID del medico a buscar: ");
                    sc.nextLine();
                    String idMed = sc.nextLine();
                    hospital.mostrarMedicoPorId(idMed);
                    break;
                case 11:
                    System.out.println("Mostrar consultorio");
                    System.out.println("Ingrese el ID del consultorio a buscar: ");
                    sc.nextLine();
                    String idConsul = sc.nextLine();
                    hospital.mostrarConsultorioPorId(idConsul);
                    break;
                case 12:
                    return;
            }
        }

    }
}
