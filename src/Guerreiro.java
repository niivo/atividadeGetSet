/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Guerreiro extends Personagem{
    //atributos especificos
    private String arma;
    
    //construtor
    public Guerreiro(String arma, String nome, int nivel, int vida) {
        super(nome, nivel, vida);
        this.arma = arma;
    }
    
    //metodos
    public void defender(){
        System.out.println("O guerreiro " +getNome()+ "defendeu");
    }
    
    @Override
    public void status(){
        System.out.println("----- Personagem -----");
        System.out.println(getNome());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Vida: " + getVida());
    }

    //metodos de acesso
    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }



    
    
    
    
}
