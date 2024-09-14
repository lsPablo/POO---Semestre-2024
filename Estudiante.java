import java.util.ArrayList;

public class Estudiante {
    public String nombre;
    public int idEstudiante;
    public ArrayList<Curso> listaCursos = new ArrayList<>();

    public Estudiante(String nombre, int idEstudiante){
        this.nombre=nombre;
        this.idEstudiante=idEstudiante;

    }
    public void agregarCurso(Curso curso){
        this.listaCursos.add(curso);

    }
    public ArrayList<Curso> getCursos(){
        return listaCursos;
    }
    public String getNombre(){
        return nombre;

    }public int idEstudiantes(){
        return idEstudiante;
    }

    public void mostrarInformacion() {
        // Mostrar la información del estudiante
        System.out.println("\nNombre del Estudiante: " + nombre + ", ID Estudiante: " + idEstudiante);

        // Mostrar los cursos
        System.out.println("*** Cursos de " + this.nombre + " ***");

        if (this.listaCursos.size() == 0) {
            System.out.println("No hay cursos inscritos.");
        } else {
            int iterador = 1;
            for (Curso curso : this.listaCursos) {
                System.out.println("Curso " + iterador + ": " + curso.getNombreCurso());
                iterador++;
            }
        }
    }
}
