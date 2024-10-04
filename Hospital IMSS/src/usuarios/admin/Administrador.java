package usuarios.admin;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Administrador extends Usuario {

        private Double sueldo;
        private String rfc;
        private int aniosTrabajados;

        public Administrador(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String rfc, Double sueldo, int aniosTrabajados, String contrasenia, Rol rol)
        {
            super(id, nombre, apellidos, fechaNacimiento, telefono, contrasenia, Rol.ADMIN);
        this.sueldo=sueldo;
        this.rfc=rfc;
        this.aniosTrabajados=aniosTrabajados;
        }

        public Double getSueldo() {
            return sueldo;
        }
        public void setSueldo(Double sueldo) {
            this.sueldo = sueldo;
        }
        public String getRfc() {
            return rfc;
        }
    }

