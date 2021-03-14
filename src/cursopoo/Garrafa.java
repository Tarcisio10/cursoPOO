/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursopoo;

/**
 *
 * @author tbn
 */
public class Garrafa {

    boolean tampar;
    int nivel ;
    String marca;
    
    void status(){
        
        System.out.println("Marca: " + this.marca);
        System.out.println("Nivel: " + this.nivel);
        System.out.println();
        
        
        
    }

    void encher() {
        if (this.nivel < 100) {
            System.out.println("Pode encher");
        } else {
            System.out.println("Está cheia");
        }
    }

    void beber() {
        if (this.tampar == true) {
            System.out.println("Esta com tampa");
        } else {
            System.out.println("Pode beber");
        }
    }

    void tampar() {
        this.tampar = true;
    }

    void destampar() {
        this.tampar = false;
    }

}
