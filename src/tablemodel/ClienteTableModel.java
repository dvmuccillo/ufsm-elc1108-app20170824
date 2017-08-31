/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import models.Cliente;
import models.PessoaFisica;
import models.PessoaJuridica;

/**
 *
 * @author danie
 */
public class ClienteTableModel extends AbstractTableModel {
    private ArrayList<Cliente> clientes;
    
    public ClienteTableModel(){
        
    }
    
    public ClienteTableModel(ArrayList<Cliente> lista){
        this();
        clientes = lista;
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "Nome / Razão Social";
            case 1: return "Tipo";
            case 2: return "Cidade";
            default: return "";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        switch(columnIndex){
            case 0: return cliente.getNome();
            case 1:
                if(cliente instanceof PessoaFisica){
                    return "Pessoa Física";
                } else if (cliente instanceof PessoaJuridica){
                    return "Pessoa Jurídica";
                }
            case 2: return cliente.getCidade();
            default: return "";
        }
    }
    
    public Cliente getCliente (int pos){
        return (pos >= clientes.size())? null : clientes.get(pos);
    }
}
