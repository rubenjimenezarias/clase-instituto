
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        Alumno alumno1 = new Alumno("pepe");
        Alumno alumno2 = new Alumno("manolo");
        Alumno alumno3 = new Alumno("ruben");
        Alumno alumno4 = new Alumno("laura");
        Alumno alumno5 = new Alumno("miguel");
        
        System.out.println(alumno1.datos());
        System.out.println(alumno2.datos());
        System.out.println(alumno3.datos());
        System.out.println(alumno4.datos());
        System.out.println(alumno5.datos());
    }
}
