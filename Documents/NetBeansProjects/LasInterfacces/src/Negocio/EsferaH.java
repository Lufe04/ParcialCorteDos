package Negocio;

import Interfaces.PropiedadesFigura;

public class EsferaH extends Figura implements PropiedadesFigura {

    public EsferaH() {
        super();
    }
    public EsferaH(int x, int y, int r){
        super(x,y,r,0,0);
    }
    
    @Override
    public float getVolumen(){
        return (float) ((4/3)*Math.PI*Math.pow(super.getDim1(), 3));
    }
    
    @Override
    public float getArea(){
        return (float) (4*Math.PI*Math.pow(super.getDim1(),2));
    }
    public String toString() {
        return super.getX() + "," + super.getY()+ "," + super.getDim1();//se puede invocar metodos de la clase padre en cualquier parte de la clase hija
        
    }

    @Override
    public float getPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
