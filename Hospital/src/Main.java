import consultas.Consultas;
import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("**** Bienvenido al programa de Gestion del IMSS **** :) ");
        System.out.println("==MENU==");
        System.out.println("Seleccione el area a la que quiere gestionar");
        System.out.println("1. Consultorios y consultas");
        System.out.println("2. Medicos y trabajadores");
        System.out.println("3. Pacientes");
        int opcion=sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("==Consultorios y consultas==");
                System.out.println("Seleccione una opcion");
                System.out.println("1.Registrar Consultorios");
                System.out.println("2.Gestionar Consultorios");
                System.out.println("3.Registrar Consulta");
                System.out.println("4.Eliminar Consulta");
                System.out.println("5.Gestionar consultas");
                int opcion2=sc.nextInt();
                switch(opcion2){
                    case 1:
                        System.out.println("Seleccionaste registrar un consultorio");

                        break;

                        case 2:
                            System.out.println("Seleccionaste Gestionar consultorios");
                            break;

                            case 3:
                                System.out.println("Seleccionaste registrar un consulta");
                                break;

                                case 4:
                                    System.out.println("Seleccionaste eliminar un consulta");
                                    break;

                                    case 5:
                                        System.out.println("Seleccionaste Gestionar consultas");
                                        break;
                }
            case 2:
                System.out.println("==Medicos y trabajadores==");
                System.out.println("Seleccione una opcion");
                System.out.println("1.Registrar Medicos");
                System.out.println("2.Gestionar Medicos");
                int opcion3=sc.nextInt();
                switch(opcion3){
                    case 1:
                        System.out.println("Seleccionaste registrar un medico");
                        break;

                        case 2:
                            System.out.println("Seleccionaste Gestionar un medico");
                            break;


                }
            case 3:
                System.out.println("==Pacientes==");
                System.out.println("Seleccionaste una opcion");
                System.out.println("1.Registrar Paciente");
                System.out.println("2.Gestionar Informacion Paciente");
                int opcion4=sc.nextInt();
                switch(opcion4){
                    case 1:
                        System.out.println("Seleccionaste registrar un paciente");
                        break;

                        case 2:
                            System.out.println("Seleccionaste Gestionar un paciente");
                            break;
                }

        }

    }
}