/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alzir
 */
public class CidadeVisao extends FormPadrao {
    
    JLabel jlUf;
    JLabel jlCep;
    
    JComboBox jcbUf;
    JTextField jtfCep;
    
    
    public CidadeVisao() {
        setTitle("Cadastro de Cidade");
    }

    @Override
    public void inicializarComponentes() {
        jlUf = new JLabel("UF");
        jlUf.setBounds(9, 80, 50, 25);
        jpnFormulario.add(jlUf);
        
        jcbUf = new JComboBox();
        jcbUf.setBounds(9, 100, 100, 25);
        jpnFormulario.add(jcbUf);
        
        jlCep = new JLabel("CEP");
        jlCep.setBounds(120, 80, 120, 25);
        jpnFormulario.add(jlCep);
        
        jtfCep = new JTextField();
        jtfCep.setBounds(120, 100, 120, 25);
        jpnFormulario.add(jtfCep);
    }

    @Override
    public void salvarVisao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
