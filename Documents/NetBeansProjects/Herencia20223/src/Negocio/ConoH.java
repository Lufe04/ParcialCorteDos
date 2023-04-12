package Negocio;
public class ConoH extends CilindroH {

    public ConoH() {
    }

    public ConoH(int x, int y, int r, int h) {
        super(x, y, r, h);
    }
    
    public float getVolumen(){
        return (float) ((1/3)*h*Math.PI*Math.pow(super.getRadio(), 2));
    }
    
    public float getArea(){
        return (float) (Math.PI*super.getRadio()*(super.getRadio()+h));
    }

    public String toString() {
        return super.getX() + "," + super.getY()+ "," + super.getRadio()+","+ super.getH();//se puede invocar metodos de la clase padre en cualquier parte de la clase hija
        
    }
}
