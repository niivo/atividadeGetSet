/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Mago extends Personagem {
    
    //atribudos
    private int mana;

   
    //contrutor
    public Mago(int mana, String nome, int nivel, int vida) {
        super(nome, nivel, vida);
        this.mana = mana;
    }
    
    //metodos
    public void consumirMana(){
        System.out.println("Mana consumida");
    }
    public void recuperarMana(){
        System.out.println("Mana recuperada");
    }
    
    //metodos de acesso
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
    
    
}
