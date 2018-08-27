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
public class Aula2708 {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
       
        Cachorro c1=new Cachorro ("jao","preto","jao");
        
        
        Cachorro c2=new Cachorro ("jao","preto","jao");
        
      
      
        Cachorro c3=new Cachorro ("jao","preto","jao");
      Venda v=new Venda (c3);
      v.imprime();
    }
    
}

