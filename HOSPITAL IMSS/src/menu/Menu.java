package menu;

import consultas.Consulta;
import consultorios.Consultorio;
import hospital.Hospital;
import usuarios.Usuario;
import usuarios.administrador.Administrador;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;
import usuarios.utils.Rol;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Hospital hospital = new Hospital();



    public void login(){
        hospital.Hospital();

        int intentosMaximos = 5, intentosUsuario = 0;

        while(intentosUsuario < intentosMaximos){
            System.out.println("BIENVENIDO AL IMSS");
            System.out.println("INICIA SESIÓN PARA CONTINUAR");

            System.out.println("INGRESA TU ID DE USUARIO: ");
            String usuario = sc.next();

            System.out.println("INGRESA TU CONTRASEÑA: ");
            String contrasenia = sc.next();


            Usuario usuarioEnSesion = hospital.validarInicioSesion(usuario, contrasenia);

            if (usuarioEnSesion instanceof Usuario){
                if (usuarioEnSesion.getRol() == Rol.PACIENTE ){
                    Paciente pacienteEnSesion = (Paciente) usuarioEnSesion;
                   // this.mostrarMenuPaciente(pacienteEnSesion);
                    MenuPaciente menuPaciente = new MenuPaciente();
                    int opcion = 0;
                    while(opcion != 4) {
                        opcion = menuPaciente.mostrarMenu();
                        menuPaciente.procesarDatosMenu(opcion, hospital, pacienteEnSesion);
                    }
                    intentosUsuario = 0;
                } else if (usuarioEnSesion.getRol() == Rol.MEDICO) {
                    Medico medicoEnSesion = (Medico) usuarioEnSesion;
                   // this.mostrarMenuMedico(medicoEnSesion);
                    MenuMedico menuMedico = new MenuMedico();
                    int opcion = 0;
                    while(opcion != 7) {
                        opcion = menuMedico.mostrarMenu();
                        menuMedico.procesarDatosMenu(opcion, hospital, medicoEnSesion);
                    }

                    intentosUsuario = 0;
                }else{
                    Administrador administradorEnSesion = (Administrador) usuarioEnSesion;
                    MenuAdministrador menuAdministrador = new MenuAdministrador();
                    int opcion = 0;
                    while(opcion != 13) {
                        opcion = menuAdministrador.mostrarMenu();
                        menuAdministrador.procesarDatosMenu(opcion, hospital, administradorEnSesion);
                    }
                   // this.mostrarMenuAdmin();


                    intentosUsuario = 0;
                }
            } else{
                intentosUsuario = this.mostrarErrorInicioSesion(intentosUsuario);
            }
        }
        System.out.println("INTENTOS MÁXIMOS ALCANZADOS");
    }

    private int mostrarErrorInicioSesion(int intentosUsuario){
        System.out.println("USUARIO O CONTRASEÑA INVALIDOS, INTENTA DE NUEVO");
        return intentosUsuario + 1;
    }

}