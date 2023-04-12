package Negocio;
public class Punto {
    private int x;
    private int y;

    public Punto() {//si se llama este constructor se crea un punto en esas coordenadas
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(){
        return this.x +  "," + this.y;
    } 
}
