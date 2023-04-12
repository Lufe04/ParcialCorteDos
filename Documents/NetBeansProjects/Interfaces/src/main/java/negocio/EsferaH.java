package negocio;
public class EsferaH extends Figura {
    private int x;
    private int y;
    private int r;

    public EsferaH() {
        super();
    }
    public EsferaH(int x, int y, int r){
        super(x,y,r,0,0);
    }

    @Override
    public float getPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float getArea() {
        return (float) (4*Math.PI*Math.pow(super.getDim1(),2));
    }

    @Override
    public float getVolumen() {
        return (float) ((4/3)*Math.PI*Math.pow(super.getDim1(), 3));
    }
   
}
