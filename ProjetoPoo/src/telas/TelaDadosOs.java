/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import datal.ModuloConexao;
import javax.swing.JTextArea;
import objetos.OrdemServico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import objetos.Usuario;


/**
 *
 * @author laris
 */
public class TelaDadosOs extends javax.swing.JInternalFrame {
    
    public OrdemServico pesquisaOs(int id) {
        
        try {
            // gera conexão e os statement
            Connection conexao = new ModuloConexao().conector();
            PreparedStatement stmt = conexao.prepareStatement("select * from tbOs where id=?");
            
            // completa os campos
            stmt.setInt(1, id);
            
            // executa um select
            ResultSet rs = stmt.executeQuery();
            
            // recolhe os valores
            if (rs.next()) {
                // Gera um objeto ordem de serviço
                OrdemServico os = new OrdemServico();
                os.setVeiculo(rs.getString("veiculo"));
                os.setDefeito(rs.getString("defeito"));
                os.setServico(rs.getString("servico"));
                os.setMecanico(rs.getInt("idMecanico"));
                os.setValorServico(rs.getString("valorServico"));
                os.setCliente(rs.getInt("idCliente"));
                
                // retorna o objeto
                return os;
            } else {
                JOptionPane.showMessageDialog(null, "Ordem de serviço inválido!");
                return null;
            }
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public String pesquisaNomeMecanico(int id) {
        
        try {
            // gera conexão e os statement
            Connection conexao = new ModuloConexao().conector();
            PreparedStatement stmt = conexao.prepareStatement("select * from tbUsuarios where id=?");
            
            // preenche o valor
            stmt.setInt(1, id);
            
            // executa um select
            ResultSet rs = stmt.executeQuery();
            
            // recolhe os valores
            if (rs.next()) {
                return rs.getString("nomeUser");
            } else {
                JOptionPane.showMessageDialog(null, "Mecanico não encontrado!");
                return null;
            }
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String pesquisaNomeCliente(int id) {
        
        try {
            // gera conexão e os statement
            Connection conexao = new ModuloConexao().conector();
            PreparedStatement stmt = conexao.prepareStatement("select * from tbCliente where id=?");
            
            // preenche o valor
            stmt.setInt(1, id);
            
            // executa um select
            ResultSet rs = stmt.executeQuery();
            
            // recolhe os valores
            if (rs.next()) {
                return rs.getString("nomeCliente");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                return null;
            }
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String geraInformações(int id) {
        OrdemServico os = pesquisaOs(id);
        String veiculo = os.getVeiculo();
        String defeito = os.getDefeito();
        String servico = os.getServico();
        String valor = os.getValorServico();
        String mecanico = pesquisaNomeMecanico(os.getMecanico());
        String cliente = pesquisaNomeCliente(os.getCliente());
        
        String texto = "Veículo: " + veiculo + "\n"
                + "Defeito: " + defeito + "\n"
                + "Serviço: " + servico + "\n"
                + "Valor do Serviço: " + valor + "\n"
                + "Mecânico Responsável: " + mecanico + "\n"
                + "Cliente: " + cliente;
        
        return texto;
    }
    
    public void exibeInformações(JTextArea area, int id) {
        area.setText(geraInformações(id));
    }
    

    /**
     * Creates new form TelaDadosOs
     * @param id
     */
    public TelaDadosOs(int id) {
        initComponents();
        exibeInformações(dadosOs, id);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        dadosOs = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(406, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informações de Ordem de Serviço");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        dadosOs.setEditable(false);
        dadosOs.setColumns(20);
        dadosOs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dadosOs.setRows(5);
        jScrollPane1.setViewportView(dadosOs);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
        getContentPane().add(jLabel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea dadosOs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
