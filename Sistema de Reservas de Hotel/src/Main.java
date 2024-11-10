import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Habitaciones>listaHabitaciones=new ArrayList<>();
        Habitaciones habitacionIndividual = new Habitaciones(TipoHabitacion.Individual, true);
        Habitaciones habitacionDoble = new Habitaciones(TipoHabitacion.Doble, true);
        Habitaciones habitacionSuite = new Habitaciones(TipoHabitacion.Suit, true);
        listaHabitaciones.add(habitacionIndividual);
        listaHabitaciones.add(habitacionDoble);
        listaHabitaciones.add(habitacionSuite);
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        int opcionHabitacion=0;
        int nochesReserva=0;
        int opcionLiberar=-0;
        do {
            System.out.println("--- Sistema de Reservas de Habitaciones ---");
            System.out.println("1. Mostrar detalles de las habitaciones");
            System.out.println("2. Realizar una reserva");
            System.out.println("3. Liberar una habitacion");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("==HAS SELECCIONADO MOSTRAR DETALLES DE LAS HABITACIONES==");
                        System.out.println("--HABITACIONES DISPONIBLES--");
                        for (Habitaciones habitacion : listaHabitaciones) {
                            if (habitacion.disponibilidad == true) {
                                System.out.println("# " + habitacion.datosHabitaciones());
                            }
                        }

                        System.out.println("--HABITACIONES OCUPADAS--");
                        for (Habitaciones habitacion : listaHabitaciones) {
                            if (habitacion.disponibilidad == false) {
                                System.out.println("# " + habitacion.datosHabitaciones());
                            }
                        }


                        break;
                    case 2:
                        System.out.println("==HAS SELECCIONADO REALIZAR UNA RESERVA==");
                        System.out.println("--HABITACIONES DISPONIBLES--");
                        for (Habitaciones habitacion : listaHabitaciones) {
                            if (habitacion.disponibilidad == true) {
                                System.out.println("# " + habitacion.datosHabitaciones());
                            }
                        }
                        do{
                            System.out.println("--SELECCIONE EL TIPO DE HABITACION A RESERVAR");
                            System.out.println("1. Habitacion Individual");
                            System.out.println("2. Habitacion Doble");
                            System.out.println("3. Habitacion Suite");
                            System.out.println("4. SALIR");
                            try {
                                opcionHabitacion = sc.nextInt();
                                switch (opcionHabitacion) {
                                    case 1:
                                        try {
                                            if (habitacionIndividual.disponibilidad == true) {
                                                System.out.println("La habitación está disponible");
                                                do {
                                                    System.out.println("Ingresa el total de noches a reservar");
                                                    nochesReserva = 0;

                                                    try {
                                                        nochesReserva = sc.nextInt();

                                                        if (nochesReserva <= 0) {
                                                            throw new NumeroDeNochesInvalidoException();
                                                        } else {
                                                            habitacionIndividual.setNoches(nochesReserva);
                                                            habitacionIndividual.reservarHabitacion(nochesReserva);
                                                            break;
                                                        }

                                                    } catch (NumeroDeNochesInvalidoException e) {
                                                        System.out.println(e.getMessage());
                                                    } catch (Exception e) {
                                                        System.out.println("Error: Ingrese un número entero válido.");
                                                        sc.nextLine();
                                                    }
                                                    System.out.println();
                                                } while (nochesReserva <= 0);
                                            } else {

                                                throw new HabitacionNoDisponibleException();
                                            }
                                        } catch (HabitacionNoDisponibleException e) {
                                            System.out.println(e.getMessage());
                                        }
                                        break;

                                    case 2:
                                        try {
                                            if (habitacionDoble.disponibilidad == true) {
                                                System.out.println("La habitación está disponible");
                                                do {
                                                    System.out.println("Ingresa el total de noches a reservar");
                                                    nochesReserva = 0;

                                                    try {
                                                        nochesReserva = sc.nextInt();

                                                        if (nochesReserva <= 0) {
                                                            throw new NumeroDeNochesInvalidoException();
                                                        } else {
                                                            habitacionDoble.setNoches(nochesReserva);
                                                            habitacionDoble.reservarHabitacion(nochesReserva);
                                                            break;
                                                        }

                                                    } catch (NumeroDeNochesInvalidoException e) {
                                                        System.out.println(e.getMessage());
                                                    } catch (Exception e) {
                                                        System.out.println("Error: Ingrese un número entero válido.");
                                                        sc.nextLine();
                                                    }
                                                    System.out.println();
                                                } while (nochesReserva <= 0);
                                            } else {

                                                throw new HabitacionNoDisponibleException();
                                            }
                                        } catch (HabitacionNoDisponibleException e) {
                                            System.out.println(e.getMessage());
                                        }
                                        break;

                                    case 3:
                                        try {
                                            if (habitacionSuite.disponibilidad == true) {
                                                System.out.println("La habitación está disponible");
                                                do {
                                                    System.out.println("Ingresa el total de noches a reservar");
                                                    nochesReserva = 0;

                                                    try {
                                                        nochesReserva = sc.nextInt();

                                                        if (nochesReserva <= 0) {
                                                            throw new NumeroDeNochesInvalidoException();
                                                        } else {
                                                            habitacionSuite.setNoches(nochesReserva);
                                                            habitacionSuite.reservarHabitacion(nochesReserva);
                                                            break;
                                                        }

                                                    } catch (NumeroDeNochesInvalidoException e) {
                                                        System.out.println(e.getMessage());
                                                    } catch (Exception e) {
                                                        System.out.println("Error: Ingrese un número entero válido.");
                                                        sc.nextLine();
                                                    }
                                                    System.out.println();
                                                } while (nochesReserva <= 0);
                                            } else {

                                                throw new HabitacionNoDisponibleException();
                                            }
                                        } catch (HabitacionNoDisponibleException e) {
                                            System.out.println(e.getMessage());
                                        }
                                        break;

                                    case 4:
                                        break;

                                    default:
                                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                }
                            } catch (Exception e) {
                                System.out.println("Error: Por favor, ingrese un número válido.");
                                sc.nextLine();
                            }
                            System.out.println();
                        }while (opcionHabitacion != 4);
                        break;


                    case 3:
                        System.out.println("==HAS ELEGIDO LIBERAR HABITACION==");
                        System.out.println("--HABITACIONES OCUPADAS--");
                        for (Habitaciones habitacion : listaHabitaciones) {
                            if (habitacion.disponibilidad == false) {
                                System.out.println("# " + habitacion.datosHabitaciones());
                            }
                        }
                        do {
                            System.out.println("--SELECCIONE EL TIPO DE HABITACION A LIBERAR");
                            System.out.println("1. Habitacion Individual");
                            System.out.println("2. Habitacion Doble");
                            System.out.println("3. Habitacion Suite");
                            System.out.println("4. SALIR");

                            try {
                                opcionLiberar = sc.nextInt();
                                switch (opcionLiberar) {
                                    case 1:
                                        try {
                                            if (habitacionIndividual.disponibilidad == false) {
                                                habitacionIndividual.setDisponibilidad(true);
                                                System.out.println("Has liberado la habitacion correctamente, esta disponible de nuevo");
                                                break;
                                            } else {
                                                throw new HabitacionNoReservadaException();
                                            }
                                        } catch (HabitacionNoReservadaException e) {
                                            System.out.println(e.getMessage());
                                        }
                                        break;
                                    case 2:
                                        try {
                                            if (habitacionDoble.disponibilidad == false) {
                                                habitacionDoble.setDisponibilidad(true);
                                                System.out.println("Has liberado la habitacion correctamente, esta disponible de nuevo");
                                                break;
                                            } else {
                                                throw new HabitacionNoReservadaException();
                                            }
                                        } catch (HabitacionNoReservadaException e) {
                                            System.out.println(e.getMessage());
                                        }
                                        break;
                                    case 3:
                                        try {
                                            if (habitacionSuite.disponibilidad == false) {
                                                habitacionSuite.setDisponibilidad(true);
                                                System.out.println("Has liberado la habitacion correctamente, esta disponible de nuevo");
                                                break;
                                            } else {
                                                throw new HabitacionNoReservadaException();
                                            }
                                        } catch (HabitacionNoReservadaException e) {
                                            System.out.println(e.getMessage());
                                        }
                                        break;
                                    case 4:
                                        break;

                                    default:
                                        System.out.println("Ingrese una opcion valida");
                                }
                            } catch (Exception e) {
                                    System.out.println("Error: Por favor, ingrese un número válido.");
                                    sc.nextLine();
                                }
                                System.out.println();
                            }while (opcionHabitacion != 4);
                        break;
                    case 4:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                sc.nextLine();
            }
            System.out.println();
        } while (opcion != 4);

        sc.close();
    }

    }
