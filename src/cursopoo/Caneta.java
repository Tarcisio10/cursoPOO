package cursopoo;
//classe sempre começa maiúscula

public class Caneta {

    //atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //métodos 
    void status() {
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga :" + this.carga);
        System.out.println("Esta tampada ? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada /*ou tampada == true*/ == true) {
            System.out.println("ERRO, nao posso rabiscar");
        } else {
            System.out.println("Posso rabiscar");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

}
