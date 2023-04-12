package negocio;
public class Triangulo extends Figura {
    private int x;
    private int y;
    private int l1;
   
    
    public Triangulo (){
        super();
    }
    
    public Triangulo (int x, int y, int l1){
        super(x,y,l1,0,0);
    }

    @Override
    public float getPerimetro() {
        return (float) (l1*3);
    }

    @Override
    public float getArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float getVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
