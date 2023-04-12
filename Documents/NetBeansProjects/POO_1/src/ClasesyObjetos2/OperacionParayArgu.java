package ClasesyObjetos2;
import javax.swing.JOptionPane;
public class OperacionParayArgu {
    int suma, resta, multiplicacion, division;//variables globales
    public void sumar1(int a, int b){//variables locales, parametros
        suma=a+b;
    }
    public void restar1(int a, int b){
        resta=a-b;       
    }
    public void dividir1(int a, int b){
       division = a/b;
    }
    public void multiplicar1(int a, int b){
        multiplicacion=a*b;
    }
    public void mostrarResultado1(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("la multiplicación es: "+multiplicacion);
        System.out.println("La devisión es: "+division);                
    }
}
