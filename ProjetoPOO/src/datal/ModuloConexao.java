/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetopoo.datal;

import java.sql.*;

/**
 *
 * @author Ronaldo Daniel
 */
public class ModuloConexao {

    //Metodo para conexao com banco de dados
    public static Connection conector() {
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
            
            
    
    }
}
