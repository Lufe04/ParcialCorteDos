
package ClasesyObjetos2;
import javax.swing.JOptionPane;
public class RetornodeValoresMain {
        public static void main(String[]args){
        int c= Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int d= Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        RetornodeValores op2 = new RetornodeValores();
        int suma = op2.sumar2(c, d);
        int resta = op2.restar2(c, d);//argumentos, van donde se invoca el metodo. Se suelen poner automaticamente
        int mult = op2.multiplicar2(c, d);
        int div = op2.dividir2(c, d);
        op2.mostrarResultado2(suma, resta, mult, div);
    }
}
