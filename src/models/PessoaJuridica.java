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
public class PessoaJuridica extends Cliente{
    private String cnpj;
    private String razaoSocial;
    
    public void getDados(){
        System.out.println(this);
    }

    public PessoaJuridica(String cnpj, String razaoSocial, String cidade, String endereco, String fone) {
        super(cidade, endereco, fone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    @Override
    public String toString(){
        return "Razão Social: " + this.getRazaoSocial()
                + " - CNPJ: " + this.getCnpj() + " - " + super.toString();
    }
}
