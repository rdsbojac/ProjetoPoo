/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import datal.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
                + "(nomeUser, numeroUser, cargo, loginUser, senhaUser)"
                + " values (?,?,?,?,?)";
        
        try {
            // statement
            PreparedStatement stmt = conexao.prepareStatement(sql);
            System.out.println("Preparou o statement!");
            
            // Preenche valores
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getNumero());
            stmt.setString(3, usuario.getCargo());
            stmt.setString(4, usuario.getLogin());
            stmt.setString(5, usuario.getSenha());
            System.out.println("passou valores!");
            
            // Executa o statement
            stmt.execute();
            System.out.println("Executando Comando!");
            stmt.close();
            System.out.println("Salvo!");
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    // Método para Editar um Usuário existente
    public void editarUsuario(Usuario usuario, int id) {
        String sql = "update tbUsuarios"
                + " set nomeUser=?, numeroUser=?, cargo=?, loginUser=?, senhaUser=?"
                + "where id=?";
        
        try {
            // statement
            PreparedStatement stmt = conexao.prepareStatement(sql);
            System.out.println("Preparou o statement!");
            
            // Preenche valores
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getNumero());
            stmt.setString(3, usuario.getCargo());
            stmt.setString(4, usuario.getLogin());
            stmt.setString(5, usuario.getSenha());
            stmt.setInt(6, id);
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
    
    
}