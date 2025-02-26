/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;

import controle.TipoContatoControle;

/**
 *
 * @author alzir
 */
public class TipoContatoVisao extends FormPadrao {
    
    public TipoContatoVisao() {
        setTitle("Tipo de Contato");
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
        
        int id;
        
        try {
            id = Integer.parseInt(jtfId.getText());
        } catch (Exception e) {
            System.out.println("Erro ao converter para inteiro! Será zero.");
            System.out.println("visao: " + jtfDescricao.getText());
            id = 0;
        }
        tcc.salvarControle(id, jtfDescricao.getText()); 
    }
    
}
