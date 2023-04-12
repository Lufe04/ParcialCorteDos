package Corte1;
import javax.swing.JOptionPane;
public class Enero25 {
    public static void main (String[] args){
        float x, y, z;
        x = Float.parseFloat(JOptionPane.showInputDialog( "Ingrese el dato x"));
        y = Float.parseFloat(JOptionPane.showInputDialog( "Ingrese el dato y"));
        z = x+y;
        System.out.println("El resultado es: "+z);
        
    }    
}
