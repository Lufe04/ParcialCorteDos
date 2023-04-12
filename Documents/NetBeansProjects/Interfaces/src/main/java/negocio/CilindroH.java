package negocio;
public class CilindroH extends Figura{
    
    public CilindroH (){
        super();
    }
    public CilindroH(int x, int y, int r, int h){
        super(x,y,r,h,0);
    }

    @Override
    public float getVolumen(){
        return (float) (Math.PI*Math.pow(super.getDim1(), 2)*super.getDim2());
    }
    @Override
    public float getArea(){
        return (float) (2*Math.PI*super.getDim1()*(super.getDim1()+super.getDim2()));
    }
    public String toString() {
        return super.getX() + "," + super.getY()+ "," + super.getDim1()+","+ super.getDim2();//se puede invocar metodos de la clase padre en cualquier parte de la clase hija
        
    }

    @Override
    public float getPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
