package cursopoo;

import java.util.Scanner;

public class CursoPOO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        //instancia/cria um objeto
        Caneta c1 = new Caneta(); //nome da classe na frente
        //mexendo nos atributos
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        //chamando métodos=funções
        c1.tampar();
        c1.rabiscar();
        c1.status();
         */
        Garrafa g1 = new Garrafa();

        g1.marca = "Bonafonte";
        System.out.println("Digite o nivel da sua garrafa: ");
        int nivel = input.nextInt();
        g1.tampar = true;
        g1.encher(nivel);

        Garrafa g2 = new Garrafa();
        g2.marca = "Legitima";
        g2.nivel = 100;
        g2.encher(2);

    }

}
