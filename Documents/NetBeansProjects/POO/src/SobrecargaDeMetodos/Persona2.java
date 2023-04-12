
package SobrecargaDeMetodos;

public class Persona2 {
    //atributos
    String nombre2;
    int edad2;
    String dni;
    
    //metodos

    public Persona2(String nombre2, int edad2) {
        this.nombre2 = nombre2;
        this.edad2 = edad2;
    }

    public Persona2(String dni) {
        this.dni = dni;
    }
    public void correr1(){
        System.out.println("Soy: "+nombre2+", tengo "+edad2+" años y estoy corriendo una maratón");
        
    }
    public void correr1(int km){
        System.out.println("He corrido "+km+" kilometros");
    }
}
