/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import dao.AnimalDAO;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.AnimalVO;
import servicos.AnimalServicos;
import servicos.ServicosFactory;

/**
 *
 * @author william
 */
public class UIBuscarAnimal extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código","NomeAnimal","Espécie","Raça","Dono","Sexo","Peso","Idade"});
    
    /**
     * Creates new form UIBuscarAnimal
     */
    public UIBuscarAnimal() {
        initComponents();
        
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableAnimal = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jtbuscar = new javax.swing.JTextField();
        jcItemList = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jlNome = new javax.swing.JLabel();
        jlEspecie = new javax.swing.JLabel();
        jlRaca = new javax.swing.JLabel();
        jlDono = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jlPeso = new javax.swing.JLabel();
        jlIdade = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtesp = new javax.swing.JTextField();
        jtraca = new javax.swing.JTextField();
        jtdono = new javax.swing.JTextField();
        jtsexo = new javax.swing.JTextField();
        jtpeso = new javax.swing.JTextField();
        jtidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbLimpar = new javax.swing.JButton();
        jbAtualizar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();

        setClosable(true);

        jtableAnimal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtableAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome Animal ", "Espécie", "Raça", "Dono", "Sexo", "Peso", "Idade"
            }
        ));
        jtableAnimal.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtableAnimal);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtbuscarKeyReleased(evt);
            }
        });

        jcItemList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "codigo", "nome", "especie", "raça", "dono", "masculino", "feminino", "peso", "idade" }));
        jcItemList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcItemListItemStateChanged(evt);
            }
        });

        jLayeredPane1.setLayer(jtbuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcItemList, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcItemList, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcItemList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("nome");

        jlEspecie.setText("especie");

        jlRaca.setText("raça");

        jlDono.setText("dono");

        jlSexo.setText("sexo");

        jlPeso.setText("peso");

        jlIdade.setText("idade");

        jLabel3.setText("codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlRaca)
                        .addGap(72, 72, 72)
                        .addComponent(jtraca))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlEspecie)
                        .addGap(57, 57, 57)
                        .addComponent(jtesp))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlNome)
                        .addGap(67, 67, 67)
                        .addComponent(jtNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jlDono)
                                .addGap(45, 45, 45))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlSexo)
                                .addGap(46, 46, 46)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlPeso)
                            .addGap(46, 46, 46)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlIdade)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtidade, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(jtpeso)
                    .addComponent(jtsexo)
                    .addComponent(jtdono))
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDono)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtdono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jlSexo)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEspecie)
                    .addComponent(jlPeso)
                    .addComponent(jtesp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRaca)
                    .addComponent(jlIdade)
                    .addComponent(jtraca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpTabelaLayout = new javax.swing.GroupLayout(jpTabela);
        jpTabela.setLayout(jpTabelaLayout);
        jpTabelaLayout.setHorizontalGroup(
            jpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jLayeredPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpTabelaLayout.setVerticalGroup(
            jpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTabelaLayout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela(){
        try {
            AnimalServicos AS = ServicosFactory.getAnimalServicos();
            ArrayList<AnimalVO> anims = AS.buscarAnimais();
            
            for(int i = 0; i<anims.size(); i++){
                dtm.addRow(new String[]{
                String.valueOf(anims.get(i).getIdAnimal()),
                anims.get(i).getNomeAnimal(),
                anims.get(i).getEspecie(),
                anims.get(i).getRaca(),
                anims.get(i).getNomeDono(),
                anims.get(i).getSexo(),
                String.valueOf(anims.get(i).getPeso()),
                String.valueOf(anims.get(i).getIdade())});
            }//fecha for
            jtableAnimal.setModel(dtm);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro! " +e.getMessage());
        }//fecha catch
    }//fecha preencherTabela
    
    private void limpar(){
        dtm.setNumRows(0);
    }
    
    private void deletar(){
          try {
            int linha = jtableAnimal.getSelectedRow();
            if (linha==-1) {
                JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
            } else{
                String id = jtableAnimal.getValueAt(linha,0).toString();
                
                int op = JOptionPane.showConfirmDialog(rootPane, "deseja mesmo deletar os dados?","Alerta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if (op==0) {
                AnimalServicos ps = ServicosFactory.getAnimalServicos();
                ps.deletarAnimal(Long.parseLong(id));
                
                JOptionPane.showMessageDialog(rootPane,"Registro animal apagado com sucesso");                    
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "erro"+e.getMessage());
        }
    }//deletar
    
    private void filtrar(){
        try {
            if(jtbuscar.getText().isEmpty()){
                limpar();
                preencherTabela();
            }else{
                String query="";
               String filtro= jcItemList.getSelectedItem().toString();
               if(filtro.equalsIgnoreCase("nome")){
                   query="where nomeanimal like '%"+jtbuscar.getText()+"%'";
               }else if(filtro.equalsIgnoreCase("codigo")){
                   query="where idanimal like'%"+jtbuscar.getText()+"%'";
               }else if(filtro.equalsIgnoreCase("dono")){
                   query="where nomeDono like'%"+jtbuscar.getText()+"%'";
               }else if(filtro.equalsIgnoreCase("peso")){
                   query="where peso like'%"+jtbuscar.getText()+"%'";
               }else if(filtro.equalsIgnoreCase("raca")){
                   query="where raca like'%"+jtbuscar.getText()+"%'";
               }else if(filtro.equalsIgnoreCase("idade")){
                   query="where idade like'%"+jtbuscar.getText()+"%'";
               }else if(filtro.equalsIgnoreCase("masculino")){
                   query="where sexo like masculino";
               }else if(filtro.equalsIgnoreCase("feminino")){
                   query="where sexo like feminino";
               }
               AnimalServicos as = ServicosFactory.getAnimalServicos();
               ArrayList<AnimalVO> anim = as.filtrar(query);
               for(int i = 0;i<anim.size();i++){
                  dtm.addRow(new String[]{
                    String.valueOf(anim.get(i).getIdAnimal()),
                    anim.get(i).getNomeAnimal(),
                    anim.get(i).getEspecie(),
                    anim.get(i).getRaca(),
                    anim.get(i).getNomeDono(),
                    anim.get(i).getSexo(),
                    String.valueOf(anim.get(i).getPeso()),
                    String.valueOf(anim.get(i).getIdade())
               });
               }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"" +e.getMessage());
        }
    }
    
    private void alterar(){
        int linha = jtableAnimal.getSelectedRow();
        if (linha==-1) {
            JOptionPane.showMessageDialog(rootPane,"Selecione uma linha");
        }
        jtCodigo.setText(jtableAnimal.getValueAt(linha, 0).toString());
        
        
        
        
        
        
        
        
        
        
        
    }
    
    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        // TODO add your handling code here:
        limpar();
        preencherTabela();
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        // TODO add your handling code here:
        deletar();
        limpar();
        preencherTabela();
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbuscarKeyReleased
        // TODO add your handling code here:
        limpar();
        filtrar();
    }//GEN-LAST:event_jtbuscarKeyReleased

    private void jcItemListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcItemListItemStateChanged
        // TODO add your handling code here:
        limpar();
        filtrar();
    }//GEN-LAST:event_jcItemListItemStateChanged
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox<String> jcItemList;
    private javax.swing.JLabel jlDono;
    private javax.swing.JLabel jlEspecie;
    private javax.swing.JLabel jlIdade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPeso;
    private javax.swing.JLabel jlRaca;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JPanel jpTabela;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTable jtableAnimal;
    private javax.swing.JTextField jtbuscar;
    private javax.swing.JTextField jtdono;
    private javax.swing.JTextField jtesp;
    private javax.swing.JTextField jtidade;
    private javax.swing.JTextField jtpeso;
    private javax.swing.JTextField jtraca;
    private javax.swing.JTextField jtsexo;
    // End of variables declaration//GEN-END:variables
}
