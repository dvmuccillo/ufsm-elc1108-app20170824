/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;
import models.Cliente;
import models.Pedido;
import models.Produto;

/**
 *
 * @author danie
 */
public class Storage {
    private static Storage instance = null;
    public ArrayList<Cliente> clientes = new ArrayList<>();
    public ArrayList<Produto> produtos = new ArrayList<>();
    public ArrayList<Pedido> pedidos = new ArrayList<>();
            
    private Storage(){
        
    }
    
    public static synchronized Storage getInstance(){
        if(instance == null){
           instance = new Storage();
        }
        return instance;
    }
}
