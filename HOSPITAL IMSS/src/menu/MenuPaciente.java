package menu;

import hospital.Hospital;
import usuarios.pacientes.Paciente;

import java.util.Scanner;

public class MenuPaciente {

    Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
                System.out.println("HOSPITAL");
                System.out.println("MENU DE PACIENTE");
                System.out.println("1. VER MIS CONSULTAS");
                System.out.println("2. VER MIS DATOS");//TAREA
                System.out.println("3. VER MI HISTORIAL");
                System.out.println("4.SALIR");

                System.out.println("SELECCIONA UNA OPCION: ");
                int opcion = sc.nextInt();

                return opcion;

            }
        public void procesarDatosMenu(int opcion, Hospital hospital, Paciente paciente) {
            switch (opcion){
                case 1:
                    System.out.println("---VER MIS CONSULTAS---");
                    hospital.verConsultaPaciente(paciente.getId());

                    break;
                case 2:
                    System.out.println("---VER MIS DATOS---");
                    hospital.mostrarPacientePorId(paciente.getId());

                    sc.nextLine();
                    break;

                case 3:

                    break;


                case 4:
                    return ;
                default:
                    System.out.println("OPCION NO VALIDA.");
                    break;
            }


        }
    }

