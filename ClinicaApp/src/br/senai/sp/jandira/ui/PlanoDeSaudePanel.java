
package br.senai.sp.jandira.ui;



import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class PlanoDeSaudePanel extends javax.swing.JPanel {

    
    private int linha;
    
    public PlanoDeSaudePanel() {
        initComponents();
        PlanoDeSaudeDAO.criarListaPlanosDeSaude();
        preencherTabela();
    }
    
    private int getLinha() {
        linha = tablePlnoDeSaude.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollEspecialidades = new javax.swing.JScrollPane();
        tablePlnoDeSaude = new javax.swing.JTable();
        ButtonDelete = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonCriar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(null);

        tablePlnoDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        tablePlnoDeSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablePlnoDeSaude.getTableHeader().setReorderingAllowed(false);
        ScrollEspecialidades.setViewportView(tablePlnoDeSaude);

        add(ScrollEspecialidades);
        ScrollEspecialidades.setBounds(10, 20, 960, 280);

        ButtonDelete.setBackground(new java.awt.Color(255, 255, 255));
        ButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/delete32.png"))); // NOI18N
        ButtonDelete.setToolTipText("Delete");
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });
        add(ButtonDelete);
        ButtonDelete.setBounds(760, 310, 50, 40);

        ButtonEditar.setBackground(new java.awt.Color(255, 255, 255));
        ButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/Lapis1.png"))); // NOI18N
        ButtonEditar.setToolTipText("Editar");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });
        add(ButtonEditar);
        ButtonEditar.setBounds(820, 310, 50, 40);

        ButtonCriar.setBackground(new java.awt.Color(255, 255, 255));
        ButtonCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/plus32.png"))); // NOI18N
        ButtonCriar.setToolTipText("Criar Plano");
        ButtonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCriarActionPerformed(evt);
            }
        });
        add(ButtonCriar);
        ButtonCriar.setBounds(880, 310, 50, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        
        if(getLinha() != -1){
            excluirPlano();
        }else {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione a especialidade qe você deseja exculuir",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
                    
        }
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        
        if(getLinha() != -1) {
            editarPlano();
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Por favor, selecione a especialidade que você deseja editar.",
                    "Especialidade",
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCriarActionPerformed
       PlanoDeSaudeDialog planoDeSaudeDialog =
                new PlanoDeSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_ButtonCriarActionPerformed

    
    private void excluirPlano(){
        
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
        
        PlanoDeSaudeDAO.excluir(getCodigo());
        preencherTabela();
        }
    }
    
     private void editarPlano(){
            
            PlanoSaude planoDeSaude = PlanoDeSaudeDAO.get(getCodigo());
            
            PlanoDeSaudeDialog planoDeSaudeDialog =
                new PlanoDeSaudeDialog(null,
                        true,
                        planoDeSaude, OperacaoEnum.EDITAR);
        
        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
        }
    
    private Integer getCodigo(){
        String codigoStr = tablePlnoDeSaude.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCriar;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JScrollPane ScrollEspecialidades;
    private javax.swing.JTable tablePlnoDeSaude;
    // End of variables declaration//GEN-END:variables
    
     private void preencherTabela() {

        tablePlnoDeSaude.setModel(PlanoDeSaudeDAO.getPlanoDeSaudeModel());
        ajustarTabela();
    }
    
    private void ajustarTabela() {
        
        //Impedir que o usuario movimenta as colunas 
        tablePlnoDeSaude.getTableHeader().setReorderingAllowed(false);
        
        //Bloquear a edição das células da tabela
        tablePlnoDeSaude.setDefaultEditor(Object.class, null);
        
        //Definir as larguras das colunas
        tablePlnoDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlnoDeSaude.getColumnModel().getColumn(0).setPreferredWidth(90);
        tablePlnoDeSaude.getColumnModel().getColumn(1).setPreferredWidth(100);
        tablePlnoDeSaude.getColumnModel().getColumn(2).setPreferredWidth(375);
        tablePlnoDeSaude.getColumnModel().getColumn(3).setPreferredWidth(300);
    }

}
