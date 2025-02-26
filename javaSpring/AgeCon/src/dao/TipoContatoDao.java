/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.InterfaceDao;
import java.sql.SQLException;
import javax.swing.JComboBox;
import modelo.TipoContatoModelo;

/**
 *
 * @author alzir
 */
public class TipoContatoDao implements InterfaceDao {
       
    @Override
    public void salvarDao(Object... valor) {
        TipoContatoModelo tcm = (TipoContatoModelo) valor[0];
        
        // testando se chegam os dados:
        System.out.println("Id DAO: " + tcm.getId());
        System.out.println("Descrição DAO: " + tcm.getDescricao());
    }

    @Override
    public void excluirDao(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void carregarComboBoxDao(Object... valor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultarDao(JComboBox itens) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
