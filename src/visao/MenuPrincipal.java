/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author William
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAreaTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmCadAnimal = new javax.swing.JMenuItem();
        jmManutencao = new javax.swing.JMenu();
        jmManAnimal = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jAreaTrabalhoLayout = new javax.swing.GroupLayout(jAreaTrabalho);
        jAreaTrabalho.setLayout(jAreaTrabalhoLayout);
        jAreaTrabalhoLayout.setHorizontalGroup(
            jAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jAreaTrabalhoLayout.setVerticalGroup(
            jAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jmCadastro.setText("Cadastro");

        jmCadAnimal.setText("Animal");
        jmCadAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadAnimalActionPerformed(evt);
            }
        });
        jmCadastro.add(jmCadAnimal);

        jMenuBar1.add(jmCadastro);

        jmManutencao.setText("Manutenção");

        jmManAnimal.setText("Animal");
        jmManAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManAnimalActionPerformed(evt);
            }
        });
        jmManutencao.add(jmManAnimal);

        jMenuBar1.add(jmManutencao);

        jmSair.setText("Sair");
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jAreaTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jAreaTrabalho, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirCadAnimal(){
        UICadAnimal uca = new UICadAnimal();
        jAreaTrabalho.add(uca);
        uca.setVisible(true);
    }
    
    private void abrirBuscarAnimal(){
        UIBuscarAnimal uba = new UIBuscarAnimal();
        jAreaTrabalho.add(uba);
        uba.setVisible(true);
    }
    
    private void jmCadAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadAnimalActionPerformed
        abrirCadAnimal();
    }//GEN-LAST:event_jmCadAnimalActionPerformed

    private void jmManAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManAnimalActionPerformed
        abrirBuscarAnimal();
    }//GEN-LAST:event_jmManAnimalActionPerformed

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jmSairMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jAreaTrabalho;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmCadAnimal;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenuItem jmManAnimal;
    private javax.swing.JMenu jmManutencao;
    private javax.swing.JMenu jmSair;
    // End of variables declaration//GEN-END:variables
}
