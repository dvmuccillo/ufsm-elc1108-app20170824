/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author danie
 */
public class ItemPedido {
    private int quantidade;
    private double valor;
    private Produto produto;

    @Override
    public String toString() {
        return "ItemPedido{" + "quantidade=" + quantidade + ", valor=" + valor + ", produto=" + produto + '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ItemPedido(int quantidade, double valor, Produto produto) {
        this.quantidade = quantidade;
        this.valor = valor;
        this.produto = produto;
    }
}
