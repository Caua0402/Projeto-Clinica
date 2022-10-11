
package br.senai.sp.jandira.ui;

import java.awt.Toolkit;


public class ClinicaFrame extends javax.swing.JFrame {

    private EspecialidadePanel especialidadePanel;
    private final int POS_X = 10;
    private final int POS_Y = 150;
    private final int POS_WIDTH = 980;
    private final int POS_HEIGHT = 390;
    
    public ClinicaFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagem/Calendar.png")));
        initPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelDeTitulo = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        LabelCalendario = new javax.swing.JLabel();
        PanelMain = new javax.swing.JPanel();
        ButtonPlanoSaude = new javax.swing.JButton();
        ButtonEspecialidade = new javax.swing.JButton();
        ButtonMédicos = new javax.swing.JButton();
        ButtonPaciente = new javax.swing.JButton();
        ButtonAgenda = new javax.swing.JButton();
        ButtonHome = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();
        PainelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setBackground(new java.awt.Color(150, 150, 150));
        setResizable(false);
        getContentPane().setLayout(null);

        PainelDeTitulo.setBackground(new java.awt.Color(0, 16, 33));
        PainelDeTitulo.setLayout(null);

        LabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(23, 114, 255));
        LabelTitulo.setText("Sistemas para Agendamento de Consultas ");
        PainelDeTitulo.add(LabelTitulo);
        LabelTitulo.setBounds(80, 20, 510, 28);

        LabelCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/Calendar.png"))); // NOI18N
        PainelDeTitulo.add(LabelCalendario);
        LabelCalendario.setBounds(10, 0, 70, 70);

        getContentPane().add(PainelDeTitulo);
        PainelDeTitulo.setBounds(0, 0, 1000, 80);

        PanelMain.setBackground(new java.awt.Color(165, 165, 165));
        PanelMain.setLayout(null);

        ButtonPlanoSaude.setBackground(new java.awt.Color(54, 202, 210));
        ButtonPlanoSaude.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonPlanoSaude.setForeground(new java.awt.Color(0, 0, 0));
        ButtonPlanoSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/badge.png"))); // NOI18N
        ButtonPlanoSaude.setText("Plano de Saúde");
        ButtonPlanoSaude.setToolTipText("Plano de Saúde");
        ButtonPlanoSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlanoSaudeActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonPlanoSaude);
        ButtonPlanoSaude.setBounds(660, 20, 150, 27);

        ButtonEspecialidade.setBackground(new java.awt.Color(54, 202, 210));
        ButtonEspecialidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        ButtonEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/stethoscope.png"))); // NOI18N
        ButtonEspecialidade.setText("Especialidade");
        ButtonEspecialidade.setToolTipText("Especialidade");
        ButtonEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEspecialidadeActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonEspecialidade);
        ButtonEspecialidade.setBounds(510, 20, 140, 27);

        ButtonMédicos.setBackground(new java.awt.Color(54, 202, 210));
        ButtonMédicos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonMédicos.setForeground(new java.awt.Color(0, 0, 0));
        ButtonMédicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/doctor.png"))); // NOI18N
        ButtonMédicos.setText("Médicos");
        ButtonMédicos.setToolTipText("Médicos");
        ButtonMédicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMédicosActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonMédicos);
        ButtonMédicos.setBounds(390, 20, 110, 27);

        ButtonPaciente.setBackground(new java.awt.Color(54, 202, 210));
        ButtonPaciente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonPaciente.setForeground(new java.awt.Color(0, 0, 0));
        ButtonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/Paciente.png"))); // NOI18N
        ButtonPaciente.setText("Paciente");
        ButtonPaciente.setToolTipText("Paciente");
        ButtonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPacienteActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonPaciente);
        ButtonPaciente.setBounds(270, 20, 110, 27);

        ButtonAgenda.setBackground(new java.awt.Color(54, 202, 210));
        ButtonAgenda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonAgenda.setForeground(new java.awt.Color(0, 0, 0));
        ButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/ImagemCalendar_1.png"))); // NOI18N
        ButtonAgenda.setText("Agenda");
        ButtonAgenda.setToolTipText("Agenda");
        ButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendaActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonAgenda);
        ButtonAgenda.setBounds(150, 20, 110, 27);

        ButtonHome.setBackground(new java.awt.Color(54, 202, 210));
        ButtonHome.setForeground(new java.awt.Color(0, 0, 0));
        ButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/home-button (1).png"))); // NOI18N
        ButtonHome.setText("Home");
        ButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHomeActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonHome);
        ButtonHome.setBounds(30, 20, 110, 25);

        ButtonSair.setBackground(new java.awt.Color(54, 202, 210));
        ButtonSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonSair.setForeground(new java.awt.Color(0, 0, 0));
        ButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/logout32.png"))); // NOI18N
        ButtonSair.setText("Sair");
        ButtonSair.setToolTipText("Sair");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });
        PanelMain.add(ButtonSair);
        ButtonSair.setBounds(880, 10, 120, 40);

        PainelHome.setBackground(new java.awt.Color(255, 255, 255));
        PainelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PainelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PainelHome.setOpaque(false);
        PainelHome.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 114, 255));
        jLabel1.setText("SISACON");
        PainelHome.add(jLabel1);
        jLabel1.setBounds(10, 10, 110, 32);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sistemas para Agendamento de Consultas");
        PainelHome.add(jLabel2);
        jLabel2.setBounds(10, 40, 230, 16);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Suporte Técnico:");
        PainelHome.add(jLabel4);
        jLabel4.setBounds(10, 70, 280, 16);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(82, 82, 82));
        jLabel5.setText("E-mail: suporte11@gmail.com");
        PainelHome.add(jLabel5);
        jLabel5.setBounds(10, 90, 280, 16);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(82, 82, 82));
        jLabel6.setText("www.sisacon.com.br");
        PainelHome.add(jLabel6);
        jLabel6.setBounds(10, 130, 280, 16);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(82, 82, 82));
        jLabel7.setText("Tefone: (11)94478-4208");
        PainelHome.add(jLabel7);
        jLabel7.setBounds(10, 110, 280, 16);

        jPanel2.setBackground(new java.awt.Color(23, 114, 255));
        jPanel2.setAlignmentX(1.0F);
        jPanel2.setAlignmentY(2.0F);
        PainelHome.add(jPanel2);
        jPanel2.setBounds(10, 60, 960, 5);

        PanelMain.add(PainelHome);
        PainelHome.setBounds(10, 70, 980, 390);

        getContentPane().add(PanelMain);
        PanelMain.setBounds(0, 80, 1000, 510);

        setSize(new java.awt.Dimension(1016, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void ButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHomeActionPerformed
        ButtonEspecialidade.setBackground(new java.awt.Color(0,255,127));
        ButtonHome.setBackground(new java.awt.Color(0,191,255));
        PainelHome.setVisible(true);
        especialidadePanel.setVisible(false);
    }//GEN-LAST:event_ButtonHomeActionPerformed

    private void ButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAgendaActionPerformed

    private void ButtonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonPacienteActionPerformed

    private void ButtonMédicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMédicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonMédicosActionPerformed

    private void ButtonEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEspecialidadeActionPerformed
        ButtonEspecialidade.setBackground(new java.awt.Color(0,191,255));
        ButtonHome.setBackground(new java.awt.Color(0,255,127));
        PainelHome.setVisible(false);
        especialidadePanel.setVisible(true);
    }//GEN-LAST:event_ButtonEspecialidadeActionPerformed

    private void ButtonPlanoSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlanoSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonPlanoSaudeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgenda;
    private javax.swing.JButton ButtonEspecialidade;
    private javax.swing.JButton ButtonHome;
    private javax.swing.JButton ButtonMédicos;
    private javax.swing.JButton ButtonPaciente;
    private javax.swing.JButton ButtonPlanoSaude;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JLabel LabelCalendario;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PainelDeTitulo;
    private javax.swing.JPanel PainelHome;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables


    private void initPanels() {
        especialidadePanel = new EspecialidadePanel();
        especialidadePanel.setBounds(POS_X, POS_Y, POS_WIDTH, POS_HEIGHT);
        getContentPane().add(especialidadePanel);
        especialidadePanel.setVisible(false);
    }


}
