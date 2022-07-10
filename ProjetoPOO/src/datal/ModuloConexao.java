/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ronaldo Daniel
 */
public class ModuloConexao {
    // Factory
    
    public Connection conector() {
        try {
            return DriverManager.getConnection(
             "jdbc:mysql://localhost:3306/dbOficina", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    //Metodo para conexao com banco de dados
    public Connection conector() {
        Connection conexao = null;
        // chamando o driver que foi importado na biblioteca
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando Informacoes do banco
        String url = "jdbc:mysql://localhost:3307/dbOficina";
        String user = "root";
        String password = "root";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        */
}

