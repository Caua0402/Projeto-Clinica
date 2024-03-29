
package br.senai.sp.jandira.ui;


import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {
       
    
    private PlanoSaude planodesaude;
    private OperacaoEnum operacao;
    
    public PlanoDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }
    
    public PlanoDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal, 
            PlanoSaude e,
            OperacaoEnum operacao) {
        
        
        super(parent, modal);
        initComponents();
        
        planodesaude = e;
        this.operacao = operacao;
        
        preencherFomulario();
        preencherTitulo();
    }
    
    private void preencherFomulario(){
        
        CodigoTextField.setText(planodesaude.getCodigo().toString());
        OperadoraTextField.setText(planodesaude.getOperadora());
        CategoriaTextField.setText(planodesaude.getCategoria());
        NumeroTextField.setText(planodesaude.getNumero());
        ValidadeTextField.setText(planodesaude.getFormateDate());
        
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

        jPanel1 = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CodigoLabel = new javax.swing.JLabel();
        CodigoTextField = new javax.swing.JTextField();
        OperadoraLabel = new javax.swing.JLabel();
        CategoriaLabel = new javax.swing.JLabel();
        SalvarButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        OperadoraTextField = new javax.swing.JTextField();
        CategoriaTextField = new javax.swing.JTextField();
        NomeTextField1 = new javax.swing.JTextField();
        NumeroLabel = new javax.swing.JLabel();
        ValidadeLabel = new javax.swing.JLabel();
        NumeroTextField = new javax.swing.JFormattedTextField();
        ValidadeTextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/plus32.png"))); // NOI18N
        LabelTitulo.setText("Adicionar - Plano de Saude");
        jPanel1.add(LabelTitulo);
        LabelTitulo.setBounds(20, 10, 340, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
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

        OperadoraLabel.setForeground(new java.awt.Color(0, 0, 0));
        OperadoraLabel.setText("Operadora de Plano:");
        jPanel2.add(OperadoraLabel);
        OperadoraLabel.setBounds(10, 80, 150, 16);

        CategoriaLabel.setForeground(new java.awt.Color(0, 0, 0));
        CategoriaLabel.setText("Categoria de Plano:");
        jPanel2.add(CategoriaLabel);
        CategoriaLabel.setBounds(10, 130, 180, 16);

        SalvarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/diskette.png"))); // NOI18N
        SalvarButton.setToolTipText("Salvar Plano");
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
        CancelarButton.setBounds(480, 300, 40, 31);
        jPanel2.add(OperadoraTextField);
        OperadoraTextField.setBounds(10, 100, 360, 22);
        jPanel2.add(CategoriaTextField);
        CategoriaTextField.setBounds(10, 150, 470, 22);
        jPanel2.add(NomeTextField1);
        NomeTextField1.setBounds(10, 122, 360, 0);

        NumeroLabel.setForeground(new java.awt.Color(0, 0, 0));
        NumeroLabel.setText("Número:");
        jPanel2.add(NumeroLabel);
        NumeroLabel.setBounds(10, 180, 150, 16);

        ValidadeLabel.setForeground(new java.awt.Color(0, 0, 0));
        ValidadeLabel.setText("Validade do Plano:");
        jPanel2.add(ValidadeLabel);
        ValidadeLabel.setBounds(10, 230, 150, 16);

        NumeroTextField.setColumns(11);
        try {
            NumeroTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        NumeroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(NumeroTextField);
        NumeroTextField.setBounds(10, 200, 110, 22);

        ValidadeTextField.setColumns(8);
        try {
            ValidadeTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(ValidadeTextField);
        ValidadeTextField.setBounds(10, 250, 80, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 640, 350);

        setSize(new java.awt.Dimension(656, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarButtonActionPerformed
        if(OperadoraTextField.getText().isBlank() == true ||
                CategoriaTextField.getText().isBlank() == true ||
                NumeroTextField.getText().isBlank() == true ||
                ValidadeTextField.getText().isBlank() == true){
            
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
    
    private void adicionar(){
        //Criar um objeto especialidade
        PlanoSaude novoplano = new PlanoSaude();
        novoplano.setOperadora(OperadoraTextField.getText());
        novoplano.setCategoria(CategoriaTextField.getText());
        novoplano.setNumero(NumeroTextField.getText());
        novoplano.setFormateDate(ValidadeTextField.getText());
        
        //Gravar o objeto, atraves do DAO.
        PlanoDeSaudeDAO.gravar(novoplano);
        
        JOptionPane.showMessageDialog(
                this,
                "Plano gravada com sucesso",
                "Plano De Saude",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void editar(){
        planodesaude.setOperadora(OperadoraTextField.getText());
        planodesaude.setCategoria(CategoriaTextField.getText());
        planodesaude.setNumero(NumeroTextField.getText());
        planodesaude.setFormateDate(ValidadeTextField.getText());
        
        PlanoDeSaudeDAO.atualizar(planodesaude);
        
        JOptionPane.showMessageDialog(
                this,
                "Plano atualizada com sucesso!",
                "Plano De Saude",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    
    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void NumeroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarButton;
    private javax.swing.JLabel CategoriaLabel;
    private javax.swing.JTextField CategoriaTextField;
    private javax.swing.JLabel CodigoLabel;
    private javax.swing.JTextField CodigoTextField;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JTextField NomeTextField1;
    private javax.swing.JLabel NumeroLabel;
    private javax.swing.JFormattedTextField NumeroTextField;
    private javax.swing.JLabel OperadoraLabel;
    private javax.swing.JTextField OperadoraTextField;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JLabel ValidadeLabel;
    private javax.swing.JFormattedTextField ValidadeTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
