package Corte1;
import javax.swing.JOptionPane;
public class Repaso2 {
   public static void main (String [] args){
        float a,b,c,alfagrad,betagrad,alfarad,betarad,theta;
        a=Float.parseFloat(JOptionPane.showInputDialog("Digite la longitud del lado a"));
        b=Float.parseFloat(JOptionPane.showInputDialog("Digite la longitud del lado b"));
        alfagrad=Float.parseFloat(JOptionPane.showInputDialog("Doigite el angulo entre a y b en grados"));
        alfarad=(float) Math.toRadians(alfagrad);
        c=(float) Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(alfarad));
        betarad=(float) (Math.asin(b*Math.sin(alfarad)/c));
        betagrad=(float) (Math.toDegrees(betarad));
        theta=180-(alfagrad-betagrad);
        JOptionPane.showMessageDialog(null,"El lado c es: "+c+".");
        JOptionPane.showMessageDialog(null,"El anguloo beta es : "+betagrad+".");
        JOptionPane.showMessageDialog(null,"El angulo theta es : "+theta+".");
    }   
}
