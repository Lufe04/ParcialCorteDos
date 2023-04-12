
package ClasesyObjetos;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Operacion {
    //atributos
    int a, b, suma, resta, multiplicación, división;
    
    //metodos
    public void leerNumero(){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
    }
    
    public void sumar(){
        suma=a+b;
    }
    public void restar(){
        resta=a-b;
    }
    public void dividir(){
        multiplicación=a*b;
    }
    public void multiplicar(){
        división=a/b;
    }
    public void mostrarResultado(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("la multiplicación es: "+multiplicación);
        System.out.println("La devisión es: "+división);                
    }
}
