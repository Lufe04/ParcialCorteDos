package Gestor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Cono;
import negocio.Esfera;


public class GestionHelados {
    //variables de clase
    private String ruta;
    //metodos
    public GestionHelados(){
       this.ruta= "./helados/heladosGuardados.txt";
       this.verificArchivo();   
    }
    private void verificArchivo() {
        try{
            File filex = new File(this.ruta); //revisa que la ruta este bien
            if(!filex.exists()) //si no existe el archivo
                filex.createNewFile();// lo crea, si ya esta creado pues no hace nada.  
        }
        catch (IOException ex){
            System.out.println("Problemas con la ruta");
            //ex.printStackTrace(); --> deja una ahoja de ruta de los errores que hay 
        }
    }
    public void crearHelado(Cono elCono, Esfera laEsfera){
        File file;
        FileWriter fr;
        PrintWriter pw;
        try{
            file=new File(this.ruta);
            fr = new FileWriter(file, true);//prepara la escritura, recibe el , el booleano true: agraga al final del archivo, false: borra el archivo e inicia de nuevo
                pw = new PrintWriter(fr);
            pw.println(elCono.toString()+laEsfera.toString());
            pw.close();
        }
        catch (IOException ex){
            System.out.println("No se pudo guardar el helado"+ex);
        }
    }
    public void vaciarNevera(){
        String code;
        ArrayList<Helado> helados =this.getTodos();
        helados.clear();
        try{
            File file=new File(this.ruta);
            FileWriter fr = new FileWriter(file, true);//prepara la escritura, recibe el , el booleano true: agraga al final del archivo, false: borra el archivo e inicia de nuevo
            PrintWriter pw = new PrintWriter(fr);
            pw.println(helados);   
            pw.close();
        }
        catch (IOException ex){
            System.out.println("No se pudo vaciar la nevera"+ex);
        }
        
    }
    public ArrayList<Helado> getTodos(){
        FileReader file;
        BufferedReader br;
        String registro;
        Helado hel=null;
        ArrayList<Helado> helados =new ArrayList();
        try{
            file= new FileReader(this.ruta);
            br= new BufferedReader(file);
            while((registro = br.readLine()) != null){
                String [] tokens = registro.split(",");
                for (int i = 0; i < 1; i++) {
                    hel=new Helado (tokens[0],tokens[1],tokens[2],tokens[3]);
                    helados.add(hel); 
                }    
            }    
        }
        catch(IOException ex){
            System.out.println("Falló cargando la asignatura"+ex);
        }
        return helados;
    }
}
