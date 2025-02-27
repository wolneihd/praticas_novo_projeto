/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author alzir
 */
public class Tabela {
    
    public JTable criarTabela(JPanel jpn, Object[] largura, Object[] pos, Object[] col) throws NullPointerException {
        JTable tabela = new JTable(new DefaultTableModel());
        
        tabela.setVisible(true);
        JScrollPane jsp = new JScrollPane(tabela);
        jsp.setBounds(10, 30, 600, 100);
        jsp.setVisible(true);
        jpn.add(jsp);
        DefaultTableModel modeloTabela = (DefaultTableModel) tabela.getModel();
        
        for (int i = 0; i < col.length; i++) {
            modeloTabela.addColumn(col[i]);
        }
        
        DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        
        for (int i = 0; i < largura.length; i++) {
            if (pos[i].equals("centro")) {
                pos[i] = centro;
            }
            if (pos[i].equals("direita")) {
                pos[i] = direita;
            }
            if (pos[i].equals("esquerda")) {
                pos[i] = esquerda;
            }
            
            tabela.getColumnModel().getColumn(i).setMaxWidth(
                    Integer.parseInt(largura[i].toString())
            );
            
            tabela.getColumnModel().getColumn(i).setCellRenderer(
                    (TableCellRenderer) pos[i]
            );
        }
        return tabela;
    }           
    
}
