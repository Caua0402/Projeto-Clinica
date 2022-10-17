package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EspecialidadePanel extends javax.swing.JPanel {

    private int linha;
    
    public EspecialidadePanel() {
        initComponents();
        EspecialidadeDAO.criarListaDeEpecialidade();
        preencherTabela();
    }

    private int getLinha() {
        linha = tableEspecialidade.getSelectedRow();
        return linha;
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidade = new javax.swing.JTable();
        ButtonDelete = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonCriar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1000, 510));
        setLayout(null);

        tableEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        tableEspecialidade.setModel(new javax.swing.table.DefaultTableModel(
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
        tableEspecialidade.getTableHeader().setReorderingAllowed(false);
        ScrollEspecialidades.setViewportView(tableEspecialidade);

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
        ButtonCriar.setToolTipText("Criar Especialidade");
        ButtonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCriarActionPerformed(evt);
            }
        });
        add(ButtonCriar);
        ButtonCriar.setBounds(880, 310, 50, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCriarActionPerformed
        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true);
        especialidadeDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_ButtonCriarActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed

        if(getLinha() != -1){
            excluirEspecialidade();
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
            editarEspecialidade();
        }else{
            JOptionPane.showMessageDialog(this, 
                    "Por favor, selecione a especialidade que você deseja editar.",
                    "Especialidade",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ButtonEditarActionPerformed
        private void editarEspecialidade(){
            
            Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
            
            EspecialidadeDialog especialidadeDialog =
                new EspecialidadeDialog(null, true, EspecialidadeDAO.getEspecialidade(getCodigo()));
        
        especialidadeDialog.setVisible(true);
        preencherTabela();
        }
    
    private void excluirEspecialidade(){
        
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
        
        EspecialidadeDAO.excluir(getCodigo());
        preencherTabela();
        }
    }
    
    private Integer getCodigo(){
        String codigoStr = tableEspecialidade.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCriar;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JScrollPane ScrollEspecialidades;
    private javax.swing.JTable tableEspecialidade;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tableEspecialidade.setModel(EspecialidadeDAO.getEspecialidadeModel());
        ajustarTabela();
    }
    
    private void ajustarTabela() {
        
        //Impedir que o usuario movimenta as colunas 
        tableEspecialidade.getTableHeader().setReorderingAllowed(false);
        
        //Bloquear a edição das células da tabela
        tableEspecialidade.setDefaultEditor(Object.class, null);
        
        //Definir as larguras das colunas
        tableEspecialidade.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidade.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidade.getColumnModel().getColumn(1).setPreferredWidth(250);
        tableEspecialidade.getColumnModel().getColumn(2).setPreferredWidth(590);
        
    }
    
    
    
}
