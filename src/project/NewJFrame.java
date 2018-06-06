package project;
import javax.swing.JFrame;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        this.setSize(750, 500);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(153, 0, 255));
        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Jugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 320, 164, 39);

        jButton2.setBackground(new java.awt.Color(153, 0, 255));
        jButton2.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 380, 63, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo6.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-70, -40, 840, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Pregunta x = new Pregunta();
        x.setVisible(true);
        dispose(); 
        BinaryTree testTree = new BinaryTree();
        testTree.insert("¿Tu personaje juega en el Real Madrid? ", 60);
        testTree.insert("¿Tu personaje es americano? ", 30);
        testTree.insert("¿Tu personaje es de Brasil? ", 20);
        testTree.insert("¿Tu personaje es de Costa Rica? ", 25);
        testTree.insert("¿Tu personaje juega de lateral?", 15);
        testTree.insert("¿Tu personaje es arquero? ", 22);
        testTree.insert("¿Tu personaje es Keylor Navas? ", 21);
        testTree.insert("¿Tu personaje es Marcelo? ", 13);
        testTree.insert("¿Tu personaje es Casemiro?", 17);
        testTree.insert("¿Tu personaje juega de volante?",40);
        testTree.insert("¿Tu personaje es aleman?",35);
        testTree.insert("¿Tu personaje es Tony Kroos?  ",32);
        testTree.insert("¿Tu personaje es español?  ",37);
        testTree.insert("¿Tu personaje es Isco?  ",36);
        testTree.insert("¿Tu personaje es Luka Modric?  ",38);
        testTree.insert("¿Tu personaje juega de delantero?  ",47);
        testTree.insert("¿Tu personaje jugo en la liga Inglesa?  ",45);
        testTree.insert("¿Tu personaje es Karim Benzema?  ",45);
        testTree.insert("¿Tu personaje tiene el dorsal 7?  ",43);
        testTree.insert("¿Tu personaje es Cristiano Ronaldo? ",41);
        testTree.insert("¿Tu personaje es Bale? ",44);
        testTree.insert("¿Tu personaje juega como defensa central? ",51);
        testTree.insert("¿Tu personaje es Español? ",49);
        testTree.insert("¿Tu personaje es Sergio Ramos? ",48);
        testTree.insert("¿Tu personaje es Varane? ",50);
        testTree.insert("¿Tu personaje juega como lateral? ",53);
        testTree.insert("¿Tu personaje es Arquero? ",55);
        testTree.insert("¿Tu personaje juega Kiko Casilla? ",54);
        testTree.insert("¿Tu personaje es Dani Carvajal? ",52);
        testTree.insert("¿Tu personaje es europeo? ",80);
        testTree.insert("¿Tu personaje es delantero? ",90);
        testTree.insert("¿Tu personaje es Argentino? ",85);
        testTree.insert("¿Tu personaje es Lionel Messi? ",83);
        testTree.insert("¿Tu personaje es Luis Suarez? ",87);
        testTree.insert("¿Tu personaje juega de defensa? ",95);
        testTree.insert("¿Tu personaje es Yerry Mina? ",93);
        testTree.insert("¿Tu personaje jugo en el Liverpool? ",98);
        testTree.insert("¿Tu personaje jugo en el Coutinho? ",97);
        testTree.insert("¿Tu personaje es Paulinho? ",99);
        testTree.insert("¿Tu personaje es español? ",70);
        testTree.insert("¿Tu personaje es Frances? ",75);
        testTree.insert("¿Tu personaje juega en la defensa? ",73);
        testTree.insert("¿Tu personaje es Ousmane Dembele? ",74);
        testTree.insert("¿Tu personaje es Samuel Umtiti? ",72);
        testTree.insert("¿Tu personaje es arquero? ",77);
        testTree.insert("¿Tu personaje es Marc Andre Ter Stegen? ",76);
        testTree.insert("¿Tu personaje es volante? ",78);
        testTree.insert("¿Tu personaje es Ivan Rakitic? ",79);
        testTree.insert("¿Tu personaje es volante? ",65);
        testTree.insert("¿Tu personaje es Sergio Busquets? ",63);
        testTree.insert("¿Tu personaje es lateral? ",67);
        testTree.insert("¿Tu personaje es Jordi Alba? ",66);
        testTree.insert("¿Tu personaje es Gerard Pieque? ",68);
        testTree.Questions(testTree.root);
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
