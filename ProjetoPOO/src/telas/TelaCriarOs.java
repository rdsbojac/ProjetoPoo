/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import datal.ModuloConexao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objetos.Cliente;
import objetos.OrdemServico;
import objetos.UsuarioDao;

/**
 *
 * @author Ronaldo Daniel
 */
public class TelaCriarOs extends javax.swing.JInternalFrame {
    
    public boolean validaIdMecanico(int id) {
        Connection conexao = null;
        
        String sql = "select * from tbUsuarios where id=?";
        
        try {
            // Gera conexão e Statement
            conexao = new ModuloConexao().conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            //CONSULTA BANCO DE DADOS E SUBSTITUI OS "?" PELO CONTEUDO SELECIONADO
            stmt.setString(1, String.valueOf(id));
            
            //EXECUTA AS INTRUÇÕES
            ResultSet rs = stmt.executeQuery();
            
            // verifica se o funcionario existe no banco de dados
            if (rs.next()){
                String cargo = rs.getString(4).toLowerCase();
                // Verifica se o id passado é de um Mecanico ou não
                System.out.println(cargo);
                if (cargo.equals("mecanico")) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Você passou o id de um Gerente!");
                    return false;
                }
            }else{
                JOptionPane.showMessageDialog(null, "id inválido!");
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Cliente procuraCliente(String nome, String numero, String email) {
        Connection conexao = null;
        
        String sql = "select * from tbCliente"
                + " where nomeCliente=? and numeroCliente=? and emailCliente=?";
        
        try {
            // Gera conexão e Statement
            conexao = new ModuloConexao().conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            //CONSULTA BANCO DE DADOS E SUBSTITUI OS "?" PELO CONTEUDO SELECIONADO
            stmt.setString(1, nome);
            stmt.setString(2, numero);
            stmt.setString(3, email);
            
            //EXECUTA AS INTRUÇÕES
            ResultSet rs = stmt.executeQuery();
            
            // verifica se o cliente existe no banco de dados
            if (rs.next()){
                // Gera o objeto Cliente
                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getInt(1));
                cliente.setNome(nome);
                cliente.setNumero(numero);
                cliente.setEmail(email);
                
                // Retorna o cliente
                return cliente;
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates new form TelaCriarOs
     */
    public TelaCriarOs() {
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomeClienteInput = new javax.swing.JTextField();
        numeroClienteInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailClienteInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        criarOsButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        veiculoInput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        defeitoInput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        servicoInput = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idMecanicoInput = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        valorServicoInput = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(2147483647, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Criar Ordem de Serviço");

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setAutoscrolls(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 10000));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nome do cliente");

        nomeClienteInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeClienteInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteInputActionPerformed(evt);
            }
        });

        numeroClienteInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numeroClienteInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroClienteInputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Número do cliente");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Email do cliente");

        emailClienteInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailClienteInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailClienteInputActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        criarOsButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        criarOsButton.setText("Criar");
        criarOsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarOsButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Veículo");

        veiculoInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        veiculoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculoInputActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Defeito");

        defeitoInput.setColumns(20);
        defeitoInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        defeitoInput.setLineWrap(true);
        defeitoInput.setRows(5);
        jScrollPane1.setViewportView(defeitoInput);

        servicoInput.setColumns(20);
        servicoInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        servicoInput.setLineWrap(true);
        servicoInput.setRows(5);
        jScrollPane2.setViewportView(servicoInput);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Serviço");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Id do mecanico");

        idMecanicoInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idMecanicoInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idMecanicoInputFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Valor do serviço");

        valorServicoInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valorServicoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorServicoInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(criarOsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(114, 114, 114)
                        .addComponent(veiculoInput))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailClienteInput)
                                    .addComponent(numeroClienteInput)
                                    .addComponent(nomeClienteInput)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorServicoInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idMecanicoInput)
                                    .addComponent(jScrollPane2))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeClienteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numeroClienteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailClienteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(veiculoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(idMecanicoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(valorServicoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(criarOsButton)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeClienteInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeClienteInputActionPerformed

    private void numeroClienteInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroClienteInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroClienteInputActionPerformed

    private void emailClienteInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailClienteInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailClienteInputActionPerformed

    private void criarOsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarOsButtonActionPerformed
        // TODO add your handling code here:
        // Recolhe os valores colocados
        String nomeCliente = nomeClienteInput.getText().strip();
        String numeroCliente = numeroClienteInput.getText().strip();
        String emailCliente = emailClienteInput.getText().strip();
        String veiculo = veiculoInput.getText().strip();
        String defeito = defeitoInput.getText().strip();
        String servico = servicoInput.getText().strip();
        int id = (int) idMecanicoInput.getValue();
        String valorServico = valorServicoInput.getText().strip();
        
        // Verifica se todos os campos foram preenchidos
        
        boolean valido = false;
        if (nomeCliente.isBlank() || numeroCliente.isBlank() || emailCliente.isBlank()
            || veiculo.isBlank() || defeito.isBlank() || servico.isBlank() || valorServico.isBlank()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            // Verifica se o mecanico indicado existe na tabela
            valido = validaIdMecanico(id);
        }
        
        // Salva no banco de dados se for valido
        if (valido) {
            
            Cliente cliente = new Cliente();
            OrdemServico os = new OrdemServico();
            
            
            // Passa todas os valores de cliente
            cliente.setNome(nomeCliente);
            cliente.setNumero(numeroCliente);
            cliente.setEmail(emailCliente);
            
            // Salva no banco de dados
            UsuarioDao dao = new UsuarioDao();
            dao.cadastrarCliente(cliente);
            
            // Passa todas os valores de ordem de serviço
            os.setVeiculo(veiculo);
            os.setDefeito(defeito);
            os.setServico(servico);
            os.setMecanico(id);
            os.setValorServico(valorServico);
            // Recolho o id do cliente baseado em seus dados
            Cliente clienteEncontrado = procuraCliente(nomeCliente, numeroCliente, emailCliente);
            // passo o id para a os
            os.setCliente(clienteEncontrado.getId());
            
            // Salva no banco de dados
            dao.adicionarOs(os);
        }
        
        
    }//GEN-LAST:event_criarOsButtonActionPerformed

    private void veiculoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veiculoInputActionPerformed

    private void valorServicoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorServicoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorServicoInputActionPerformed

    private void idMecanicoInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idMecanicoInputFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_idMecanicoInputFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton criarOsButton;
    private javax.swing.JTextArea defeitoInput;
    private javax.swing.JTextField emailClienteInput;
    private javax.swing.JSpinner idMecanicoInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nomeClienteInput;
    private javax.swing.JTextField numeroClienteInput;
    private javax.swing.JTextArea servicoInput;
    private javax.swing.JTextField valorServicoInput;
    private javax.swing.JTextField veiculoInput;
    // End of variables declaration//GEN-END:variables
}
