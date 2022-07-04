/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datal;

import org.mariadb.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Jonas Felix
 */
public class MariaDBConnectionFactory {
    public Connection getConnection() {
        try {
            return (Connection) DriverManager.getConnection(
            "jdbc:mariadb://localhost/dbOficina", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } 
}
