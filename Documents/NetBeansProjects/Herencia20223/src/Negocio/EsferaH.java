package Negocio;
public class EsferaH extends CirculoH {

    public EsferaH() {
        super();
    }
    public EsferaH(int x, int y, int r){
        super(x,y,r);
    }
    public float getVolumen(){
        return (float) ((4/3)*Math.PI*Math.pow(super.getRadio(), 3));
    }
    
    public float getArea(){
        return (float) (4*Math.PI*Math.pow(super.getRadio(),2));
    }
    public String toString() {
        return super.getX() + "," + super.getY()+ "," + super.getRadio();//se puede invocar metodos de la clase padre en cualquier parte de la clase hija
        
    }
}
