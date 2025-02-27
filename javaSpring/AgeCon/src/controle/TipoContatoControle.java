/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import dao.TipoContatoDao;
import interfaces.InterfaceControle;
import modelo.TipoContatoModelo;

/**
 *
 * @author alzir
 */
public class TipoContatoControle implements InterfaceControle {

    TipoContatoModelo tcm = new TipoContatoModelo();
    TipoContatoDao tcd = new TipoContatoDao();

    @Override
    public void salvarControle(Object... valor) {

        if ("".equals(valor[0])) {
            tcm.setId(0);
        } else {
            tcm.setId((int) valor[0]);
        }

        tcm.setDescricao((String) valor[1]);

        // Enviar as informações para o DAO
        tcd.salvarDao(tcm);
    }

    @Override
    public void excluirControle(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void carregarComboBox() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultarControle(Object... valor) {

        try {
            tcd.consultarDao(valor);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
