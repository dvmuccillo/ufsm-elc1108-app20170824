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
public class PessoaFisica extends Cliente {
    private String cpf;
    private String nome;
    
    public void getDados(){
        System.out.println(this + super.toString());
    }

    public PessoaFisica(String cpf, String nome, String cidade, String endereco, String fone) {
        super(cidade, endereco, fone);
        this.cpf = cpf;
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.nome = Nome;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.getNome() + "CPF: " + this.getCpf() + super.toString();
    }
    
}
