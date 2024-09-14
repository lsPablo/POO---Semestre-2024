public class Main{
    public static void main(String[] args) {
        //CURSOS//
        Curso matematicas=new Curso("Matematicas", 1, "Victor Manuel Torres");
        System.out.println(matematicas.mostrarInfoCurso());

        Curso ingles = new Curso("Ingles",2, "Yunuen Soto");
        System.out.println(ingles.mostrarInfoCurso());
        
        Curso literatura = new Curso("Literatura", 3, "Rogelio Lopez");
        System.out.println(literatura.mostrarInfoCurso());

        //Estudiantes//
        Estudiante estudianteUno=new Estudiante("Pablo Cesar", 1);
        estudianteUno.agregarCurso(literatura);
        estudianteUno.agregarCurso(matematicas);
        estudianteUno.agregarCurso(ingles);
        estudianteUno.mostrarInformacion();

        Estudiante estudianteDos=new Estudiante("Rosa Elia", 2);
        estudianteDos.agregarCurso(literatura);
        estudianteDos.agregarCurso(matematicas);
        estudianteDos.mostrarInformacion();

        
        Estudiante estudianteTres=new Estudiante("Samuel Ernesto", 3);
        estudianteTres.mostrarInformacion();
    }
}