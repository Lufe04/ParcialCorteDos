package Vista;
import Negocio.CilindroH;
import Negocio.Circulo;
import Negocio.CirculoH;
import Negocio.ConoH;
import Negocio.EsferaH;
import Negocio.Punto;
import Negocio.TroncoCono;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
public class Pizarra extends javax.swing.JFrame { //Pizarra hereda de la clase JFRame, o sea que pizarra puede acceder a todo lo que tiene la clase JFrame
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Dibujadorade Figuras");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("DrawPoint");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(51, 102, 255));
        jButton2.setText("Clean");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("Exit");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("DrawCircle");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("DrawSphere");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("DrawCylinder");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("DrawCone");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("DrawTronco");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton5)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton6)
                            .addComponent(jButton8))))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.buildPoint();
        this.drawPoint();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        this.jPanel2.paintAll(this.pintor);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        this.buildCircle();
        this.drawCircle();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        this.buildSphere();
        this.drawSphere();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        this.buildCylinder();
        this.drawCylinder();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        this.buildCone();
        this.drawCone();
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        this.buildTC();
        this.drawTC();
    }//GEN-LAST:event_jButton8MouseClicked

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
    private Punto elPunto;
    private Circulo elCirculo;
    private CirculoH elCirculoH;
    private EsferaH laEsfera;
    private CilindroH elCilindro;
    private ConoH elCono;
    private TroncoCono elTC;
    private Graphics pintor; //Graphics ya es una clase de java se importa
    public static void main(String args[]) {
        new Pizarra();
    }
    public Pizarra() {
        initComponents();//apenas yo construya un objeto de tipo pizarra, viene al constructor y corre initComponents para crear la ventan y objetos
        this.elPunto=null;
        this.elCirculo=null;
        this.laEsfera=null;
        this.elCilindro=null;
        this.elCono=null;
        this.elTC=null;
        this.pintor=null;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(600,600);//determina el tamaño deltablero, a su vez agranda toda la ventana
    }
    //metodos de servicio
    private void buildPoint(){
        int x, y;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del punto: "));
        y=Integer.parseInt(JOptionPane.showInputDialog("Digite la coordenada Y del punto: "));
        this.elPunto=new Punto(x,y);
        
    }
    private void drawPoint(){
        this.pintor=this.jPanel2.getGraphics(); // le dice al pintor donde va a ser la pintada
        this.pintor.drawOval(this.elPunto.getX(), this.elPunto.getY(), 1,1);
    }
    private void buildCircle(){
        int x, y, r;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del centro: "));
        y=Integer.parseInt(JOptionPane.showInputDialog("Digite la coordenada Y del centro: "));
        r=Integer.parseInt(JOptionPane.showInputDialog("Digite el radio: "));
        this.elCirculoH=new CirculoH(x,y,r);
        
    }
    private void drawCircle(){
        int Cx, Cy, radio, r, g, b, resp;
        String info = " ";
        this.pintor=this.jPanel2.getGraphics(); // le dice al pintor donde va a ser la pintada
        
        
        r=(int)(Math.random()*256);
        g=(int)(Math.random()*256);
        b=(int)(Math.random()*256);
        Color colorcito=new Color(r,g,b);
        this.pintor.setColor(colorcito);
        
        Cx=this.elCirculoH.getX();
        Cy=this.elCirculoH.getY();
        radio=this.elCirculoH.getRadio();
        this.pintor.drawOval(Cx-radio, Cy-radio,2*radio,2*radio);
        this.pintor.drawOval(Cx, Cy, 1,1);
        
        
        System.out.println(this.elCirculoH);
        resp=Integer.parseInt(JOptionPane.showInputDialog("Desea ver las propiedades? \n1. SI\n2. NO"));
        if (resp==1) {
            info+="Cx: "+Cx+"\n"+"Cy: "+Cy+"\n"+"Radio: "+radio+"\n"+"Perimetro: "+this.elCirculoH.getPerimetro()+"\n"
                    +"Area: "+this.elCirculoH.getArea();
            JOptionPane.showMessageDialog(null, info);
        }
    }
    private void buildSphere(){
        int x, y, r;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del centro: "));
        y=Integer.parseInt(JOptionPane.showInputDialog("Digite la coordenada Y del centro: "));
        r=Integer.parseInt(JOptionPane.showInputDialog("Digite el radio: "));
        this.laEsfera=new EsferaH(x,y,r);
    }
    private void drawSphere(){
        int Cx, Cy, radio, r, g, b, resp;
        String info = " ";
        this.pintor=this.jPanel2.getGraphics(); // le dice al pintor donde va a ser la pintada
        
        
        r=(int)(Math.random()*256);
        g=(int)(Math.random()*256);
        b=(int)(Math.random()*256);
        Color colorcito=new Color(r,g,b);
        this.pintor.setColor(colorcito);
        
        Cx=this.laEsfera.getX();
        Cy=this.laEsfera.getY();
        radio=this.laEsfera.getRadio();
        this.pintor.drawOval(Cx-radio, Cy-radio,2*radio,2*radio);
        this.pintor.drawOval(Cx-(radio), Cy-(radio/4), 2*radio, radio/2);
        this.pintor.drawOval(Cx, Cy, 1,1);
        
        
        System.out.println(this.laEsfera);
        resp=Integer.parseInt(JOptionPane.showInputDialog("Desea ver las propiedades? \n1. SI\n2. NO"));
        if (resp==1) {
            info+="Cx: "+Cx+"\n"+"Cy: "+Cy+"\n"+"Radio: "+radio+"\n"+"Volumen: "+this.laEsfera.getVolumen()+"\n"
                    +"Area: "+this.laEsfera.getArea();
            JOptionPane.showMessageDialog(null, info);
        } 
    }
    private void buildCylinder(){
        int x, y, r, h;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del centro: "));
        y=Integer.parseInt(JOptionPane.showInputDialog("Digite la coordenada Y del centro: "));
        r=Integer.parseInt(JOptionPane.showInputDialog("Digite el radio: "));
        h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del cilindro"));
        this.elCilindro=new CilindroH(x,y,r,h);
    }
    private void drawCylinder(){
         
        int Cx, Cy, radio, r, g, b, resp, h;
        String info = " ";
        this.pintor=this.jPanel2.getGraphics(); // le dice al pintor donde va a ser la pintada
        
        
        r=(int)(Math.random()*256);
        g=(int)(Math.random()*256);
        b=(int)(Math.random()*256);
        Color colorcito=new Color(r,g,b);
        this.pintor.setColor(colorcito);
        
        Cx=this.elCilindro.getX();
        Cy=this.elCilindro.getY();
        radio=this.elCilindro.getRadio();
        h=this.elCilindro.getH();
        this.pintor.drawOval(Cx-radio, Cy-(radio/4), 2*radio, radio/2);
        this.pintor.drawOval((Cx-radio), Cy-(radio/4)+h,2*radio,radio/2);
        this.pintor.drawLine(Cx-radio, Cy, Cx-(radio),Cy+h );
        this.pintor.drawLine(Cx+radio, Cy, Cx+(radio),Cy+h );
        this.pintor.drawOval(Cx, Cy, 1,1);
        
        
        System.out.println(this.elCilindro);
        resp=Integer.parseInt(JOptionPane.showInputDialog("Desea ver las propiedades? \n1. SI\n2. NO"));
        if (resp==1) {
            info+="Cx: "+Cx+"\n"+"Cy: "+Cy+"\n"+"Radio: "+radio+"\n"+"Volumen: "+this.elCilindro.getVolumen()+"\n"
                    +"Area: "+this.elCilindro.getArea();
            JOptionPane.showMessageDialog(null, info);
        } 
    }
        private void buildCone(){
            int x, y, r, h;
            x=Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del centro: "));
            y=Integer.parseInt(JOptionPane.showInputDialog("Digite la coordenada Y del centro: "));
            r=Integer.parseInt(JOptionPane.showInputDialog("Digite el radio: "));
            h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del cilindro"));
            this.elCono=new ConoH(x,y,r,h);
        } 
        private void drawCone(){
         
        int Cx, Cy, radio, r, g, b, resp, h;
        String info = " ";
        this.pintor=this.jPanel2.getGraphics(); // le dice al pintor donde va a ser la pintada
        
        
        r=(int)(Math.random()*256);
        g=(int)(Math.random()*256);
        b=(int)(Math.random()*256);
        Color colorcito=new Color(r,g,b);
        this.pintor.setColor(colorcito);
        
        Cx=this.elCono.getX();
        Cy=this.elCono.getY();
        radio=this.elCono.getRadio();
        h=this.elCono.getH();
        this.pintor.drawOval(Cx, Cy+h, 1,1);
        this.pintor.drawOval((Cx-radio), Cy-(radio/4)+h,2*radio,radio/2);
        this.pintor.drawLine(Cx, Cy, Cx-(radio),Cy+h );
        this.pintor.drawLine(Cx, Cy, Cx+(radio),Cy+h );
        
        System.out.println(this.elCono);
        resp=Integer.parseInt(JOptionPane.showInputDialog("Desea ver las propiedades? \n1. SI\n2. NO"));
        if (resp==1) {
            info+="Cx: "+Cx+"\n"+"Cy: "+Cy+"\n"+"Radio: "+radio+"\n"+"Volumen: "+this.elCono.getVolumen()+"\n"
                    +"Area: "+this.elCono.getArea();
            JOptionPane.showMessageDialog(null, info);
        } 
        }
        private void buildTC(){
        int x, y, r, r2, h, altinc;
            x=Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del centro: "));
            y=Integer.parseInt(JOptionPane.showInputDialog("Digite la coordenada Y del centro: "));
            r2=Integer.parseInt(JOptionPane.showInputDialog("Digite el radio de la parte inferior del Tronoco Cono: "));
            r=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio de la parte superior del Tronco Cono"));
            h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del tronco cono"));
            altinc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura inclinada del tronco cono"));
            this.elTC=new TroncoCono(x,y,r,r2,h,altinc);
        } 
        private void drawTC(){
            int Cx, Cy, radio, r, g, b, resp, h, altinc,r2;
            String info = " ";
            this.pintor=this.jPanel2.getGraphics(); // le dice al pintor donde va a ser la pintada
        
        
        r=(int)(Math.random()*256);
        g=(int)(Math.random()*256);
        b=(int)(Math.random()*256);
        Color colorcito=new Color(r,g,b);
        this.pintor.setColor(colorcito);
        
        Cx=this.elTC.getX();
        Cy=this.elTC.getY();
        radio=this.elTC.getRadio();
        h=this.elTC.getH();
        altinc=this.elTC.getAltinc();
        r2=this.elTC.getR2();
        this.pintor.drawOval(Cx, Cy, 1,1);
        this.pintor.fillOval((Cx-r2), Cy-(r2/4)+h,2*r2,r2/2);
        this.pintor.drawOval((Cx-r2), Cy-(r2/4)+h,2*r2,r2/2);
        this.pintor.drawOval((Cx-radio), Cy-(radio/4),2*radio,radio/2);
        this.pintor.fillOval((Cx-r2), Cy-(r2/4)+h,2*r2,r2/2);
        this.pintor.drawLine(Cx-radio, Cy, Cx-(r2),Cy+h );
        this.pintor.drawLine(Cx+radio, Cy, Cx+(r2),Cy+h );
        
        System.out.println(this.elTC);
        resp=Integer.parseInt(JOptionPane.showInputDialog("Desea ver las propiedades? \n1. SI\n2. NO"));
        if (resp==1) {
            info+="Cx: "+Cx+"\n"+"Cy: "+Cy+"\n"+"Radio: "+radio+"\n"+"Volumen: "+this.elTC.getVolumen()+"\n"
                    +"Area: "+this.elTC.getArea();
            JOptionPane.showMessageDialog(null, info);
        } 
        }
        
}
