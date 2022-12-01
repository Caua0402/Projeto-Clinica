
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoSaude;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
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
        preencherEspecialidade();
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
        preencherEspecialidade();
        preencherEspecialidadeMedico();
    }
        
     
        private void preencherFomulario(){
        
        CodigoTextField.setText(medico.getCodigo().toString());
        NomeMedicoTextField.setText(medico.getNome());
        CrmTextField.setText(medico.getCrm());
        NumeroTextField.setText(medico.getTelefone());
        EmailTextField.setText(medico.getEmail());
        DataTextField.setText(medico.getDataFormatada());
        
    }
        
        private void preencherTitulo(){
            setTitle(operacao + "Médico");
        LabelTitulo.setText(  operacao +" - MÉDICOS");
        
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
        EmailTextField = new javax.swing.JTextField();
        TelefoneLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        DataDeNascimentoLabel = new javax.swing.JLabel();
        Pane = new javax.swing.JScrollPane();
        JListEspecialidade = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        JListMedico = new javax.swing.JList<>();
        IrParaListaButton = new javax.swing.JButton();
        IrParaMedicoButton = new javax.swing.JButton();
        EspecialidadeMedicoLabel = new javax.swing.JLabel();
        ListaEspecialidadeLabel = new javax.swing.JLabel();
        DataTextField = new javax.swing.JFormattedTextField();
        NumeroTextField = new javax.swing.JFormattedTextField();
        NomeMedicoTextField = new javax.swing.JTextField();
        CrmTextField = new javax.swing.JFormattedTextField();
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
        DetalheMedicoLabel.setText("Nome do médico:");
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

        Pane.setViewportView(JListEspecialidade);

        jPanel2.add(Pane);
        Pane.setBounds(20, 190, 120, 130);

        jScrollPane2.setViewportView(JListMedico);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(250, 190, 130, 130);

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

        NomeMedicoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeMedicoTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(NomeMedicoTextField);
        NomeMedicoTextField.setBounds(200, 40, 340, 22);

        try {
            CrmTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(CrmTextField);
        CrmTextField.setBounds(100, 40, 70, 22);

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
        if(NomeMedicoTextField.getText().isBlank() == true ||
                CrmTextField.getText().isBlank() == true ||
                NumeroTextField.getText().isBlank() == true ||
                EmailTextField.getText().isBlank() == true ||
                DataTextField.getText().isBlank()){ 
            
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
        if(JListMedico.isSelectionEmpty() == false){
            ArrayList<Especialidade> novaLista = new ArrayList<>();
            int tamanho = JListMedico.getModel().getSize();
            for (int o = 0; o < tamanho; o++){
                novaLista.add(JListMedico.getModel().getElementAt(o));
            }
            novaLista.remove(JListMedico.getSelectedValue());
            
            DefaultListModel<Especialidade> especialidadeLista = new DefaultListModel<>();
            for (Especialidade percorrer : novaLista){
                especialidadeLista.addElement(percorrer);
            }
            JListMedico.setModel(especialidadeLista);
        }else {
            JOptionPane.showMessageDialog(this,
                    "Nenhuma Especialidade selecionada para ser removida",
                    "Editando Médico",
                    JOptionPane.WARNING_MESSAGE, null);
        }
    }//GEN-LAST:event_IrParaListaButtonActionPerformed

    private void IrParaMedicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrParaMedicoButtonActionPerformed
        if (JListEspecialidade.isSelectionEmpty() == false){
            ArrayList<Especialidade> listaNova = new ArrayList<>();
            int tamanho = JListMedico.getModel().getSize();
            for (int o = 0; o < tamanho; o++){
                listaNova.add(JListMedico.getModel().getElementAt(o));
            }
        if (listaNova.contains(JListEspecialidade.getSelectedValue()) == false){
            listaNova.add(JListEspecialidade.getSelectedValue());
            
            DefaultListModel<Especialidade> especialidadeLista = new DefaultListModel<>();
            for (Especialidade percorrer : listaNova){
                especialidadeLista.addElement(percorrer);
            }
            JListMedico.setModel(especialidadeLista);
        }else{
            JOptionPane.showMessageDialog(null,
                    "Especialidade ja esta cadastrada!!",
                    "Editando Médico",
                    JOptionPane.WARNING_MESSAGE, null);
            }   
        }else{
            JOptionPane.showMessageDialog(this,
                    "Não tem especialidade selecionada!!",
                    "Editando Médico",
                    JOptionPane.WARNING_MESSAGE, null);
        }
    }//GEN-LAST:event_IrParaMedicoButtonActionPerformed

    private void DataTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataTextFieldActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void NomeMedicoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeMedicoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeMedicoTextFieldActionPerformed

    private ArrayList<Especialidade> pegaEspecialidade(JList<Especialidade> lista){
        int tamnho = lista.getModel().getSize();
        ArrayList<Especialidade> listaNova = new ArrayList<>();
        for (int i = 0; i < tamnho; i++){
            listaNova.add(lista.getModel().getElementAt(i));
        }
        return listaNova;
    }
    
    private void adicionar(){
        //Criar um objeto especialidade
        Medico novoMedico = new Medico();
        novoMedico.setNome(NomeMedicoTextField.getText());
        novoMedico.setEmail(EmailTextField.getText());
        novoMedico.setCrm(CrmTextField.getText());
        novoMedico.setTelefone(NumeroTextField.getText());
        novoMedico.setDataFormatada(DataTextField.getText());
        novoMedico.setEspecialidade(pegaEspecialidade(JListMedico));
        
        //Gravar o objeto, atraves do DAO.
        MedicoDAO.gravar(novoMedico);
        
        JOptionPane.showMessageDialog(
                this,
                "Especialidade gravada com sucesso",
                "Especialidade",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void editar(){
        medico.setEmail(EmailTextField.getText());
        medico.setCrm(CrmTextField.getText());
        medico.setEspecialidade(pegaEspecialidade(JListMedico));
        medico.setDataFormatada(DataTextField.getText());
        medico.setNome(NomeMedicoTextField.getText());
        medico.setTelefone(NumeroTextField.getText());
        
        MedicoDAO.atualizar(medico);
        
        JOptionPane.showMessageDialog(
                this,
                "Especialidade atualizada com sucesso!",
                "Especialidade",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void preencherEspecialidade(){
        JListEspecialidade.setModel(EspecialidadeDAO.getEspModel());
    }
    
    private void preencherEspecialidadeMedico(){
        DefaultListModel<Especialidade> medicoEspecialidade = new DefaultListModel<>();
        for (Especialidade percorrer : medico.getEspecialidade()){
            medicoEspecialidade.addElement(percorrer);
        }
        JListMedico.setModel(medicoEspecialidade);
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarButton;
    private javax.swing.JLabel CodigoLabel;
    private javax.swing.JTextField CodigoTextField;
    private javax.swing.JFormattedTextField CrmTextField;
    private javax.swing.JLabel DataDeNascimentoLabel;
    private javax.swing.JFormattedTextField DataTextField;
    private javax.swing.JLabel DetalheMedicoLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel EspecialidadeMedicoLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton IrParaListaButton;
    private javax.swing.JButton IrParaMedicoButton;
    private javax.swing.JList<Especialidade> JListEspecialidade;
    private javax.swing.JList<Especialidade> JListMedico;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel ListaEspecialidadeLabel;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JTextField NomeMedicoTextField;
    private javax.swing.JFormattedTextField NumeroTextField;
    private javax.swing.JScrollPane Pane;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JLabel TelefoneLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
