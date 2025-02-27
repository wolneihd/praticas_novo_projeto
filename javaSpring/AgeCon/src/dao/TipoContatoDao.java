/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.InterfaceDao;
import java.sql.SQLException;
import java.sql.ResultSet;
//import javax.swing.JComboBox;
import modelo.TipoContatoModelo;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alzir
 */
public class TipoContatoDao implements InterfaceDao {

    String sql;
    PreparedStatement stm;

    @Override
    public void salvarDao(Object... valor) {

        TipoContatoModelo tcm = (TipoContatoModelo) valor[0];

        if (tcm.getId() == 0) {
            sql = "INSERT INTO tipo_contato (descricao) VALUES (?)";
        } else {
            sql = "UPDATE tipo_contato SET descricao=?  WHERE id=?";
        }

        try {
            // preparando e manipulando os dados:
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);

            stm.setString(1, tcm.getDescricao());

            if (tcm.getId() > 0) {
                stm.setInt(2, tcm.getId());
            }

            stm.execute();
            stm.close();

            System.out.println("Salvo no BD com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar: " + e);
        }

    }

    @Override
    public void excluirDao(int id) {
        sql = "DELETE FROM tipo_contato where id = ?";
        
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(sql); 
            stm.setInt(1, id);
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Registro exluido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir registro" + e.getMessage());
        }

    }

    @Override
    public void carregarComboBoxDao(Object... valor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultarDao(Object... valor) throws SQLException {

        if ("".equals((String) valor[0])) {
            sql = "SELECT * FROM tipo_contato";
        } else {
            sql = "SELECT * FROM tipo_contato WHERE descricao LIKE '%" + valor[0] + "%'";
        }

        ResultSet resultado;
        DefaultTableModel tabela = (DefaultTableModel) valor[1];

        try {
            // preparando e manipulando os dados:
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            resultado = stm.executeQuery();

            while (resultado.next()) {
                tabela.addRow(
                        new Object[]{
                            resultado.getInt("id"),
                            resultado.getString("descricao")
                        }
                );
            }

            stm.close();

        } catch (Exception e) {
            System.out.println("Erro ao salvar: " + e);
        }

    }

}
