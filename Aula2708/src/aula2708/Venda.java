/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2708;

/**
 *
 * @author ice
 */
public class Venda {

    private Cachorro c;
    
    public Venda(Cachorro c) {
    this.c=c;
    }
    public void addCachorro(int add){
        Cachorro.quant+=2;
        
    }
    public void vendaCachorro(int retira){
        Cachorro.quant-=retira;
    }
    public void imprime(){
        System.out.println("número:"+Cachorro.quant);
    }
    

    
}