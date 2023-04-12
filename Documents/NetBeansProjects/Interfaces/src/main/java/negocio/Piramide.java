package negocio;
public class Piramide extends Figura {
    private int x;
    private int y;
    private int l1;
    private int l2;
    private int h;

    public Piramide() {
        super();
    }
    public Piramide(int x, int y, int l1, int l2, int h) {
         super(x,y,l1,l2,h);
     }
    
    @Override
    public float getPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float getArea() {
        return (float) (super.getDim1()*super.getDim2()) + (super.getDim1()*super.getDim3()) + (super.getDim2()*super.getDim3());
    }

    @Override
    public float getVolumen() {
        return (float) ((1/3)*(super.getDim1()) * super.getDim2() * super.getDim3());
    }
    
}
