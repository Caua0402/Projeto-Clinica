
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.TextField;
import javax.swing.JOptionPane;


public class EspecialidadeDialog extends javax.swing.JDialog {

    private Especialidade especialidade;
    private OperacaoEnum operacao;
    
    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }
    
    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal, 
            Especialidade e,
            OperacaoEnum operacao) {
        
        
        super(parent, modal);
        initComponents();
        
        especialidade = e;
        this.operacao = operacao;
        
        preencherFomulario();
        preencherTitulo();
    }
    
    private void preencherFomulario(){
        
        CodigoTextField.setText(especialidade.getCodigo().toString());
        NomeTextField.setText(especialidade.getNome());
        DescricaoTextField.setText(especialidade.getDescricao());
    }
    
    private void preencherTitulo(){
        LabelTitulo.setText(  operacao +" - Especialidade");
        
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
        NomeLabel = new javax.swing.JLabel();
        DescricaoLabel = new javax.swing.JLabel();
        SalvarButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        NomeTextField = new javax.swing.JTextField();
        DescricaoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/plus32.png"))); // NOI18N
        LabelTitulo.setText("Adicionar - Especialidade");
        jPanel1.add(LabelTitulo);
        LabelTitulo.setBounds(20, 10, 270, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 490, 60);

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

        NomeLabel.setForeground(new java.awt.Color(0, 0, 0));
        NomeLabel.setText("Nome da Especialidade:");
        jPanel2.add(NomeLabel);
        NomeLabel.setBounds(10, 80, 150, 16);

        DescricaoLabel.setForeground(new java.awt.Color(0, 0, 0));
        DescricaoLabel.setText("Decrição da Especialidade:");
        jPanel2.add(DescricaoLabel);
        DescricaoLabel.setBounds(10, 140, 180, 16);

        SalvarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/diskette.png"))); // NOI18N
        SalvarButton.setToolTipText("Salvar Especialidade");
        SalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SalvarButton);
        SalvarButton.setBounds(410, 220, 40, 31);

        CancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/error.png"))); // NOI18N
        CancelarButton.setToolTipText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CancelarButton);
        CancelarButton.setBounds(350, 220, 40, 31);
        jPanel2.add(NomeTextField);
        NomeTextField.setBounds(10, 100, 360, 22);
        jPanel2.add(DescricaoTextField);
        DescricaoTextField.setBounds(10, 160, 470, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 490, 290);

        setSize(new java.awt.Dimension(506, 390));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarButtonActionPerformed
        if(NomeTextField.getText().isBlank() == true || DescricaoTextField.getText().isBlank() == true){
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

    private void adicionar(){
        //Criar um objeto especialidade
        Especialidade novaespecialidade = new Especialidade();
        novaespecialidade.setNome(NomeTextField.getText());
        novaespecialidade.setDescricao(DescricaoTextField.getText());
        
        //Gravar o objeto, atraves do DAO.
        EspecialidadeDAO.gravar(novaespecialidade);
        
        JOptionPane.showMessageDialog(
                this,
                "Especialidade gravada com sucesso",
                "Especialidade",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void editar(){
        especialidade.setNome(NomeTextField.getText());
        especialidade.setDescricao(DescricaoTextField.getText());
        
        EspecialidadeDAO.atualizar(especialidade);
        
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
    private javax.swing.JLabel DescricaoLabel;
    private javax.swing.JTextField DescricaoTextField;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JTextField NomeTextField;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
