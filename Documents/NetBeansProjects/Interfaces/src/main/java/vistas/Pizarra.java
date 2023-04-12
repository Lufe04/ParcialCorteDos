package vistas;
import negocio.CirculoH;
import negocio.Punto;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import negocio.CilindroH;
import negocio.Cono;
import negocio.Cubo;
import negocio.EsferaH;
import negocio.Figura;
import negocio.Piramide;
import negocio.Rectangulo;
import negocio.TroncoCono;
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
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Dibujadorade Figuras");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Punto");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jButton4.setText("Circulo");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Esfera");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("Cono");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("Cilindro");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("TroncoCono");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("Rectangulo");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton10.setText("Piramide");
        jButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton11.setText("cubo");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5)
                    .addComponent(jButton7)
                    .addComponent(jButton2)
                    .addComponent(jButton9)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton8)
                    .addComponent(jButton3)
                    .addComponent(jButton10))
                .addContainerGap(12, Short.MAX_VALUE))
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
            .addGap(0, 443, Short.MAX_VALUE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.tipo=1;//punto
        this.buildFigure();
        this.drawFigure();
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
        this.tipo=2;//circulo
        this.buildFigure();
        this.drawFigure();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        this.tipo=4;//cono
        this.buildFigure();
        this.drawFigure();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        this.tipo=3;// esfera
        this.buildFigure();
        this.drawFigure();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        this.tipo=5;//cilindro
        this.buildFigure();
        this.drawFigure();        
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        this.tipo=6;//Tronco Cono
        this.buildFigure();
        this.drawFigure();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        this.tipo=7; //rectangulo
        this.buildFigure();
        this.drawFigure();
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
        this.tipo=8; //piramide
        this.buildFigure();
        this.drawFigure();
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
        this.tipo=9;//cubo
        this.buildFigure();
        this.drawFigure();
    }//GEN-LAST:event_jButton11MouseClicked

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
    
    private Figura laFigura;
    private int tipo;
    private Graphics pintor; //Graphics ya es una clase de java se importa
    
    public static void main(String args[]) {
        new Pizarra();
    }
    public Pizarra() {
        initComponents();//apenas yo construya un objeto de tipo pizarra, viene al constructor y corre initComponents para crear la ventan y objetos
        
        this.laFigura=null;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.pintor=this.jPanel2.getGraphics(); 
        this.setSize(600,600);//determina el tamaño deltablero, a su vez agranda toda la ventana
    }
       
    private void buildFigure(){
        int x,y,r,h,r2,a,l1,l2;
        if(this.tipo==1){ //punto
            x=Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del punto: "));
            y=Integer.parseInt(JOptionPane.showInputDialog("Digite la coordenada Y del punto: "));
            this.laFigura=new Punto(x,y);
        }
        if (this.tipo==2) { //circulo
            x=Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del centro: "));
            y=Integer.parseInt(JOptionPane.showInputDialog("Digite la coordenada Y del centro: "));
            r=Integer.parseInt(JOptionPane.showInputDialog("Digite el radio: "));
            this.laFigura=new CirculoH(x,y,r);
        }
        if (this.tipo==3) { //esfera
            x=Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del centro: "));
            y=Integer.parseInt(JOptionPane.showInputDialog("Digite la coordenada Y del centro: "));
            r=Integer.parseInt(JOptionPane.showInputDialog("Digite el radio: "));
            this.laFigura=new EsferaH (x,y,r);
        }
        if (this.tipo==4) { //cono
            x=Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del centro: "));
            y=Integer.parseInt(JOptionPane.showInputDialog("Digite la coordenada Y del centro: "));
            r=Integer.parseInt(JOptionPane.showInputDialog("Digite el radio: "));
            h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del cono: "));
            this.laFigura=new Cono (x,y,r,h);
        }
        if(this.tipo==5){ //cilindro
            x=Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del centro: "));
            y=Integer.parseInt(JOptionPane.showInputDialog("Digite la coordenada Y del centro: "));
            r=Integer.parseInt(JOptionPane.showInputDialog("Digite el radio: "));
            h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del cilindro"));
            this.laFigura=new CilindroH(x,y,r,h);
        }
        if(this.tipo==6){//Tronco cono
            x=Integer.parseInt(JOptionPane.showInputDialog("Digite coordenada X del centro: "));
            y=Integer.parseInt(JOptionPane.showInputDialog("Digite la coordenada Y del centro: "));
            r2=Integer.parseInt(JOptionPane.showInputDialog("Digite el radio de la parte inferior del Tronoco Cono: "));
            r=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio de la parte superior del Tronco Cono"));
            h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del tronco cono"));
            this.laFigura=new TroncoCono(x,y,r,r2,h);
        }
        if (this.tipo==7) {//Rectangulo
            x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada x\n Será el punto izquierdo superior del rectangulo."));
            y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada y\n Será el punto izquierdo superior del rectangulo."));
            h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
            a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho del triangulo"));
            this.laFigura= new Rectangulo (x,y,h,a);
        }
        if(this.tipo== 8){// piramide
            x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada x\n Será el punto izquierdo superior de la base de la piramide"));
            y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada y\n Será el punto izquierdo superior de la base de la piramide"));
            h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura de la piramide triangular"));
            l1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado a de la base de la piramide"));
            l2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado a de la base de la piramide"));
            this.laFigura= new Piramide (x,y,h,l1,l2);
        }
        if(this.tipo==9){//cubo
            x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada x\n Será el punto izquierdo superior de la base de la piramide"));
            y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada y\n Será el punto izquierdo superior de la base de la piramide"));
            h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura de los lados del cubo"));
            this.laFigura= new Cubo (x,y,h);
        }
        if(this.tipo==10){//triangulo
            
        }
        if(this.tipo==11){//piramide triangular
            
        }
        if ((this.tipo==12)) {//prisma triangular
            
        }
        
    }
    private void drawFigure(){
        int r, g, b, Cx, Cy, radio, resp, h, r2,a,l1,l2,x;
        
        r=(int)(Math.random()*256);
        g=(int)(Math.random()*256);
        b=(int)(Math.random()*256);
        
        Color colorcito=new Color(r,g,b);
        this.pintor.setColor(colorcito);
        
        if(this.tipo==1){ //punto
           this.pintor.drawOval(this.laFigura.getX(), this.laFigura.getY(), 1,1);
        }
        
        if(this.tipo==2){ //circulo
            Cx=this.laFigura.getX();
            Cy=this.laFigura.getY();
            radio=this.laFigura.getDim1();
            this.pintor.drawOval(Cx-radio, Cy-radio,2*radio,2*radio);
            this.pintor.drawOval(Cx, Cy, 1,1);
            resp=Integer.parseInt(JOptionPane.showInputDialog("Desea ver las propiedades de la figura?\n1. Si\n2. No"));
            if (resp==1) {
                this.seePropertiesFigure();
            }
        }
        if (this.tipo==3) {//esfera
            Cx=this.laFigura.getX();
            Cy=this.laFigura.getY();
            radio=this.laFigura.getDim1();
            this.pintor.drawOval(Cx-radio, Cy-radio,2*radio,2*radio);
            this.pintor.drawOval(Cx-(radio), Cy-(radio/4), 2*radio, radio/2);
            this.pintor.drawOval(Cx, Cy, 1,1);
        }
        if (this.tipo==4) {//cono
            Cx=this.laFigura.getX();
            Cy=this.laFigura.getY();
            radio=this.laFigura.getDim1();
            h=this.laFigura.getDim2();
            this.pintor.drawOval(Cx, Cy+h, 1,1);
            this.pintor.drawOval((Cx-radio), Cy-(radio/4)+h,2*radio,radio/2);
            this.pintor.drawLine(Cx, Cy, Cx-(radio),Cy+h );
            this.pintor.drawLine(Cx, Cy, Cx+(radio),Cy+h );
        }
        if(this.tipo==5){//cilindro
            Cx=this.laFigura.getX();
            Cy=this.laFigura.getY();
            radio=this.laFigura.getDim1();
            h=this.laFigura.getDim2();
            this.pintor.drawOval(Cx-radio, Cy-(radio/4), 2*radio, radio/2);
            this.pintor.drawOval((Cx-radio), Cy-(radio/4)+h,2*radio,radio/2);
            this.pintor.drawLine(Cx-radio, Cy, Cx-(radio),Cy+h );
            this.pintor.drawLine(Cx+radio, Cy, Cx+(radio),Cy+h );
            this.pintor.drawOval(Cx, Cy, 1,1);
        }
        if(this.tipo==6){//Trono Cono
            Cx=this.laFigura.getX();
            Cy=this.laFigura.getY();
            radio=this.laFigura.getDim1();
            h=this.laFigura.getDim2();
            r2=this.laFigura.getDim3();
            this.pintor.drawOval(Cx, Cy, 1,1);
            this.pintor.fillOval((Cx-r2), Cy-(r2/4)+h,2*r2,r2/2);
            this.pintor.drawOval((Cx-r2), Cy-(r2/4)+h,2*r2,r2/2);
            this.pintor.drawOval((Cx-radio), Cy-(radio/4),2*radio,radio/2);
            this.pintor.fillOval((Cx-r2), Cy-(r2/4)+h,2*r2,r2/2);
            this.pintor.drawLine(Cx-radio, Cy, Cx-(r2),Cy+h );
            this.pintor.drawLine(Cx+radio, Cy, Cx+(r2),Cy+h );
        }
        if (this.tipo==7) {//Rectangulo
            Cx=this.laFigura.getX();
            Cy=this.laFigura.getY();
            h=this.laFigura.getDim1();
            a=this.laFigura.getDim2();
            this.pintor.drawRect(Cx, Cy, a, h);
        }
        if(this.tipo== 8){// piramide
            Cx=this.laFigura.getX();
            Cy=this.laFigura.getY();
            h=this.laFigura.getDim3();
            l1=this.laFigura.getDim1();
            l2=this.laFigura.getDim2();
            this.pintor.drawLine(Cx, Cy, Cx+l1, Cy);
           
        }
        if(this.tipo==9){//cubo
            Cx=this.laFigura.getX();
            Cy=this.laFigura.getY();
            h=this.laFigura.getDim1();
            this.pintor.drawLine(Cx, Cy, Cx+h, Cy);
            this.pintor.drawLine(Cx, Cy, Cx-(2*h/3) , Cy+(2*h/3));
            this.pintor.drawLine(Cx-(2*h/3) , Cy+(2*h/3), Cx-(2*h/3) +h , Cy+(2*h/3));
            this.pintor.drawLine(Cx-(2*h/3) +h , Cy+(2*h/3), Cx+h, Cy);
            
            
            
        }
        if(this.tipo==10){//triangulo
            //this.pintor.drawLine(Cx, Cy, Cx-(2*h/3) , Cy+(2*h/3));
            //this.pintor.drawLine(Cx-(2*h/3) , Cy+(2*h/3), Cx-(2*h/3) +h , Cy+(2*h/3));
            //this.pintor.drawLine(Cx-(2*h/3) +h , Cy+(2*h/3), Cx,Cy);
            
            
        }
        if(this.tipo==11){//piramide triangular
            
        }
        if ((this.tipo==12)) {//prisma triangular
            
        }
    }
    private void seePropertiesFigure(){
        int Cx, Cy, radio, l1, l2;
        float peri, area, volum;
        String info=" ";
        Cx=this.laFigura.getX();
        Cy=this.laFigura.getY();
        if(this.tipo==2){ //circulo
            radio=this.laFigura.getDim1();
            peri=this.laFigura.getPerimetro();
            area=this.laFigura.getArea();
            info+="Cx: "+Cx+"\n"+"Cy: "+Cy+"\n"+"Radio: "+radio+"\n"+"Perimetro: "+peri+"\n"
                    +"Area: "+area;
            JOptionPane.showMessageDialog(null, info);
        }
        if(this.tipo==3){//esfera
            radio=this.laFigura.getDim1();
            area=this.laFigura.getArea();
            volum=this.laFigura.getVolumen();
            info+="Cx: "+Cx+"\n"+"Cy: "+Cy+"\n"+"Radio: "+radio+"\n"+"Volumen: "+volum+"\n"
                    +"Area: "+area;
            JOptionPane.showMessageDialog(null, info);
        }
        if(this.tipo==4){//cono
            radio=this.laFigura.getDim1();
            area=this.laFigura.getArea();
            volum=this.laFigura.getVolumen();
            info+="Cx: "+Cx+"\n"+"Cy: "+Cy+"\n"+"Radio: "+radio+"\n"+"Volumen: "+volum+"\n"
                    +"Area: "+area;
            JOptionPane.showMessageDialog(null, info);
        }
        if(this.tipo==5){//cilindro
            radio=this.laFigura.getDim1();
            area=this.laFigura.getArea();
            volum=this.laFigura.getVolumen();
            info+="Cx: "+Cx+"\n"+"Cy: "+Cy+"\n"+"Radio: "+radio+"\n"+"Volumen: "+volum+"\n"
                    +"Area: "+area;
            JOptionPane.showMessageDialog(null, info);
        }
        if(this.tipo==6){//Tronco cono
            radio=this.laFigura.getDim1();
            area=this.laFigura.getArea();
            volum=this.laFigura.getVolumen();
            info+="Cx: "+Cx+"\n"+"Cy: "+Cy+"\n"+"Radio: "+radio+"\n"+"Volumen: "+volum+"\n"
                    +"Area: "+area;
            JOptionPane.showMessageDialog(null, info);
        }
        if (this.tipo==7) {//Rectangulo
            l1=this.laFigura.getDim1();
            l2=this.laFigura.getDim2();
            area=this.laFigura.getArea();
            peri=this.laFigura.getPerimetro();
            info+="Cx: "+Cx+"\n"+"Cy: "+Cy+"\n"+"Lado 1: "+l1+"\n"+"Lado 2: "+l2+"\n"+"Perimetro: "+peri+"\n"
                    +"Area: "+area;
            JOptionPane.showMessageDialog(null, info);
            
        }
        if(this.tipo== 8){// piramide
            
        }
        if(this.tipo==9){//cubo
            
        }
        if(this.tipo==10){//triangulo
            
        }
        if(this.tipo==11){//piramide triangular
            
        }
        if ((this.tipo==12)) {//prisma triangular
            
        }
        
    }       
}
