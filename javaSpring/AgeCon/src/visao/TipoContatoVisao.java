/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;

import controle.TipoContatoControle;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alzir
 */
public class TipoContatoVisao extends FormPadrao {
    
    public TipoContatoVisao() {
        setTitle("Tipo de Contato");
        consultaVisao();
    }

    @Override
    public void inicializarComponentes() {
        // TO-DO
    }
    
    // Instância de controle
    TipoContatoControle tcc = new TipoContatoControle();

    @Override
    public void salvarVisao() {
        // inserir comando para envio ao Controle:
        tcc.salvarControle(jtfId.getText(), jtfDescricao.getText()); 
    }

    @Override
    public void criarTabela() {
        tabela = utilTabela.criarTabela(
                jpnConsulta, 
                new Object[] {60, 400}, 
                new Object[] {"centro", "esquerda"}, 
                new Object[] {"ID", "Descrição"}
            );
        modelo = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void consultaVisao() {
        modelo.setNumRows(0);
        tcc.consultarControle(jtfConsulta.getText(), modelo);
    }
    
}
