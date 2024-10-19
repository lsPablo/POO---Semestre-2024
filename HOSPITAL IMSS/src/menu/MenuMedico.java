package menu;

import consultas.Consulta;
import hospital.Hospital;
import usuarios.medicos.Medico;

import java.util.Scanner;

public class MenuMedico {
    private Scanner sc = new Scanner(System.in);
    public int mostrarMenu(){

            System.out.println("HOSPITAL");
            System.out.println("MENU DE MEDICO");
            System.out.println("1.VER MIS CONSULTAS ACTUALES");//tarea
            System.out.println("2.VER MIS PACIENTES");
            System.out.println("3.CONSULTAR PACIENTE");
            System.out.println("4.CONSULTAR EXPEDIENTE DE PACIENTE");
            System.out.println("5.COMPLETAR CONSULTA");
            System.out.println("6.VER MI INFORMACION PERSONAL");//TAREA
            System.out.println("7. SALIR");

            System.out.println("SELECCIONA UNA OPCION: ");
            int opcion = sc.nextInt();

            return opcion;




    }

    public void procesarDatosMenu(int opcion, Hospital hospital, Medico medico){
        switch (opcion){
            case 1:
                System.out.println("---VER MIS CONSULTAS---");
                hospital.verConsultasMedico(medico.getId());
                break;
            case 2:
                System.out.println("---VER MIS PACIENTES---");
                for (Consulta consulta : hospital.listaConsultas){
                    if(medico.equals(consulta.getMedico().getNombre())){
                        System.out.println(consulta.paciente.mostrarDatos());
                    }
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.out.println("VER MI INFORMACION PERSONAL");
                hospital.mostrarMedicoPorId(medico.getId());
                break;
            case 7:
                System.out.println("HASTA LUEGO");
                break;
            default:
                System.out.println("OPCION NO VALILIDA");
                sc.nextLine();
                break;
        }

    }
}
