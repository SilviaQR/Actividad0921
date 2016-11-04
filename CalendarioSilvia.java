
/**
 * Write a description of class CalendarioSilvia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioSilvia
{
    // instance variables - replace the example below with your own
    
    private int dia;
    
    private int mes;
    
    private int año;
    

    /**
     * Constructor for objects of class CalendarioSilvia
     */
    public CalendarioSilvia()
    {
        // initialise instance variables
        dia = 01;
        mes = 01;
        año = 01;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void fijarFecha(int d, int m, int a)
    {
        // put your code here
        dia = d;
        mes = m;
        año = a;
    }
    
    public void avanzarFecha()
    {
        dia = dia + 1;
        if(dia > 30) {
            dia = 1;
            mes = mes + 1;
           if(mes > 12) {
               mes = 1;
               año = año + 1;
            }
        }
    }
    public String mostrarFecha(String diaUnDigito, String mesUnDigito, String añoUnDigito)
    {
       if(año > 99) {
        return ("Error");
    }    
        else {
            return (dia + " - " + mes + " - " + año);
    }
    }
    
}
