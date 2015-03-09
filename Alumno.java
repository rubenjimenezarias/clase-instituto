import java.util.Random;

/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int edad;
    private int[] notas;
    private float media;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre)
    {
        // initialise instance variables
        this.nombre = nombre;
        
        Random aleatorio = new Random();
        edad = aleatorio.nextInt(100);
        
        media = 0;
        generaNotas();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private void generaNotas()
    {
        Random aleatorio = new Random();
        notas = new int[aleatorio.nextInt(10)];
        int tamaño = notas.length;
        for (int elemento: notas)
        {
            elemento = aleatorio.nextInt(10);
            media += elemento;
        }
        media = media/tamaño;
    }
    
    /**
     * devuelve true o false segun esta aprobado o no
     */
    public boolean calificacion()
    {
        return (media > 5);
    }
    /**
     * devuelve todos los datos.
     */
    public String datos()
    {
        return nombre + ", " + edad + ", media: " + media;
    }
}
