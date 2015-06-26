package view.filme;

import model.Filme;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcus.rodrigues on 20/06/2015.
 */
public class FilmeTableModel extends AbstractTableModel {

    private String[] header;
    private List<Filme> filmes;
    private JTable table1;
    private JButton insereButton;
    private JButton alteraButton;
    private JButton deletaButton;
    private JButton voltarButton;

    public FilmeTableModel() {
        this.header = new String[]{"Código", "Titulo", "Genero", "Sinopse", "Data de Inicio", "Data de Termino"};
        this.filmes = new ArrayList<Filme>();
    }

    public FilmeTableModel(String[] header, List<Filme> filmes) {
        this.header = header;
        this.filmes = filmes;
    }

    @Override
    public int getRowCount() {
        return(this.filmes.size());
    }

    @Override
    public int getColumnCount() {
        return(6);
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0)
            return(this.filmes.get(rowIndex).getCodigo());
        else if(columnIndex == 1)
            return(this.filmes.get(rowIndex).getTitulo());
        else if(columnIndex == 2)
            return(this.filmes.get(rowIndex).getGenero());
        else if(columnIndex == 3)
            return(this.filmes.get(rowIndex).getSinopse());
        else if(columnIndex == 4)
            return(this.filmes.get(rowIndex).getDataInicio());
        else if(columnIndex == 5)
            return(this.filmes.get(rowIndex).getDataTermino());
        else
            return null;
    }
   
    public void setFilme(List<Filme> filmes){
        this.filmes = filmes;
    }

    public Filme getFilme(int linha)
    {
        return(filmes.get(linha));
    }
}
