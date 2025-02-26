/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author alzir
 */
public interface InterfaceDao {
    
    public void salvarDao(Object... valor);
    public void excluirDao(int id);
    public void carregarComboBoxDao(Object... valor) throws SQLException;
    public void consultarDao(JComboBox itens) throws SQLException;
    
}
