package ClasesyObjetos.CodigosPrimerSemestre;
import java.util.Scanner;
public class ExamenFinal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vecA[] = new int[3];
        int vecB[] = new int[3];
        int vecunion[] = new int[6];
        int vecinter[] = new int[6];
        int vecdif1[] = new int[6];
        int vecdif2[] = new int[6];
        boolean pert = false;
        for (int i = 0; i < vecA.length; i++) {
            System.out.println("Ingrese un número que pertenecerá al primer grupo");
            vecA[i] = s.nextInt();
        }
        for (int i = 0; i < vecB.length; i++) {
            System.out.println("Ingrese un número que pertenecerá al segundo grupo");
            vecB[i] = s.nextInt();
        }
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 3; i++) {
                if (vecA[0] != vecB[i] && vecA[1] != vecB[i] && vecA[2] != vecB[i]) {
                    vecunion[0] = vecA[0];
                    vecunion[1] = vecA[1];
                    vecunion[2] = vecA[2];
                }
                if (vecB[0] != vecA[i] && vecB[1] != vecA[i] && vecB[2] != vecA[i]) {
                    vecunion[3] = vecB[0];
                    vecunion[4] = vecB[1];
                    vecunion[5] = vecB[2];
                }
            }
        }
        System.out.println("\nLa unión de los vectores sin elementos repetidos es: ");
        for (int i = 0; i < 6; i++) {
            System.out.print("\t" + vecunion[i]);
        }
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 3; i++) {
                pert = false;
                if (vecA[0] == vecB[i] && vecA[1] == vecB[i] && vecA[2] == vecB[i]) {
                    pert = true;
                    if (pert = true) {
                        vecinter[0] = vecA[0];
                        vecinter[1] = vecA[1];
                        vecinter[2] = vecA[2];
                    } else {
                        vecinter[0] = 0;
                        vecinter[1] = 0;
                        vecinter[2] = 0;
                    }
                }
                pert = false;
                if (vecB[0] == vecA[i] && vecB[1] == vecA[i] && vecB[2] == vecA[i]) {
                    pert=true;
                    if(pert=true){
                        vecinter[3] = vecB[0];
                        vecinter[4] = vecB[1];
                        vecinter[5] = vecB[2];
                    }else{
                        vecinter[3] = 0;
                        vecinter[4] = 0;
                        vecinter[5] = 0;
                    }
                    }
            }
        }
        System.out.println("\nLa intersección de los vectores es : ");
        for (int i = 0; i < 6; i++) {
            System.out.print("\t" + vecinter[i]);
        }
        for (int i = 0; i < 3; i++) {
            pert = false;
            if (vecA[0] != vecB[i] && vecA[1] != vecB[i] && vecA[2] != vecB[i]) {
                pert=true;
                if (pert=true){
                    vecdif1[i] = vecA[i];
                }else {
                    vecdif1[i] = 0;
            }
            }
        }
        System.out.println("\nLa diferencia (A-B) de los vectores es: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("\t" + vecdif1[i]);
        }
        for (int j = 0; j < 3; j++) {
            if (vecB[0] != vecA[j] && vecB[1] != vecA[j] && vecB[2] != vecA[j]) {
                vecdif2[j] = vecB[j];
            } else {
                vecdif2[j] = 0;
            }
        }
        System.out.println("\nLa diferencia (B-A) de los vectores es: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("\t" + vecdif2[i]);
        }
    }
}
