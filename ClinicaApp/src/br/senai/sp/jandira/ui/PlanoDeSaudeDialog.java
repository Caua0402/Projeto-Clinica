
package br.senai.sp.jandira.ui;


import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoSaude;

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
        OperadoraLabel = new javax.swing.JLabel();
        CategoriaLabel = new javax.swing.JLabel();
        SalvarButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        OperadoraTextField = new javax.swing.JTextField();
        CategoriaTextField = new javax.swing.JTextField();
        NomeTextField1 = new javax.swing.JTextField();
        NumeroLabel = new javax.swing.JLabel();
        NumeroTextField = new javax.swing.JTextField();
        ValidadeLabel = new javax.swing.JLabel();
        ValidadeTextField = new javax.swing.JTextField();

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
        CancelarButton.setBounds(480, 300, 40, 31);
        jPanel2.add(OperadoraTextField);
        OperadoraTextField.setBounds(10, 100, 360, 22);
        jPanel2.add(CategoriaTextField);
        CategoriaTextField.setBounds(10, 150, 470, 22);
        jPanel2.add(NomeTextField1);
        NomeTextField1.setBounds(10, 122, 360, 0);

        NumeroLabel.setForeground(new java.awt.Color(0, 0, 0));
        NumeroLabel.setText("Número de Plano:");
        jPanel2.add(NumeroLabel);
        NumeroLabel.setBounds(10, 180, 150, 16);
        jPanel2.add(NumeroTextField);
        NumeroTextField.setBounds(10, 200, 470, 22);

        ValidadeLabel.setForeground(new java.awt.Color(0, 0, 0));
        ValidadeLabel.setText("Validade do Plano:");
        jPanel2.add(ValidadeLabel);
        ValidadeLabel.setBounds(10, 230, 150, 16);
        jPanel2.add(ValidadeTextField);
        ValidadeTextField.setBounds(10, 250, 470, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 640, 350);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarButtonActionPerformed

        if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }else{
            editar();
        }

    }//GEN-LAST:event_SalvarButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlanoDeSaudeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanoDeSaudeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanoDeSaudeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanoDeSaudeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlanoDeSaudeDialog dialog = new PlanoDeSaudeDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarButton;
    private javax.swing.JLabel CategoriaLabel;
    private javax.swing.JTextField CategoriaTextField;
    private javax.swing.JLabel CodigoLabel;
    private javax.swing.JTextField CodigoTextField;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JTextField NomeTextField1;
    private javax.swing.JLabel NumeroLabel;
    private javax.swing.JTextField NumeroTextField;
    private javax.swing.JLabel OperadoraLabel;
    private javax.swing.JTextField OperadoraTextField;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JLabel ValidadeLabel;
    private javax.swing.JTextField ValidadeTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
