package negocio;
public class CirculoH extends Figura{ //se autoriza a circulo que vaya a la clase punto y haga lo que quiera con la informacion
    
    public CirculoH() {//si se llama este constructor se crea un punto en esas coordenadas
        super();//invoca el primero metodo vacio de la clase punto
    }

    public CirculoH(int x, int y, int radio) {
        super(x,y, radio,0,0);//se lo manda a la superclase, incova el constructor con parametros de punto
    }

    public float getArea(){
        return (float) (Math.PI*Math.pow(this.getDim1(),2));
    }
    public float getPerimetro(){
        return (float) (2*Math.PI*this.getDim1());
    }

    @Override
    public String toString() {
        return super.getX() + "," + super.getY()+ "," + this.getDim1();//se puede invocar metodos de la clase padre en cualquier parte de la clase hija   
    }

    @Override
    public float getVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
