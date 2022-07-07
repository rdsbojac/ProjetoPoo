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
 * @author Jonas Felix
 */
public class GerenteDao {
    // Conexão com Banco de dados
    private Connection conexao;
    
    public GerenteDao() {
        this.conexao = new ModuloConexao().conector();
    }
    
    public void cadastrarUsuario(Usuario usuario) {
        String sql = "insert into tbUsuarios "
                + "(nomeUser, numeroUser, cargo, loginUser, senhaUser)"
                + " values (?,?,?,?,?)";
        
        try {
            // statement
            PreparedStatement stmt = conexao.prepareStatement(sql);
            System.out.println("preparou!");
            
            // Preenche valores
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getNumero());
            stmt.setString(3, usuario.getCargo());
            stmt.setString(4, usuario.getLogin());
            stmt.setString(5, usuario.getSenha());
            System.out.println("passou valores!");
            
            // Executa o statement
            stmt.execute();
            System.out.println("Executado!");
            stmt.close();
            System.out.println("Fechado!");
            System.out.println("Salvo!");
            
        } catch (SQLException e) {
            throw new RuntimeException(e);

    }
    
    /*
    public void valida(Gerente gerente) {
        String sql = "select nomeUser, senhaUser from tbUsuarios"
                + "where loginUser=? and senhaUser=?";
        
        try {
            // Statement para validação
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            // seta os valores
            stmt.setString(1, gerente);
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    */
    }
}
