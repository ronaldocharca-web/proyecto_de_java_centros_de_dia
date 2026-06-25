
package interfas;

import javax.swing.JOptionPane;
import proyectofinal.*;
public class PRINCIPAL extends javax.swing.JFrame {
    
     private MultiPilaFI B=new MultiPilaFI();
     private CCircularCu D1=new CCircularCu();
     private MLDobleC G=new MLDobleC();
     private LMultipleSimpleA H=new LMultipleSimpleA();

    public MultiPilaFI getB() {
        return B;
    }

    public void setB(MultiPilaFI B) {
        this.B = B;
    }

    public CCircularCu getD1() {
        return D1;
    }

    public void setD1(CCircularCu D1) {
        this.D1 = D1;
    }


    public MLDobleC getG() {
        return G;
    }

    public void setG(MLDobleC G) {
        this.G = G;
    }

    public LMultipleSimpleA getH() {
        return H;
    }

    public void setH(LMultipleSimpleA H) {
        this.H = H;
    }
      
        
    public PRINCIPAL() {
       
        PilaDN A1=new PilaDN();
        A1.adicionar(new DatoNino("Exalto", "Marcela", "Cesar", "Condori", "Mamani", 111, 9));
        A1.adicionar( new DatoNino("Juan", "María", "Carlos", "García", "Pérez",222,10));
        A1.adicionar( new DatoNino("Pedro", "Ana", "Sofía", "Rodríguez", "López",333,10));
        A1.adicionar( new DatoNino("Diego", "Elena", "Javier", "Martínez", "Sánchez",444,11));
        A1.adicionar( new DatoNino("Alejandro", "Laura", "Luis", "Gómez", "Fernández",555,11));
        A1.adicionar( new DatoNino("Santiago", "Andrea", "Gabriel", "Hernández", "Díaz",112,9));
        A1.adicionar( new DatoNino("Daniel", "Carolina", "David", "Moreno", "Jiménez",113,7));
        A1.adicionar( new DatoNino("Miguel", "Beatriz", "Samuel", "Vargas", "Dominguez",114,8));
        A1.adicionar( new DatoNino("Javier", "Carla", "Luz", "Rojas", "Herrera",115,9));
        A1.adicionar( new DatoNino("Gonzalo", "Fernanda", "Matías", "Fuentes", "Navarro",116,11));
        A1.adicionar( new DatoNino("Martín", "Natalia", "Benjamín", "Cabrera", "Guerrero",117,12));
        
        PilaDN A2=new PilaDN();
        A2.adicionar( new DatoNino("Francisco", "Valentina", "Niki", "Giménez", "Torres",118,9));
        A2.adicionar( new DatoNino("Ricardo", "Julia", "Alexander", "Santos", "Flores",221,9));
        A2.adicionar(new DatoNino("Roberto", "Camila", "Sebastián", "Mendoza", "Castillo",223,10));
        A2.adicionar( new DatoNino("Emilio", "Patricia", "Marcelina", "Luna", "Rivas",673,8));
        A2.adicionar( new DatoNino("Hugo", "Isabel", "Juan Pablo", "Silva", "Orozco",142,8));
        A2.adicionar( new DatoNino("Álvaro", "Antonella", "Lucinita", "Herrera", "Araya",973,9));
        A2.adicionar( new DatoNino("Sebastián", "Daniela", "Iker", "Castro", "Valenzuela",997,10));
        A2.adicionar(new DatoNino("Fernando", "Paula", "Renato", "Díaz", "Salazar",995,11));
        PilaDN A3=new PilaDN();
        A3.adicionar( new DatoNino("Agustín", "Constanza", "Emiliano", "Álvarez", "Vargas",993,9));
        A3.adicionar( new DatoNino("Simón", "Laura", "José Ignacio", "Gutiérrez", "Cortés",991,11));
        A3.adicionar( new DatoNino("Eduardo", "Micaela", "Leandro", "Pérez", "Torres",342,10));
        A3.adicionar( new DatoNino("Iván", "Florencia", "Mariano", "Romero", "Ríos",448,8));
        A3.adicionar( new DatoNino("Juan Pablo", "Valeria", "Maximiliano", "Ruiz", "Hernández",674,11));
        A3.adicionar( new DatoNino("Ignacio", "Agustina", "Tobías", "Alvarez", "Sosa",421,11));
        A3.adicionar( new DatoNino("Matías", "Marina", "Tomás", "Vega", "García",432,9));
        A3.adicionar( new DatoNino("Joaquín", "Catalina", "Ignacia", "Méndez", "Muñoz",521,11));
        PilaDN A4=new PilaDN();
        A4.adicionar( new DatoNino("Felipe", "Josefina", "Lucas", "Moreno", "Molina",551,10));
        A4.adicionar( new DatoNino("Diego", "Romina", "Juan Ignacio", "González", "Álvarez",998,11));
        A4.adicionar( new DatoNino("Pedro Pablo", "Bárbara", "Felipe", "Rivas", "Campos",881,9));
        A4.adicionar( new DatoNino("Nicolás", "Cecilia", "Ángel", "Soto", "Castro",773,11));
        A4.adicionar( new DatoNino("Tomás", "Antonia", "Santiago", "Martínez", "Pérez",771,11));
        A4.adicionar( new DatoNino("Gabriel", "Rocio", "Matías", "Fernández", "Gómez",449,11));
        A4.adicionar(new DatoNino("Rafael", "Camila", "Emmanuel", "Diaz", "Herrera",221,10));
        A4.adicionar(new DatoNino("Lucas", "Virginia", "Pedro", "Gutiérrez", "Muñoz",446,11));
        A4.adicionar(new DatoNino("Carlos", "Romina", "Daniel", "López", "Paz",442,9));
        A4.adicionar(new DatoNino("Andrés", "Abril", "David", "Ramírez", "Carrasco",441,11));
       
        
        B.setN(4);
        B.adicionar(1, new FechaInscrito("8:00 hasta 12:00", "11/01/2024", "Centro de Dia San Antonio", A1));
        B.adicionar(2, new FechaInscrito("12:00 hasta 18:00", "15/02/2024", "Centro de Dia San Juan", A2));
        B.adicionar(3, new FechaInscrito("10:00 hasta 12:00", "22/03/2024", "Centro de Dia San Pedro", A3));
        B.adicionar(4, new FechaInscrito("14:00 hasta 17:00", "28/07/2024", "Centro de Dia San Andres", A4));
        
       
       
        CCircularCr C1=new CCircularCr();
        C1.adicionar(new Cronograma("8:00","10:00", "Lunes-Viernes", "Lectura"));
        CCircularCr C2=new CCircularCr();
        C2.adicionar(new Cronograma("10:00","12:00", "Lunes-Viernes", "Lenguaje"));
        CCircularCr C3=new CCircularCr();
        C3.adicionar(new Cronograma("12:00","14:00", "Lunes-Viernes", "Almuerzo"));
        CCircularCr C4=new CCircularCr();
        C4.adicionar(new Cronograma("14:00","16:00", "Lunes-Viernes", "Matematica"));
        CCircularCr C5=new CCircularCr();
        C5.adicionar(new Cronograma("16:00","18:00", "Lunes-Viernes", "Recreacion"));
    
        
        D1.adicionar(new Cuidador("Juan", "Perrez", 22, 10001, "Centro de Dia San Atonio", C1));
        D1.adicionar(new Cuidador("Luis"," Rodriguez Ramirez",  26,12123998,"Centro de Dia San Antonio",C2));
        D1.adicionar(new Cuidador("Carlos"," Gomez Garcia",  25,12523998, "Centro de Dia San Antonio",C3));
        D1.adicionar(new Cuidador("Pedro ","Sanchez Valle",   25,12981236,"Centro de Dia San Antonio",C4));
        D1.adicionar(new Cuidador("Manue"," Cruz Ramirez",  29,22090909,"Centro de Dia San Antonio",C5));
       
       
        
        D1.adicionar(new Cuidador("Javier"," Ramirez Valle", 24, 60121911, "Centro de Dia San Juan",C1));
        D1.adicionar(new Cuidador("Roberto"," Garcia Sanchez", 23, 76729858, "Centro de Dia San Juan",C2));
        D1.adicionar(new Cuidador("Carlos ","Gomez Perez", 22, 60119010, "Centro de Dia San Juan",C3));
        D1.adicionar(new Cuidador("Manuel"," Valle Huaman", 32, 60090300, "Centro de Dia San Juan",C4));
       
       
        
        D1.adicionar(new Cuidador("Luis ","Rodriguez Ramirez", 22, 60101911, "Centro de Dia San Pedro",C1));
        D1.adicionar(new Cuidador("Carlos ","Gomez Garcia", 33, 76729858, "Centro de Dia San Pedro",C2));
        D1.adicionar(new Cuidador("Pedro ","Sanchez Valle", 23, 60119010, "Centro de Dia San Pedro",C3));
        D1.adicionar(new Cuidador("Manuel ","Cruz Ramirez", 20, 77771021, "Centro de Dia San Pedro",C4));
         
       
        
        D1.adicionar(new Cuidador("Roberto ","Ramirez Valle", 41, 60101911, "Centro de Dia San Andres",C1));
        D1.adicionar(new Cuidador("Luis ","Garcia Sanchez", 45, 76729858, "Centro de Dia San Andres",C3));
        D1.adicionar(new Cuidador("Carlos"," Gomez Perez", 29, 60119010, "Centro de Dia San Andres",C2));
        D1.adicionar(new Cuidador("Manuel"," Velas Huaman", 31, 60090300, "Centro de Dia San Andres",C5));
       
        LSimpleM E1=new LSimpleM();
        E1.adicionar(new Macrodistrito("San Antonio", "14-15-16-17"));
        LSimpleM E2=new LSimpleM();
        E2.adicionar(new Macrodistrito("Max Paredes", "7-8-9-10"));
        LSimpleM E3=new LSimpleM();
        E3.adicionar(new Macrodistrito("Centro", "1-2"));
        LSimpleM E4=new LSimpleM();
        E4.adicionar(new Macrodistrito("Mallasa", "20"));

        LDCircularZ F1=new LDCircularZ();
        F1.adicionar(new Zona("Zona San Antonio", E1));
        LDCircularZ F2=new LDCircularZ();
        F2.adicionar(new Zona("Zona Max Paredes", E2));
        LDCircularZ F3=new LDCircularZ();
        F3.adicionar(new Zona("Zona Central", E3));
        LDCircularZ F4=new LDCircularZ();
        F4.adicionar(new Zona("Zona Mallasila", E4));
        
      
        
       G.adicionar(new Centro("Centro de Dia San Antonio", F1)); 
       G.adicionar(new Centro("Centro de Dia San Juan", F2));
       G.adicionar(new Centro("Centro de Dia San Pedro", F3));
       G.adicionar(new Centro("Centro de Dia San Andres", F4));
     
        
      
        H.adicionar("01/01/2025", new Atencion("Pedro", "Año nuevo"));
        H.adicionar("01/01/2025", new Atencion("Andres", "Año nuevo"));
        H.adicionar("01/01/2025", new Atencion("Juan", "Año nuevo"));
        H.adicionar("01/01/2025", new Atencion("Antonio", "Año nuevo"));
        H.adicionar("01/05/2025", new Atencion("Pedro", "Dia del trabajo"));
        H.adicionar("01/05/2025", new Atencion("Andres", "Dia del trabajo"));
        H.adicionar("01/05/2025", new Atencion("Juan", "Dia del trabajo"));
        H.adicionar("01/05/2025", new Atencion("Antonio", "Dia del trabajo"));
       
       
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setText("PROYECTO FINAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 410, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 60, 503, -1));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel3.setText("“Los Centros de Día para la Atención Integral a la Niñez del GAMLP (Gobierno Autónomo Municipal de La Paz)”");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 37));

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jButton1.setText("Salir\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1012, 375, 110, 37));

        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton2.setText("Problemas ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 376, 159, 37));
        jButton2.getAccessibleContext().setAccessibleName("Problemas");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\ProyectoFinal\\src\\imagene\\paper-1074131_640.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setNextFocusableComponent(this);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 460));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\ProyectoFinal\\src\\imagene\\paper-1074131_640.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 510, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           this.setVisible(false);
           this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Problemas p=new Problemas(this);
        p.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
