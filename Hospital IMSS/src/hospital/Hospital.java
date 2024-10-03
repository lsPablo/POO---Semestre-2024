package hospital;

import consultas.Consulta;
import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;



public class Hospital {
    Random random = new Random();
    LocalDate fecha = LocalDate.now();
    public ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public ArrayList<Medico> listaMedicos = new ArrayList<>();
    public ArrayList<Consulta> listaConsultas = new ArrayList<>();
    public ArrayList<Consultorio> listaConsultorios = new ArrayList<>();
    private ValidadorHospital validador = new ValidadorHospital();

//    metodos
    public void registrarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medico medico) {
        this.listaMedicos.add(medico);
    }

    public boolean registrarConsulta(Consulta consulta) {
        // paciente no tenga consulta en esa fecha

        if(!validador.validarDispolnibilidadEnFechaConsulta(consulta.getFechaHora(),consulta.getConsultorio().getNumeroConsultorio(), this.listaConsultas)){
            System.out.println("Ya existe una consulta registrada par esa fecha");
            return false;
        }


        /**
         * 1. No existe una consulta en la fecha indicafa en el consultorio indicado
         * 2. Fecha valida
         * 3. Medico no tenga una consulta en esa fecha en otro consultorio
         * 4. Paciente no tenga una consulta en esa fecha
         */

        if(!validador.validarDisponibilidadMedico(consulta.getFechaHora(),consulta.getMedico().getId(),this.listaConsultas)){
            System.out.println("El medico no tiene disponibilidad en esa fecha");
            return false;
        }

        this.listaConsultas.add(consulta);
        return true;
    }



    public void registrarConsultorios(Consultorio consultorio) {
        this.listaConsultorios.add(consultorio);
    }

    public void mostrarPacientes() {
        for(Paciente paciente : this.listaPacientes) {
            System.out.println(paciente.mostrarDatos());
        }
    }

    public void mostrarMedicos() {
        for(Medico medico : this.listaMedicos) {
            System.out.println(medico.mostrarDatosMedico());
        }
    }
    public void mostrarConsultorios() {
        for(Consultorio consultorio : this.listaConsultorios) {
            System.out.println("ID: " + (consultorio.getId()));
            System.out.println("Piso: " + (consultorio.getPiso()));
            System.out.println("Numero de consultorio: " + (consultorio.getNumeroConsultorio()));
            System.out.println(" ");
        }
    }

    public String generarIdPaciente() {
        // P-{ano actual}--{mes actual}--{longitud pacientes + 1}--{1,100000}
        int anoActual = fecha.getYear();
        int mesActual = fecha.getMonthValue();
        int logitudPacientesMasUno = this.listaConsultas.size() + 1;
        int numeroAleatorio = random.nextInt(1,100000);

        String id = String.format("P%d%d%d%d",anoActual,mesActual,logitudPacientesMasUno, numeroAleatorio);
        return id;

    }

    public Paciente obtenerPacientePorId(String idMP) {
        return listaPacientes.stream().filter(paciente -> paciente.getId().equals(idMP)).findFirst().orElse(null);

    }

    public void mostrarPacientePorId(String idPM){
        Optional<Paciente> pacienteEncontrado = this.listaPacientes.stream().filter(paciente -> paciente.getId().equals(idPM)).findFirst();

        if (pacienteEncontrado.isPresent()){
            System.out.println(pacienteEncontrado.get().mostrarDatos());
        } else {
            System.out.println("Paciente no encontrado");
        }


    }

    public Medico obtenerMedicoPorId(String idMed) {
        return listaMedicos.stream().filter(p -> p.getId().equals(idMed)).findFirst().orElse(null);
    }

    public String generarIdMedico(String apellidoMedico, int anoNacimientoMedico){
        String anoCadena = String.valueOf(anoNacimientoMedico);
        char unoApellido = apellidoMedico.charAt(0) ;
        char dosApellido = apellidoMedico.charAt(1);
        char ultimoFecha = anoCadena.charAt(anoCadena.length()-1);
        int anoActualMedico = fecha.getYear();
        int numeroAleatorioMedico = random.nextInt(50,700000);
        int longitudMedicoMasUno = listaConsultas.size() + 1;
        String id = String.format("M%c%c%c%d%d%d",unoApellido,dosApellido,ultimoFecha,anoActualMedico,numeroAleatorioMedico,longitudMedicoMasUno);
        // M-{Primeras 2 letras de su apellido}-{ultimo digito de su fecha de nacimiento}-{ano actua}-{numerA 50/700000}-{listaMedicos+1}
        return id;
    }

    public String generarIdConsultorio (){
        // C-{longitudConsultorios + 1}-{dia actual}-{anoActual}-{numeroAleatorio 1 y 500000}
        int longitudConsultorioMasUno = this.listaConsultas.size() + 1;
        int diaActualConsultorio = fecha.getDayOfMonth();
        int anoActualConsutlorio = fecha.getYear();
        int numeroAleatorioConsultorio = random.nextInt(1,500000);
        String id =  String.format("C%d%d%d%d",longitudConsultorioMasUno,diaActualConsultorio,anoActualConsutlorio,numeroAleatorioConsultorio);
        return id;
    }

    public void mostrarMedicoPorId(String idMed){
        Optional<Medico> medicoEncontrado = this.listaMedicos.stream().filter(medico -> medico.getId().equals(idMed)).findFirst();

        if (medicoEncontrado.isPresent()){
            System.out.println(medicoEncontrado.get().mostrarDatosMedico());
        } else {
            System.out.println("Medico no encontrado");
        }


    }


    public void mostrarConsultorioPorId(String idConsul) {
        Optional<Consultorio> consultorio = this.listaConsultorios.stream().filter(medico -> medico.getId().equals(idConsul)).findFirst();

        if (consultorio.isPresent()) {
            System.out.println(consultorio.get().mostrarDatosConultorio());
        } else {
            System.out.println("Consultorio no encontrado");
        }
    }

    public Consultorio obtenerConsultorioPorNumero(int numeroConsultorio) {
        return listaConsultorios.stream().filter(p -> p.getNumeroConsultorio() == numeroConsultorio).findFirst().orElse(null);
    }

    public String generarIdConsulta(){
        int diaActual = LocalDate.now().getDayOfMonth();
        int numeroAleatorio = random.nextInt(100000 - 50) + 50;
        return String.format("CO-%d-%d-%d",listaConsultas.size() + 1, numeroAleatorio, diaActual);
    }

    public boolean validarFechaConsulta(LocalDateTime fechaDeseada){
        return this.validador.validarFechaCorrecta(fechaDeseada);
    }

    public void mostrarConsultas(){
        if (listaConsultas.isEmpty()) {
            System.out.println("Consultas no registradas en el sistema");
        }
        else {

            System.out.println("---CONSULTAS EN EL SISTEMA---");
            for (Consulta consulta : this.listaConsultas) {
                System.out.println(consulta.mostrarDatosConsulta());
            }
        }
    }

    public boolean numeroPaciente(String numeroPaciente){
        for (Paciente paciente : this.listaPacientes) {
            if (paciente.getTelefono().equals(numeroPaciente)) {
                return false;
            }
        }
        return true;
    }

    public boolean numeroMedico(String numeroMedico){
        for (Medico medico : this.listaMedicos) {
            if (medico.getTelefono().equals(numeroMedico)) {
                return false;
            }
        }
        return true;
    }

    public boolean rfcMedico(String rfcMedico){
        for (Medico medico : this.listaMedicos) {
            if (medico.getRfc().equals(rfcMedico)) {
                return false;
            }
        }
        return true;
    }
}

