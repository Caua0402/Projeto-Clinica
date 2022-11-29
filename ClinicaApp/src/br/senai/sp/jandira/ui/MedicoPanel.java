
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {
    
    
    private int linha;
    
    public MedicoPanel() {
        initComponents();
        MedicoDAO.criarListaDeMedicos();
        preencherTabela();
    }

    private int getLinha() {
        linha = tableMedico.getSelectedRow();
        return linha;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollEspecialidades = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        ButtonDelete = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonCriar = new javax.swing.JButton();

        setBackground(new java.awt.Color(187, 187, 187));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        setOpaque(false);
        setLayout(null);

        tableMedico.setBackground(new java.awt.Color(255, 255, 255));
        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMedico.getTableHeader().setReorderingAllowed(false);
        ScrollEspecialidades.setViewportView(tableMedico);

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

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed

        if(getLinha() != -1){
            MedicoDAO.excluirMedico(WIDTH);
        }else {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione o medico que você deseja exculuir",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
                    
        }
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed

        if(getLinha() != -1) {
           //OperacaoEnum.EDITAR();
        }else{
            JOptionPane.showMessageDialog(this,
                "Por favor, selecione o medico que você deseja editar.",
                "Medico",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCriarActionPerformed
        MedicoDialog medicoDialog =
        new MedicoDialog(null, true, OperacaoEnum.ADICIONAR);
        medicoDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_ButtonCriarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCriar;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JScrollPane ScrollEspecialidades;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables
    
    private void preencherTabela() {

        tableMedico.setModel(MedicoDAO.getMedicoModel());
        ajustarTabela();
    }
    
    private void ajustarTabela() {
        
        //Impedir que o usuario movimenta as colunas 
        tableMedico.getTableHeader().setReorderingAllowed(false);
        
        //Bloquear a edição das células da tabela
        tableMedico.setDefaultEditor(Object.class, null);
        
        //Definir as larguras das colunas
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(250);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(500);
        tableMedico.getColumnModel().getColumn(3).setPreferredWidth(100);
        
    }








}
