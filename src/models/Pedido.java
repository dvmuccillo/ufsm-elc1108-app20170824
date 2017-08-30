/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author danie
 */
public class Pedido {
    private Date data;
    private String hora;
    private ArrayList<ItemPedido> listaItensProduto = new ArrayList<ItemPedido>();

    public void getDados(){
        System.out.println(this);
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Pedido(Date data, String hora) {
        this.data = data;
        this.hora = hora;
    }
    
    @Override
    public String toString(){
        return "Data: " + this.getData() + " - Hora: " + this.getHora()  ;
    }

    /**
     * @return the listaItensProduto
     */
    public ArrayList<ItemPedido> getListaItensProduto() {
        return listaItensProduto;
    }

    /**
     * @param listaItensProduto the listaItensProduto to set
     */
    public void setListaItensProduto(ArrayList<ItemPedido> listaItensProduto) {
        this.listaItensProduto = listaItensProduto;
    }
}
