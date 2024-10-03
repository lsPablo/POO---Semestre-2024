package pacientes;

import java.time.LocalDate;

public class Paciente {
    public String id;
    public String nombre;
    public String apellidos;
    public LocalDate fechaNacimiento;
    public String tipoSangre;
    public char sexo;
    private String telefono;

//constructor
    public Paciente(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String tipoSangre, char sexo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    public String mostrarDatos() {
        String datos = String.format("Id: %s, nombre: %s, apellidos: %s, fecha de nacimiento: %s, tipo de sangre: %s, sexo: %c, telefono: %s",
                id,
                nombre,
                apellidos,
                fechaNacimiento,
                tipoSangre,
                sexo,
                telefono);
        return datos;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public char getSexo() {
        return sexo;
    }

    public String getTelefono() { return telefono; }
}
