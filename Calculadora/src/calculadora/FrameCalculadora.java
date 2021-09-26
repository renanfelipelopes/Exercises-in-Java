/*
 * Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em Análise e Desenvolvimento de Sistemas 
 * Polo: São Bernardo do Campo (Rudge Ramos)
 */
package calculadora;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 * @author renan
 */
public class FrameCalculadora extends javax.swing.JFrame {    
    /** 
     * Creates new form FrameCalculadora
     */
    public FrameCalculadora() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.darkGray);
        Snumeros(txtNumero1); 
        Snumeros2(txtNumero2);
    }   
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSomar = new javax.swing.JButton();
        txtNumero1 = new javax.swing.JTextField();
        txtNumero2 = new javax.swing.JTextField();
        btnFatorial = new javax.swing.JButton();
        btnResto = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnPeso = new javax.swing.JButton();

        jPanel1.setForeground(new java.awt.Color(153, 0, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setBounds(new java.awt.Rectangle(50, 50, 50, 50));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Numero 1");

        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Numero 2");

        btnSomar.setBackground(new java.awt.Color(0, 204, 204));
        btnSomar.setText("Soma");
        btnSomar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });

        txtNumero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero1KeyTyped(evt);
            }
        });

        txtNumero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero2KeyTyped(evt);
            }
        });

        btnFatorial.setBackground(new java.awt.Color(51, 204, 0));
        btnFatorial.setText("Fatorial");
        btnFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFatorialActionPerformed(evt);
            }
        });

        btnResto.setBackground(new java.awt.Color(255, 102, 51));
        btnResto.setText("Resto");
        btnResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestoActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(153, 153, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
        });

        btnPeso.setBackground(new java.awt.Color(255, 204, 0));
        btnPeso.setText("IMC");
        btnPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFatorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPeso)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFatorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSomar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnLimpar.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Aceitar somente numeros como entrada na caixa de texto
    public void Snumeros(JTextField a){
        a.addKeyListener(new KeyAdapter(){
        public void keyTyped(KeyEvent e){
            char c=e.getKeyChar();
            if(!Character.isDigit(c)){
                getToolkit().beep();
                e.consume();
            }
        }
        });
    }
    
    // Aceitar somente numeros como entrada na caixa de texto
     public void Snumeros2(JTextField a){
        a.addKeyListener(new KeyAdapter(){
        public void keyTyped(KeyEvent e){
            char c=e.getKeyChar();
            if(!Character.isDigit(c)){
                getToolkit().beep();
                e.consume();
            }
        }
        });
    }
      
    //CALCULA SOMA
    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomarActionPerformed
        // Cria objeto calculadora
        ClasseCalculadora calc = new ClasseCalculadora();
        
        //Recupera as entradas do usuario
        int numero1 = Integer.parseInt(txtNumero1.getText());
        int numero2 = Integer.parseInt(txtNumero2.getText());
        
        // Chamo o metodo da calculadora, armazeno retorno
        int resultado;
        resultado = calc.retornarSomaDeDoisNumeros(numero1, numero2);        
        
        // Exibir saida
        JOptionPane.showMessageDialog(rootPane, resultado);
    }//GEN-LAST:event_btnSomarActionPerformed

    //CALCULA FATORIAL
    private void btnFatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFatorialActionPerformed
         ClasseCalculadora calc = new ClasseCalculadora();
         
         JOptionPane.showMessageDialog(rootPane, "Inserir dados apenas no campo Numero 1");
         
         int numero1 = Integer.parseInt(txtNumero1.getText());
         
         int resultado;
         resultado = calc.fatorial(numero1);
         
         JOptionPane.showMessageDialog(rootPane, resultado);        
    }//GEN-LAST:event_btnFatorialActionPerformed

    private void txtNumero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero1KeyTyped
        int numeroCaracter = 5;
            if(txtNumero1.getText().length()>=numeroCaracter){
                evt.consume();  
                JOptionPane.showMessageDialog(rootPane, "Digite apenas 5 numeros!");
            }
    }//GEN-LAST:event_txtNumero1KeyTyped

    private void txtNumero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero2KeyTyped
         int numeroCaracter = 5;
            if(txtNumero2.getText().length()>=numeroCaracter){
                evt.consume();  
                JOptionPane.showMessageDialog(rootPane, "Digite apenas 5 numeros!");
            }
    }//GEN-LAST:event_txtNumero2KeyTyped

    // CALCULA RESTO
    private void btnRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestoActionPerformed
        ClasseCalculadora calc = new ClasseCalculadora();
        
        int numero1 = Integer.parseInt(txtNumero1.getText());
        int numero2 = Integer.parseInt(txtNumero2.getText());
        
        int resultado;
        resultado = calc.resto(numero1, numero2);
        
        JOptionPane.showMessageDialog(rootPane, resultado);
    }//GEN-LAST:event_btnRestoActionPerformed

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        txtNumero1.setText("");
        txtNumero2.setText("");
    }//GEN-LAST:event_btnLimparMouseClicked

    //Calcular Indice de massa corporal
    private void btnPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesoActionPerformed
        ClasseCalculadora calc = new ClasseCalculadora();
        
        JOptionPane.showMessageDialog(rootPane, "Digite peso em Numero 1 e altura em Numero 2 sem pontuação");
        
        double numero1 = Integer.parseInt(txtNumero1.getText());
        double numero2 = Integer.parseInt(txtNumero2.getText());
        
        double resultado;
        resultado = calc.peso(numero1, numero2);
        
        DecimalFormat df = new DecimalFormat("###,###,##0.00");
        df.setMaximumFractionDigits(2);

        String valorFormatado = df.format(resultado);
        
        JOptionPane.showMessageDialog(null, valorFormatado);                
    }//GEN-LAST:event_btnPesoActionPerformed


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
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCalculadora().setVisible(true);
            }
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFatorial;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPeso;
    private javax.swing.JButton btnResto;
    private javax.swing.JButton btnSomar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    // End of variables declaration//GEN-END:variables
}
