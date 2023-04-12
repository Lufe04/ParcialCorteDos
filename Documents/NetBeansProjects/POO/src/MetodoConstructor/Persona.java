package MetodoConstructor;

public class Persona {
    //atributos
    String nombre;
    int edad;
    
    //metodos
    public Persona(String _nombre, int _edad){//los metodos constructores son los unicos metodos donde no se pone valor de retorno
        nombre = _nombre;
        edad = _edad;
    }
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }

}
