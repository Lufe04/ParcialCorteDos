package ClasesyObjetos2;
public class RetornodeValores {
    public int sumar2(int c, int d){//variables locales, parametros
       int suma=c+d;
       return suma;
    }
    public int restar2(int c, int d){
        int resta=c-d;       
        return resta;
    }
    public int dividir2(int c, int d){
       int division = c/d;
       return division;
    } 
    public int multiplicar2(int c, int d){
        int multiplicacion=c*d;
        return multiplicacion;
    }
    public void mostrarResultado2(int suma, int resta, int multiplicacion, int division){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("la multiplicación es: "+multiplicacion);
        System.out.println("La devisión es: "+division);                
    }
}