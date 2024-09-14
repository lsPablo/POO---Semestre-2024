public class Curso {
   public String nombreCurso;
   public int codigoCurso;
   public String instructor;

    public Curso(String nombreCurso, int codigoCurso, String instructor){
        this.nombreCurso=nombreCurso;
        this.codigoCurso=codigoCurso;
        this.instructor=instructor;

    }
    public String getNombreCurso(){
        return nombreCurso;
    }
    public int getCodigoCurso(){
        return codigoCurso;
    }
    public String getInstructos(){
        return instructor;
    }
    public String mostrarInfoCurso() {
        return String.format("Nombre: %s, Código del curso: %d, Instructor: %s", nombreCurso, codigoCurso, instructor);
}
}
