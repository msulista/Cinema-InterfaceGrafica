/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.sala;

import java.util.ArrayList;
import model.Sala;

import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marcus.rodrigues
 */
public class SalaTabelaModel extends AbstractTableModel{
    
    private String[] header;
    private List<Sala> salas;
    private JTable table1;
    private JButton insereButton;
    private JButton alteraButton;
    private JButton deletaButton;
    private JButton voltarButton;

    public SalaTabelaModel(){
        this.header = new String[]{"Numero", "QtdCadeiras"};
        this.salas = new ArrayList<Sala>();        
    }
    public SalaTabelaModel(String[] header, List<Sala> salas) {
        this.header = header;
        this.salas = salas;
    }

    public Sala getSala(int linha) {
        return (salas.get(linha));
    } 
   
    @Override
    public int getRowCount() {
        return(this.salas.size());
    }

    @Override
    public int getColumnCount() {
        return (2);
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       if(columnIndex == 0)
            return(this.salas.get(rowIndex).getNumero());
        else if(columnIndex == 1)
            return(this.salas.get(rowIndex).getQtdAssentos());       
        else
            return null;
    }

}
