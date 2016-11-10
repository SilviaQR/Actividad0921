
/**
 * Write a description of class CalendarioSilvia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioSilvia
{
    // instance variables - replace the example below with your own
    
    private DisplayDosDigitos dia;
    
    private DisplayDosDigitos mes;
    
    private DisplayDosDigitos año;
    

    /**
     * Constructor for objects of class CalendarioSilvia
     */
    public CalendarioSilvia()
    {
        // initialise instance variables
       dia = new DisplayDosDigitos(31);
       mes = new DisplayDosDigitos(13);
       año = new DisplayDosDigitos(100);
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
        dia.setValor(d);
        mes.setValor(m);
        año.setValor(a);
    }
    
    public void avanzarFecha()
    {
       dia.incrementaValor();
        if (dia.getValor() == 1) {
            mes.incrementaValor();
           if (mes.getValor() == 1) {
               año.incrementaValor();
           }
       }
     }
    
    public String mostrarFecha()
    {
        return dia.getValorDelDisplay() + "-" + mes.getValorDelDisplay() + "-" + año.getValorDelDisplay();
    }
}
