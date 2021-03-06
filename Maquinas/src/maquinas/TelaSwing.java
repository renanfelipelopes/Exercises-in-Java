/*
 * Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em Análise e Desenvolvimento de Sistemas 
 * Polo: São Bernardo do Campo (Rudge Ramos)
 */
package maquinas;

import javax.swing.JOptionPane;

/**
 *
 * @author renan
 */
public class TelaSwing extends javax.swing.JFrame {

    /**
     * Creates new form TelaSwing
     */
    public TelaSwing() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVelocidadeProcessador = new javax.swing.JLabel();
        lblMemoria = new javax.swing.JLabel();
        lblFabricante = new javax.swing.JLabel();
        txtVelocidadeProcessador = new javax.swing.JTextField();
        txtQtdMemoria = new javax.swing.JTextField();
        txtFabricanteProcessador = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        lblCor = new javax.swing.JLabel();
        lblPotencia = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        txtPotencia = new javax.swing.JTextField();
        btnExibirDesk = new javax.swing.JButton();
        lblFalantes = new javax.swing.JLabel();
        txtFalantes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblVelocidadeProcessador1 = new javax.swing.JLabel();
        lblMemoria1 = new javax.swing.JLabel();
        lblFabricante1 = new javax.swing.JLabel();
        txtVelocidadeProcessador1 = new javax.swing.JTextField();
        txtQtdMemoria1 = new javax.swing.JTextField();
        txtFabricanteProcessador1 = new javax.swing.JTextField();
        btnExibirDesk1 = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTouch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVelocidadeProcessador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblVelocidadeProcessador.setText("Velocidade do processador: ");

        lblMemoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMemoria.setText("Quantidade de memória:");

        lblFabricante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFabricante.setText("Fabricante processador:");

        btnLimpar.setText("Limpar");
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
        });

        lblCor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCor.setText("Cor Gabinete: ");

        lblPotencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPotencia.setText("Potencia da Fonte:");

        btnExibirDesk.setText("Exibir");
        btnExibirDesk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExibirDeskMouseClicked(evt);
            }
        });

        lblFalantes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFalantes.setText("Quantidade Alto-falantes:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Informações Desktop");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Informações Notebook");

        lblVelocidadeProcessador1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblVelocidadeProcessador1.setText("Velocidade do processador: ");

        lblMemoria1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMemoria1.setText("Quantidade de memória:");

        lblFabricante1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFabricante1.setText("Fabricante processador:");

        btnExibirDesk1.setText("Exibir");
        btnExibirDesk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExibirDesk1MouseClicked(evt);
            }
        });

        btnLimpar1.setText("Limpar");
        btnLimpar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpar1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Possui TouchPads?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(lblVelocidadeProcessador1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMemoria1)
                                .addComponent(lblFabricante1))
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtVelocidadeProcessador1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQtdMemoria1)
                                    .addComponent(txtFabricanteProcessador1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMemoria)
                                .addComponent(lblCor)
                                .addComponent(lblPotencia)
                                .addComponent(btnLimpar)
                                .addComponent(lblFabricante))
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnExibirDesk)
                                    .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtVelocidadeProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtQtdMemoria)
                                        .addComponent(txtFabricanteProcessador)
                                        .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(lblVelocidadeProcessador)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnLimpar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExibirDesk1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFalantes)
                                    .addComponent(jLabel3))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFalantes)
                                    .addComponent(txtTouch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVelocidadeProcessador)
                    .addComponent(txtVelocidadeProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMemoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFabricanteProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFabricante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPotencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExibirDesk)
                    .addComponent(btnLimpar))
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVelocidadeProcessador1)
                    .addComponent(txtVelocidadeProcessador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdMemoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMemoria1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFabricanteProcessador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFabricante1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFalantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFalantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTouch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExibirDesk1)
                    .addComponent(btnLimpar1))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        txtVelocidadeProcessador.setText("");
        txtQtdMemoria.setText("");
        txtFabricanteProcessador.setText("");
        txtCor.setText("");
        txtPotencia.setText("");
    }//GEN-LAST:event_btnLimparMouseClicked

    private void btnExibirDeskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExibirDeskMouseClicked
        String corGabinete = txtCor.getText();
        int potenciaFonteEnergia = Integer.parseInt(txtPotencia.getText());
        int velocidadeProcessador = Integer.parseInt(txtVelocidadeProcessador.getText());    
        int quantidadeMemoria = Integer.parseInt(txtQtdMemoria.getText());   
        String fabricanteProcessador = txtFabricanteProcessador.getText();
        
        Computador computador = new Computador(velocidadeProcessador, quantidadeMemoria, fabricanteProcessador);
        
        Desktop desktop = new Desktop(velocidadeProcessador, quantidadeMemoria, fabricanteProcessador, potenciaFonteEnergia, corGabinete);
        
        JOptionPane.showMessageDialog(this, desktop.informacoesCompletas());
    }//GEN-LAST:event_btnExibirDeskMouseClicked

    private void btnExibirDesk1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExibirDesk1MouseClicked
        int velocidadeProcessador = Integer.parseInt(txtVelocidadeProcessador1.getText());    
        int quantidadeMemoria = Integer.parseInt(txtQtdMemoria1.getText());   
        String fabricanteProcessador = txtFabricanteProcessador1.getText();
        int qdtAltoFalantes = Integer.parseInt(txtFalantes.getText());   
        boolean possuiTouchPads = Boolean.getBoolean(txtTouch.getText());
        
        Computador computador = new Computador(velocidadeProcessador, quantidadeMemoria, fabricanteProcessador);
        
        Notebook notebook = new Notebook(velocidadeProcessador, quantidadeMemoria, fabricanteProcessador, qdtAltoFalantes, possuiTouchPads);
        
        JOptionPane.showMessageDialog(this, notebook.informacoesCompletas());
    }//GEN-LAST:event_btnExibirDesk1MouseClicked

    private void btnLimpar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpar1MouseClicked
        txtVelocidadeProcessador1.setText("");
        txtQtdMemoria1.setText("");
        txtFabricanteProcessador1.setText("");
        txtFalantes.setText("");
        txtTouch.setText("");
    }//GEN-LAST:event_btnLimpar1MouseClicked

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
            java.util.logging.Logger.getLogger(TelaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExibirDesk;
    private javax.swing.JButton btnExibirDesk1;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblFabricante1;
    private javax.swing.JLabel lblFalantes;
    private javax.swing.JLabel lblMemoria;
    private javax.swing.JLabel lblMemoria1;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblVelocidadeProcessador;
    private javax.swing.JLabel lblVelocidadeProcessador1;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtFabricanteProcessador;
    private javax.swing.JTextField txtFabricanteProcessador1;
    private javax.swing.JTextField txtFalantes;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtQtdMemoria;
    private javax.swing.JTextField txtQtdMemoria1;
    private javax.swing.JTextField txtTouch;
    private javax.swing.JTextField txtVelocidadeProcessador;
    private javax.swing.JTextField txtVelocidadeProcessador1;
    // End of variables declaration//GEN-END:variables
}
