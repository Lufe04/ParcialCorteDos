package Negocio;
public class Circulo {
    private int x;
    private int y;
    private int radio;

    public Circulo() {//si se llama este constructor se crea un punto en esas coordenadas
        this.x = 0;
        this.y = 0;
        this.radio= 0;
    }

    public Circulo(int x, int y, int radio) {
        this.x = x;
        this.y = y;
        this.radio= radio;
    }

    public int getRadio() {
        return radio;
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

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return this.x + "," + this.y + "," + this.radio;
    }
    

}
