package negocio;
public class TroncoCono extends Figura{
    private int x;
    private int y;
    private int r;
    private int h;
    private int r2;
    public TroncoCono() {
        super();
    }

    public TroncoCono(int x, int y, int r, int r2, int h) {
        super(x, y, r, h, r2);
    }
    @Override
    public float getArea(){
        return (float) (Math.PI*(Math.pow(super.getDim1(), 2)+Math.pow(super.getDim3(), 2)+(super.getDim1()+super.getDim3())));
    }
    @Override
    public float getVolumen(){
        return (float) ((super.getDim2()*Math.PI)/3*(Math.pow(super.getDim1(), 2)+Math.pow(super.getDim3(), 2)+(super.getDim1()*super.getDim3())));
    }
    @Override
    public String toString() {
        return super.getX()+ "," + super.getY()+ "," + super.getDim1()+","+super.getDim2()+","+super.getDim3();//se puede invocar metodos de la clase padre en cualquier parte de la clase hija
    }

    @Override
    public float getPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
