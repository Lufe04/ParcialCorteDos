package Negocio;
public class TroncoCono extends ConoH {
    int r2, altinc;
    public TroncoCono() {
        super();
    }

    public TroncoCono(int x, int y, int r, int r2, int h, int altinc) {
        super(x, y, r, h);
        this.r2=r2;
        this.altinc=altinc;
    }
    public void setR2(int r2) {
        this.r2 = r2;
    }

    public void setAltinc(int altinc) {
        this.altinc = altinc;
    }

    public int getR2() {
        return r2;
    }

    public int getAltinc() {
        return altinc;
    }

    
    
    public float getArea(){
        return (float) (Math.PI*(Math.pow(super.getRadio(), 2)+Math.pow(this.r2, 2)+(altinc*(super.getRadio()+this.r2))));
    }
    
    public float getVolumen(){
        return (float) ((super.getH()*Math.PI)/3*(Math.pow(super.getRadio(), 2)+Math.pow(this.r2, 2)+(super.getRadio()*this.r2)));
    }
    public String toString() {
        return super.getX() + "," + super.getY()+ "," + super.getRadio()+","+this.r2+","+super.getH()+","+this.altinc;//se puede invocar metodos de la clase padre en cualquier parte de la clase hija
        
    }
}
