package negocio;
public class Rectangulo extends Figura {
    private int x;
    private int y;
    private int h;
    private int a;

    public Rectangulo() {
        super();
    }

    public Rectangulo(int x, int y, int h, int a) {
        super(x, y, h,a,0);
    }
    

    @Override
    public float getPerimetro() {
        return (float) (2*super.getX()) + (2*super.getY());
    }

    @Override
    public float getArea() {
        return (float) (super.getX()*super.getY());
    }

    @Override
    public float getVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
