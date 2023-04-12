package Gestor;
public class Helado {
    //atributos
    private String coordenadaX;
    private String coordenadaY;
    private String tamaño;
    private String color;
  
    //metodos

    public Helado() {
        this.coordenadaX="";
        this.coordenadaY="";
        this. tamaño="";
        this.color="";
    }
    public Helado(String coordenadaX, String coordenadaY, String tamaño, String color){
        this.coordenadaX=coordenadaX;
        this.coordenadaY=coordenadaY;
        this.tamaño=tamaño;
        this.color=color;
    }

    public String getCoordenadaX() {
        return coordenadaX;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getColor() {
        return color;
    }
    public String getCoordenadaY(){
        return coordenadaY;
    }

    public void setCoordenadaX(String coordenadaX) {
        this.coordenadaX = coordenadaX;
    }
    public void setCoordenadaY(String coordenadaY){
        this.coordenadaY=coordenadaY;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return this.coordenadaX+","+this.coordenadaY+","+ this.tamaño+","+this.color;
    }
    
}
