package ClasesyObjetos.CodigosPrimerSemestre;
//se da un numero aleatorio, se pide un numeor al usuario y si son iguales el usuario "gana"
import java.util.Scanner;
public class EjemploRandom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1, n,c=0;
        int y;
        y = (int) (Math.random() * 6 + 1);
        do {
            System.out.println("Ingrese el número para adivinar (1-6)");
            System.out.println("Intento # "+i);
            n = s.nextInt();
            if (n > 0 && n < 7) {
                if (n == y) {
                    System.out.println("Adivinó");
                    break;
                } else {
                    System.out.println("Intentelo de nuevo");
                }

            } else {
                System.out.println("Dato invalido");
                i=i-1;
            }
            i = i + 1;
        } while (i <= 5);

    }
}
