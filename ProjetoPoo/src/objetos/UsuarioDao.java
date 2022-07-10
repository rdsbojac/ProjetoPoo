/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import datal.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author laris
 */
public class UsuarioDao {
    // Conexão com Banco de dados
    private Connection conexao;
    
    public UsuarioDao() {
        this.conexao = new ModuloConexao().conector();
    }
    
    // Método para Cadastrar um novo Usuário
    public void cadastrarUsuario(Usuario usuario) {
        String sql = "insert into tbUsuarios "
                + "(nomeUser, numeroUser, cargo, perfil, loginUser, senhaUser)"
                + " values (?,?,?,?,?,?)";
        
        try {
            // statement
            PreparedStatement stmt = conexao.prepareStatement(sql);
            System.out.println("Preparou o statement!");
            
            // Preenche valores
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getNumero());
            stmt.setString(3, usuario.getCargo());
            stmt.setString(4, usuario.getPerfil());
            stmt.setString(5, usuario.getLogin());
            stmt.setString(6, usuario.getSenha());
            System.out.println("passou valores!");
            
            
            // Executa o statement
            stmt.execute();
            System.out.println("Executando Comando!");
            stmt.close();
            System.out.println("Salvo!");
            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    // Método para Editar um Usuário existente
    public void editarUsuario(Usuario usuario, int id) {
        String sql = "update tbUsuarios"
                + " set nomeUser=?, numeroUser=?, cargo=?, perfil=?, loginUser=?, senhaUser=?"
                + "where id=?";
        
        try {
            // statement
            PreparedStatement stmt = conexao.prepareStatement(sql);
            System.out.println("Preparou o statement!");
            
            // Preenche valores
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getNumero());
            stmt.setString(3, usuario.getCargo());
            stmt.setString(4, usuario.getPerfil());
            stmt.setString(5, usuario.getLogin());
            stmt.setString(6, usuario.getSenha());
            stmt.setInt(7, id);
            System.out.println("passou valores!");
            
            // Executa o statement
            stmt.execute();
            System.out.println("Executando Comando!");
            stmt.close();
            System.out.println("Editado!"); 
            JOptionPane.showMessageDialog(null, "Usuário editado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    // Método para cadastrar novo cliente
    public void cadastrarCliente(Cliente cliente) {
        String sql = "insert into tbCliente "
                + "(nomeCliente, numeroCliente, emailCliente)"
                + "values (?,?,?)";
        
        try {
            // statement
            PreparedStatement stmt = conexao.prepareStatement(sql);
            System.out.println("Preparou o statement!");
            
            // Preenche valores
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getNumero());
            stmt.setString(3, cliente.getEmail());
            System.out.println("passou valores!");
            
            // Executa o statement
            stmt.execute();
            System.out.println("Executando Comando!");
            stmt.close();
            System.out.println("Editado!"); 
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    /*
    //Método para deletar cliente
    public void apagarCliente(Cliente cliente) {
        
        
        try {
            PreparedStatement stmt = conexao.prepareStatement("delete * from tbCliente where id=?");
            stmt.setInt(1, cliente.getId());
            
            stmt.execute();
            stmt.close();
            System.out.println("Cliente deletado!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    */
    
    // Método para adicionar uma nova ordem de seriço
    public void adicionarOs(OrdemServico os) {
        String sql = "insert into tbOs "
                + "(veiculo, defeito, servico, idMecanico, valorServico, idCliente)"
                + " values (?,?,?,?,?,?)";
        
        try {
            // statement
            PreparedStatement stmt = conexao.prepareStatement(sql);
            System.out.println("Preparou o statement!");
            
            // Preenche valores
            stmt.setString(1, os.getVeiculo());
            stmt.setString(2, os.getDefeito());
            stmt.setString(3, os.getServico());
            stmt.setLong(4, os.getMecanico());
            stmt.setString(5, os.getValorServico());
            stmt.setLong(6, os.getCliente());
            System.out.println("passou valores!");
            
            // Executa o statement
            stmt.execute();
            System.out.println("Executando Comando!");
            stmt.close();
            System.out.println("ordem de serviço salvo!");
            JOptionPane.showMessageDialog(null, "Ordem de serviço salva com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } 
    
    // Método para editar Ordem de Serviço
    public void editarOs(OrdemServico os) {
        String sql = "update tbos"
                + " set veiculo=?, defeito=?, servico=?, idMecanico=?, valorServico=?"
                + " where id=?";
        
        try {
            // statement
            PreparedStatement stmt = conexao.prepareStatement(sql);
            System.out.println("Preparou o statement!");
            
            // Preenche valores
            stmt.setString(1, os.getVeiculo());
            stmt.setString(2, os.getDefeito());
            stmt.setString(3, os.getServico());
            stmt.setInt(4, os.getMecanico());
            stmt.setString(5, os.getValorServico());
            stmt.setInt(6, os.getOs());
            System.out.println("passou valores!");
            
            // Executa o statement
            stmt.execute();
            System.out.println("Executando Comando!");
            stmt.close();
            System.out.println("Editado!");
            JOptionPane.showMessageDialog(null, "Ordem de serviço editado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    // Método para apagar um ordem de serviço
    public void apagarOs(OrdemServico os){
        try {
            PreparedStatement stmt = conexao.prepareStatement("delete from tbOs where id=?");
            stmt.setInt(1, os.getOs());

            stmt.execute();
            stmt.close();
            System.out.println("Ordem de serviço deletada!");
            JOptionPane.showMessageDialog(null, "Ordem de serviço deletado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

            
    
    
    }    
}
