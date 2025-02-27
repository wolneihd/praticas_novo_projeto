/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;

import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author alzir
 */
public class BairroVisao extends FormPadrao {
    
    JLabel jlBairro;
    JComboBox jcbBairro;
    
    public BairroVisao() {
        setTitle("Cadastro de Bairro");
        
    }    

    @Override
    public void inicializarComponentes() {
        jlBairro = new JLabel("Cidade");
        jlBairro.setBounds(9, 80, 50, 25);
        jpnFormulario.add(jlBairro);
        
        jcbBairro = new JComboBox();
        jcbBairro.setBounds(9, 100, 250, 25);
        jpnFormulario.add(jcbBairro);
    }

    @Override
    public void salvarVisao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void criarTabela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultaVisao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atualizarFormulario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluirVisao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
