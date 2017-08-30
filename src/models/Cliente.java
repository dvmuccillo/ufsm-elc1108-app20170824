/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Cliente {

    private String cidade;
    private String endereco;
    private String fone;
    private ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
    
    
    public Cliente(String cidade, String endereco, String fone) {
        this.cidade = cidade;
        this.endereco = endereco;
        this.fone = fone;
    }
    
    /**
     * Get the value of listaPedidos
     *
     * @return the value of listaPedidos
     */
    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    /**
     * Set the value of listaPedidos
     *
     * @param ListaPedidos new value of listaPedidos
     */
    public void setListaPedidos(ArrayList<Pedido> ListaPedidos) {
        this.listaPedidos = ListaPedidos;
    }

    public void getDados(){
        System.out.println(this);
    }
    
    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }
    
    @Override
    public String toString(){
        return "Cidade: " + this.getCidade() 
                + " - Endereço: " + this.getEndereco()
                + " - Telefone: " + this.getFone();
    }
    
}
