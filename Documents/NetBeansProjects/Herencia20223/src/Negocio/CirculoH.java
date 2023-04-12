package Negocio;
public class CirculoH extends Punto{ //se autoriza a circulo que vaya a la clase punto y haga lo que quiera con la informacion
    private int x;
    private int y;
    private int radio;

    public CirculoH() {//si se llama este constructor se crea un punto en esas coordenadas
        super();//invoca el primero metodo vacio de la clase punto
    }

    public CirculoH(int x, int y, int radio) {
        super(x,y);//se lo manda a la superclase, incova el constructor con parametros de punto
        this.radio= radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    public float getArea(){
        return (float) (Math.PI*Math.pow(this.radio,2));
    }
    public float getPerimetro(){
        return (float) (2*Math.PI*this.radio);
    }

    @Override
    public String toString() {
        return super.getX() + "," + super.getY()+ "," + this.radio;//se puede invocar metodos de la clase padre en cualquier parte de la clase hija
        
    }
    

}
