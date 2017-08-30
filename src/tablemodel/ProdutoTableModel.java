/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import models.Produto;

/**
 *
 * @author danie
 */
public class ProdutoTableModel extends AbstractTableModel{
    private ArrayList<Produto> produtos;
    
    public ProdutoTableModel(){
        
    }
    
    public ProdutoTableModel(ArrayList<Produto> lista){
        this();
        produtos = lista;
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "Codigo";
            case 1: return "Preco";
            case 2: return "Descricao";
            default: return "";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = produtos.get(rowIndex);
        switch(columnIndex){
            case 0: return produto.getCodigo();
            case 1: return produto.getPrecoUnitario();
            case 2: return produto.getDescricao();
            default: return "";
        }
    }
    
    public Produto getProduto (int pos){
        return (pos >= produtos.size())? null : produtos.get(pos);
    }
}
