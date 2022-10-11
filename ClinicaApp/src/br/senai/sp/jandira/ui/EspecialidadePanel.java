package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import javax.swing.table.DefaultTableModel;

public class EspecialidadePanel extends javax.swing.JPanel {

    public EspecialidadePanel() {
        initComponents();
        EspecialidadeDAO.criarListaDeEpecialidade();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollEspecialidades = new javax.swing.JScrollPane();
        TableEspecialidade = new javax.swing.JTable();
        ButtonDelete = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonCriar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(18, 7, 183))); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(980, 390));
        setLayout(null);

        TableEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        TableEspecialidade.setModel(new javax.swing.table.DefaultTableModel(
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
        ScrollEspecialidades.setViewportView(TableEspecialidade);

        add(ScrollEspecialidades);
        ScrollEspecialidades.setBounds(10, 20, 960, 290);

        ButtonDelete.setBackground(new java.awt.Color(187, 187, 187));
        ButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/delete32.png"))); // NOI18N
        ButtonDelete.setToolTipText("Delete");
        add(ButtonDelete);
        ButtonDelete.setBounds(780, 330, 50, 40);

        ButtonEditar.setBackground(new java.awt.Color(187, 187, 187));
        ButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/Lapis1.png"))); // NOI18N
        ButtonEditar.setToolTipText("Editar");
        add(ButtonEditar);
        ButtonEditar.setBounds(850, 330, 50, 40);

        ButtonCriar.setBackground(new java.awt.Color(187, 187, 187));
        ButtonCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/plus32.png"))); // NOI18N
        ButtonCriar.setToolTipText("Criar Especialidade");
        add(ButtonCriar);
        ButtonCriar.setBounds(920, 330, 50, 40);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCriar;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JScrollPane ScrollEspecialidades;
    private javax.swing.JTable TableEspecialidade;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        TableEspecialidade.setModel(EspecialidadeDAO.getEspecialidadeModel());
        
    }

}
