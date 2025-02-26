/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import interfaces.InterfaceControle;
import modelo.TipoContatoModelo;

/**
 *
 * @author alzir
 */
public class TipoContatoControle implements InterfaceControle {

    TipoContatoModelo tcm = new TipoContatoModelo();
    
    @Override
    public void salvarControle(Object... valor) {
        tcm.setId((int) valor[0]);
        tcm.setDescricao((String) valor[1]);
        System.out.println("id: " + tcm.getId());
        System.out.println("descrição: " + tcm.getDescricao());
        // Enviar as informações para o DAO
    }

    @Override
    public void excluirControle(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void carregarComboBox() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
