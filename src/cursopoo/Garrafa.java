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
    String marca;
    int nivel;

    void status() {
        System.out.println();
    }

    void beber() {
        if (this.tampar == true) {
            System.out.println("Posso beber");
        } else {
            System.out.println("Não posso beber!");
        }
    }

    void encher(int nivel) {
        if (nivel < 100) {
            System.out.println("Pode encher");
        } else {
            System.out.println("Ela esta cheia");
        }

    }

}
