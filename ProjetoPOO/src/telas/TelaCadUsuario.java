/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import javax.swing.JOptionPane;
import objetos.Gerente;
import objetos.Mecanico;
import objetos.Usuario;
import objetos.GerenteDao;
import objetos.UsuarioDao;

/**
 *
 * @author Ronaldo Daniel
 */
public class TelaCadUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadUsuario
     */
    public TelaCadUsuario() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cadastroNomeInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cadastroTelefoneInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cadastroCargoInput = new javax.swing.JTextField();
        cadastroUsuarioInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cadastroSenhaInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cadastroPerfilInput1 = new javax.swing.JTextField();
        confirmarCadastroButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Usuário");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nome");

        cadastroNomeInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Telefone");

        cadastroTelefoneInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastroTelefoneInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroTelefoneInputActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Cargo");

        cadastroCargoInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastroCargoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCargoInputActionPerformed(evt);
            }
        });

        cadastroUsuarioInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastroUsuarioInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroUsuarioInputActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Usuário");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Senha");

        cadastroSenhaInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastroSenhaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSenhaInputActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Perfil");

        cadastroPerfilInput1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastroPerfilInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroPerfilInput1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroPerfilInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroSenhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroUsuarioInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroCargoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroTelefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroNomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cadastroNomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cadastroTelefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cadastroCargoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cadastroUsuarioInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cadastroSenhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroPerfilInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        confirmarCadastroButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        confirmarCadastroButton.setText("Confirmar");
        confirmarCadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarCadastroButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(confirmarCadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(confirmarCadastroButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroTelefoneInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroTelefoneInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroTelefoneInputActionPerformed

    private void cadastroCargoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCargoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroCargoInputActionPerformed

    private void cadastroUsuarioInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroUsuarioInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroUsuarioInputActionPerformed

    private void cadastroSenhaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSenhaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroSenhaInputActionPerformed

    private void cadastroPerfilInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroPerfilInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroPerfilInput1ActionPerformed

    private void confirmarCadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarCadastroButtonActionPerformed
        // TODO add your handling code here:
        // Recolhe os inputs
        String nome = cadastroNomeInput.getText().strip();
        String numero = cadastroTelefoneInput.getText().strip();
        String cargo = cadastroCargoInput.getText().toLowerCase();
        String login = cadastroUsuarioInput.getText().strip();
        String senha = cadastroSenhaInput.getText().strip();
        
        // Verifica se todos os campos foram preenchidos
        if (nome.isBlank() || numero.isBlank() || cargo.isBlank()
            || login.isBlank() || senha.isBlank()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            // Verifica se o cargo é valido e estancia o objeto correspondente
            boolean valido = false;
        
            if (cargo.equals("gerente") || cargo.equals("mecanico")) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Cargo inválido!");
            }
                // Salva os valores no objeto se o cargo for valido
                if (valido) {

                    Usuario usuario = new Usuario();

                    // Passa todas os valores para serem salvos no Banco de Dados
                    usuario.setNome(nome);
                    usuario.setNumero(numero);
                    usuario.setCargo(cargo);
                    usuario.setLogin(login);
                    usuario.setSenha(senha);

                    // Gera o Data Access Object
                    UsuarioDao dao = new UsuarioDao();
                    // Cadastra o usuario
                    dao.cadastrarUsuario(usuario);
                }
        }
        
        

        
        
        
        
    }//GEN-LAST:event_confirmarCadastroButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cadastroCargoInput;
    private javax.swing.JTextField cadastroNomeInput;
    private javax.swing.JTextField cadastroPerfilInput1;
    private javax.swing.JTextField cadastroSenhaInput;
    private javax.swing.JTextField cadastroTelefoneInput;
    private javax.swing.JTextField cadastroUsuarioInput;
    private javax.swing.JButton confirmarCadastroButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
