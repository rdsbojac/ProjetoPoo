/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;
import java.sql.*;
import datal.ModuloConexao;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author laris
 */
public class TelaLogin extends javax.swing.JFrame {
    
    public void exibeTelaGerente(String nome) {
        // Exibe a tela com as funções do Gerente
        this.dispose();
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        TelaListarOs telaListar = new TelaListarOs();
        telaListar.setVisible(true);
        TelaPrincipal.CadastraUsuButton.setEnabled(true);
        TelaPrincipal.editUserButton.setEnabled(true);
        TelaPrincipal.EditarOsButton.setEnabled(true);
        TelaPrincipal.criarOsButton.setEnabled(false);
        TelaPrincipal.statusLabel.setText(nome);
        TelaPrincipal.statusLabel.setForeground(Color.red);        
    }
    
    public void exibeTelaMecanico(String nome) {
        // Exibe a tela com as funções do Mecanico
        this.dispose();
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        TelaListarOs telaListar = new TelaListarOs();
        telaListar.setVisible(true);
        TelaPrincipal.CadastraUsuButton.setEnabled(false);
        TelaPrincipal.editUserButton.setEnabled(false);
        TelaPrincipal.EditarOsButton.setEnabled(false);
        TelaPrincipal.statusLabel.setText(nome);
        TelaPrincipal.statusLabel.setForeground(Color.red);
    }
    
    public void validar(){
        Connection conexao = null;
        
        String sql = "select * from tbUsuarios where loginUser=? and senhaUser=?";
        try {

            // Gera conexão e Statement
            conexao = new ModuloConexao().conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            //CONSULTA BANCO DE DADOS E SUBSTITUI OS "?" PELO CONTEUDO SELECIONADO
            stmt.setString(1, idInput.getText());
            stmt.setString(2, senhaInput.getText()); 
            
            //EXECUTA AS INTRUÇÕES
            ResultSet rs = stmt.executeQuery();
            
            // verifica se os dados existem no BD SIM instancia a telaAdm
            if (rs.next()){
                // a linha abaixo obtem o campo perfil da tabela de usuarios 
                // para tratar o que cada usuario pode fazer no sistema
                
                /*String perfil = rs.getString(7);*/
                
                String nome = rs.getString(2);
                String cargo = rs.getString(4);
                //print para saber o retorno da strng Perfil
                System.out.println(cargo);
                // compara o perfil com "adimn" para todos os botoes ficarem disponiveis
                if (cargo.equals("Gerente")){
                    exibeTelaGerente(nome);
                }else{
                    exibeTelaMecanico(nome);
                }
            }else{
                JOptionPane.showMessageDialog(null, "usuario/senha inválido");
            }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
        
        }
    }
        
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        /*
        conexao = ModuloConexao.conector();
        System.out.println(conexao);
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        senhaLabel = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        senhaInput = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        confirmarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 200));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        senhaLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        senhaLabel.setText("Senha");

        idInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idInputActionPerformed(evt);
            }
        });

        senhaInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        idLabel.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senhaLabel)
                    .addComponent(idLabel))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(senhaInput, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(idInput)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel)
                    .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        confirmarButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        confirmarButton.setText("Confirmar");
        confirmarButton.setMaximumSize(new java.awt.Dimension(50, 38));
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmarButton, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idInputActionPerformed

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        //chamando o metodo logar
        validar();   
    }//GEN-LAST:event_confirmarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarButton;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField senhaInput;
    private javax.swing.JLabel senhaLabel;
    // End of variables declaration//GEN-END:variables
}
