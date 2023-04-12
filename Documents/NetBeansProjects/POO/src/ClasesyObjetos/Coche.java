
package ClasesyObjetos;

public class Coche {
    //atributos
    String color;
    String marca;
    int km;
    //Metodos
    public static void main (String[] args){
        Coche coche1 = new Coche();
        coche1.color="Blanco"; //Se rellenan los atributos de acuerdo a los atributos
        coche1.marca="audi";
        coche1.km=0;
        
        System.out.println("El color del coche 1 es "+coche1.color+"\nLa marca de coche 1 es "+coche1.marca+"\nEl kilometraje del coche 1 es "+coche1.km);
      
    }
    
}
