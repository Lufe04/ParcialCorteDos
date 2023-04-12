package Negocio;
public class CilindroH extends CirculoH {
    int h;
    public CilindroH (){
        super();
    }
    public CilindroH(int x, int y, int r, int h){
        super(x,y,r);
        this.h=h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    
    public float getVolumen(){
        return (float) (Math.PI*Math.pow(super.getRadio(), 2)*h);
    }
    
    public float getArea(){
        return (float) (2*Math.PI*super.getRadio()*(super.getRadio()+h));
    }
    public String toString() {
        return super.getX() + "," + super.getY()+ "," + super.getRadio()+","+ this.h;//se puede invocar metodos de la clase padre en cualquier parte de la clase hija
        
    }
    
}
