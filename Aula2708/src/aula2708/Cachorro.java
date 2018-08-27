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
public class Cachorro {
    private String nome;
    private String raca;
    private String cor;
    public static int  quant=0;
    Cachorro (String nome,String raca,String cor){
        this.cor=cor;
        this.nome=nome;
        this.raca=raca;
        Cachorro.quant+=1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
