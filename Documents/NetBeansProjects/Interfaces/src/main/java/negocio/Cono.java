package negocio;
public class Cono extends Figura{
    private int x;
    private int y;
    private int r;
    private int h;

    public Cono() {
        super();
    }

    public Cono(int x, int y, int r, int h) {
        super(x,y,r,h,0);
    }

    @Override
    public float getPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float getArea() {
        return (float) (Math.PI*super.getDim1()*(super.getDim1()+super.getDim2()));
    }

    @Override
    public float getVolumen() {
        return (float) ((1/3)*super.getDim2()*Math.PI*Math.pow(super.getDim1(), 2));
    }
    
}
