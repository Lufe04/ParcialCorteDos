
package SobrecargaDeMetodos;

public class Main2 {
    public static void main (String [] args){
    Persona2 pp1 = new Persona2("Alejandro", 30);
    pp1.correr1();
    
    Persona2 pp2 = new Persona2 ("31234");
    pp2.correr1(100);
    
    }   
}
