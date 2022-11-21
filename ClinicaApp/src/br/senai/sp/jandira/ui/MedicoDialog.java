
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoSaude;
import javax.swing.JOptionPane;


public class MedicoDialog extends javax.swing.JDialog {

        private Medico medico;
        private OperacaoEnum operacao;
        
        public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }
    
    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal, 
            Medico e,
            OperacaoEnum operacao) {
        
        
        super(parent, modal);
        initComponents();
        
        medico = e;
        this.operacao = operacao;
        
        preencherFomulario();
        preencherTitulo();
    }
        
     
        private void preencherFomulario(){
        
        CodigoTextField.setText(medico.getCodigo().toString());
        EmailTextField.setText(medico.getmedico());
        CrmTextField.setText(medico.getCrm());
        NumeroTextField.setText(medico.getTelefone());
        EmailTextField.setText(medico.getEmail());
    }
        
        private void preencherTitulo(){
        LabelTitulo.setText(  operacao +" - Plano De Saude");
        
        if(operacao == OperacaoEnum.EDITAR){
            LabelTitulo.setIcon(new javax.swing.ImageIcon(
                    getClass().getResource
                            ("/br/senai/sp/jandira/imagem/Lapis1.png")));
        }else{
            LabelTitulo.setIcon(new javax.swing.ImageIcon(
                    getClass().getResource(
                            "/br/senai/sp/jandira/imagem/plus32.png")));
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        CodigoLabel = new javax.swing.JLabel();
        CodigoTextField = new javax.swing.JTextField();
        NomeLabel = new javax.swing.JLabel();
        DetalheMedicoLabel = new javax.swing.JLabel();
        SalvarButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        CrmTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        TelefoneLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        DataDeNascimentoLabel = new javax.swing.JLabel();
        Pane = new javax.swing.JScrollPane();
        ListaEspecialidadeList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaMedicoList = new javax.swing.JList<>();
        IrParaListaButton = new javax.swing.JButton();
        IrParaMedicoButton = new javax.swing.JButton();
        EspecialidadeMedicoLabel = new javax.swing.JLabel();
        ListaEspecialidadeLabel = new javax.swing.JLabel();
        DataTextField = new javax.swing.JFormattedTextField();
        NumeroTextField = new javax.swing.JFormattedTextField();
        DetalheMedicoTextField1 = new javax.swing.JTextField();
        HeaderPanel = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do(a) médico(a)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        CodigoLabel.setForeground(new java.awt.Color(0, 0, 0));
        CodigoLabel.setText("Codigo:");
        jPanel2.add(CodigoLabel);
        CodigoLabel.setBounds(10, 20, 42, 16);

        CodigoTextField.setEditable(false);
        CodigoTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CodigoTextField.setDragEnabled(true);
        jPanel2.add(CodigoTextField);
        CodigoTextField.setBounds(10, 40, 64, 22);

        NomeLabel.setForeground(new java.awt.Color(0, 0, 0));
        NomeLabel.setText("Crm:");
        jPanel2.add(NomeLabel);
        NomeLabel.setBounds(100, 20, 60, 16);

        DetalheMedicoLabel.setForeground(new java.awt.Color(0, 0, 0));
        DetalheMedicoLabel.setText("Detalhes do(a) médico(a):");
        jPanel2.add(DetalheMedicoLabel);
        DetalheMedicoLabel.setBounds(200, 20, 180, 16);

        SalvarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/diskette.png"))); // NOI18N
        SalvarButton.setToolTipText("Salvar Especialidade");
        SalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SalvarButton);
        SalvarButton.setBounds(550, 300, 40, 31);

        CancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/error.png"))); // NOI18N
        CancelarButton.setToolTipText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CancelarButton);
        CancelarButton.setBounds(500, 300, 40, 31);

        CrmTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrmTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(CrmTextField);
        CrmTextField.setBounds(100, 40, 70, 22);

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(EmailTextField);
        EmailTextField.setBounds(140, 100, 340, 22);

        TelefoneLabel.setForeground(new java.awt.Color(0, 0, 0));
        TelefoneLabel.setText("Telefone: ");
        jPanel2.add(TelefoneLabel);
        TelefoneLabel.setBounds(10, 80, 70, 16);

        EmailLabel.setForeground(new java.awt.Color(0, 0, 0));
        EmailLabel.setText("E-mail: ");
        jPanel2.add(EmailLabel);
        EmailLabel.setBounds(140, 80, 70, 16);

        DataDeNascimentoLabel.setForeground(new java.awt.Color(0, 0, 0));
        DataDeNascimentoLabel.setText("Data Nascimento: ");
        jPanel2.add(DataDeNascimentoLabel);
        DataDeNascimentoLabel.setBounds(500, 80, 110, 16);

        ListaEspecialidadeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Pane.setViewportView(ListaEspecialidadeList);

        jPanel2.add(Pane);
        Pane.setBounds(20, 190, 120, 146);

        ListaMedicoList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListaMedicoList);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(250, 190, 130, 146);

        IrParaListaButton.setBackground(new java.awt.Color(232, 0, 0));
        IrParaListaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/arrow2.png"))); // NOI18N
        IrParaListaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrParaListaButtonActionPerformed(evt);
            }
        });
        jPanel2.add(IrParaListaButton);
        IrParaListaButton.setBounds(170, 270, 50, 50);

        IrParaMedicoButton.setBackground(new java.awt.Color(0, 217, 14));
        IrParaMedicoButton.setForeground(new java.awt.Color(0, 217, 14));
        IrParaMedicoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/arrow.png"))); // NOI18N
        IrParaMedicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrParaMedicoButtonActionPerformed(evt);
            }
        });
        jPanel2.add(IrParaMedicoButton);
        IrParaMedicoButton.setBounds(170, 200, 50, 50);

        EspecialidadeMedicoLabel.setForeground(new java.awt.Color(0, 0, 0));
        EspecialidadeMedicoLabel.setText("Especialidades do médico: ");
        jPanel2.add(EspecialidadeMedicoLabel);
        EspecialidadeMedicoLabel.setBounds(250, 170, 170, 16);

        ListaEspecialidadeLabel.setForeground(new java.awt.Color(0, 0, 0));
        ListaEspecialidadeLabel.setText("Lista de especialidades: ");
        jPanel2.add(ListaEspecialidadeLabel);
        ListaEspecialidadeLabel.setBounds(20, 170, 160, 16);

        try {
            DataTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DataTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(DataTextField);
        DataTextField.setBounds(500, 100, 90, 22);

        try {
            NumeroTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(NumeroTextField);
        NumeroTextField.setBounds(10, 100, 110, 22);

        DetalheMedicoTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalheMedicoTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(DetalheMedicoTextField1);
        DetalheMedicoTextField1.setBounds(200, 40, 340, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 630, 420);

        HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));
        HeaderPanel.setLayout(null);

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/plus32.png"))); // NOI18N
        LabelTitulo.setText("Adicionar - Especialidade");
        HeaderPanel.add(LabelTitulo);
        LabelTitulo.setBounds(20, 10, 340, 40);

        getContentPane().add(HeaderPanel);
        HeaderPanel.setBounds(0, 0, 630, 60);

        setSize(new java.awt.Dimension(646, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarButtonActionPerformed
        if(EmailTextField.getText().isBlank() == true ||
                CrmTextField.getText().isBlank() == true ||
                NumeroTextField.getText().isBlank() == true ||
                EmailTextField.getText().isBlank() == true){
            
            JOptionPane.showMessageDialog(this,
                    "Preencha todos container para poder salvar!!",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
        
        }else{
            if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }else{
            editar();
        }
        }
    }//GEN-LAST:event_SalvarButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void IrParaListaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrParaListaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IrParaListaButtonActionPerformed

    private void IrParaMedicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrParaMedicoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IrParaMedicoButtonActionPerformed

    private void DataTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataTextFieldActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void CrmTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrmTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrmTextFieldActionPerformed

    private void DetalheMedicoTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalheMedicoTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetalheMedicoTextField1ActionPerformed

    private void adicionar(){
        //Criar um objeto especialidade
        Medico novoMedico = new Medico();
        novoMedico.setmedico(EmailTextField.getText());
        novoMedico.setCrm(CrmTextField.getText());
        
        //Gravar o objeto, atraves do DAO.
        MedicoDAO.gravar(medico);
        
        JOptionPane.showMessageDialog(
                this,
                "Especialidade gravada com sucesso",
                "Especialidade",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void editar(){
        medico.setmedico(EmailTextField.getText());
        medico.setCrm(CrmTextField.getText());
        
        MedicoDAO.atualizar(medico);
        
        JOptionPane.showMessageDialog(
                this,
                "Especialidade atualizada com sucesso!",
                "Especialidade",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarButton;
    private javax.swing.JLabel CodigoLabel;
    private javax.swing.JTextField CodigoTextField;
    private javax.swing.JTextField CrmTextField;
    private javax.swing.JLabel DataDeNascimentoLabel;
    private javax.swing.JFormattedTextField DataTextField;
    private javax.swing.JLabel DetalheMedicoLabel;
    private javax.swing.JTextField DetalheMedicoTextField1;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel EspecialidadeMedicoLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton IrParaListaButton;
    private javax.swing.JButton IrParaMedicoButton;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel ListaEspecialidadeLabel;
    private javax.swing.JList<String> ListaEspecialidadeList;
    private javax.swing.JList<String> ListaMedicoList;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JFormattedTextField NumeroTextField;
    private javax.swing.JScrollPane Pane;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JLabel TelefoneLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
