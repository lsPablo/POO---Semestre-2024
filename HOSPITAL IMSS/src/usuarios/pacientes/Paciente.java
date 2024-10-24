package usuarios.pacientes;

import expediente.Expediente;
import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Usuario {
    public String tipoSangre;
    public char sexo;
    public ArrayList<Expediente> expedientes;


    public Paciente( String id, String nombre, String apellidos, LocalDate fechaNacimiento, String tipoSangre, char sexo, String telefono, String contrenia) {
        super(id, nombre, apellidos, fechaNacimiento, telefono, contrenia, Rol.PACIENTE);
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public char getSexo() {
        return sexo;
    }

    @Override
    public String mostrarInformacion() {
        String datosPaciente = String.format(", tipo de sangre: %s, sexo: %s", tipoSangre, sexo);
        return super.mostrarInformacion() + datosPaciente;

    }

    public void registrarExpediente(Expediente expediente){
        this.expedientes.add(expediente);
    }
}
