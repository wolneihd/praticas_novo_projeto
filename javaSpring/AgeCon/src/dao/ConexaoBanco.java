/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author alzir
 */
public class ConexaoBanco {

    private static final String driverClass = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/contatobd?useSSL=false&serverTimezone=UTC";
    private static final String usuario = "root";
    private static final String senha = "admin";

    public static Connection abreConexao() {

        Connection con = null;

        try {
            Class.forName(driverClass);
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado com sucesso ao BD!");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: Driver JDBC nao encontrado! Verifique o classpath.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }

        return con;
    }

}
