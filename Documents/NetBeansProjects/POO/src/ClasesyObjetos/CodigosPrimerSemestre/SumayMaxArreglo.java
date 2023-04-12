package ClasesyObjetos.CodigosPrimerSemestre;
//Un vector de 21 posiciones, se calcula la suma de los numeros ingresados por el usuario y el valor maximo de los datos
//si se ingresa -1 finaliza el programa
import java.util.Scanner;
public class SumayMaxArreglo {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int acum=0, max=0;
        int[] num = new int[21];
        for (int i=0;i<num.length;i++) {
            System.out.println("Elemento " + (i+1));
            num[i] = s.nextInt();
            acum+=num[i];
            if(max<num[i]){
                max=num[i];
            } if(num[i]==-1){
                i--;
                break;
            }
        }
        System.out.println("El número máximo es: "+max+"\nLa suma de los numeros introducidos es: "+(acum+1));
    }
}
