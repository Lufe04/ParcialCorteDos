package ClasesyObjetos2;
import javax.swing.JOptionPane;
public class OperacionParayArguMain {
    public static void main(String[]args){
        int a= Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int b= Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        OperacionParayArgu op1 = new OperacionParayArgu();
        op1.sumar1(a, b);
        op1.restar1(a, b);//argumentos, van donde se invoca el metodo. Se suelen poner automaticamente
        op1.multiplicar1(a, b);
        op1.dividir1(a, b);
        op1.mostrarResultado1();
    }
}
