package Negocio;
public class Punto extends Figura{//siempre que se hereda de una clase abstracta se TIENEN que poner todos los metodos de la case padre
    //auqnue no se usen, se escriben
    private int x;
    private int y;

    public Punto() {
        super();
    }

    public Punto(int x, int y) {
       super(x,y,0,0,0);//el constructor de Figura esta esperando 5 argumentos, por lo que se le manda 0 en las posiciones que faltan
    }
    public String toString(){//se esta reescribiendo desde la clase object que es la madre de todas las clases de java
        return this.getX() +  "," + super.getY();//se puede usar this. o super. gracias a las propiedades de herencia
    } 

   //no implementa la interface por que no lo tiene que hacer; enparte no lo necesita,pero como la case padre
   //ya no es abstracta no es tiene que poner los metodos a fuerza
    
}
