package cursopoo;
//classe sempre começa maiúscula

public class Caneta {

    //atributos
    private String modelo , cor;
    //private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String m, float p, String c) {
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampada = true;
        System.out.println("Caneta criada com sucesso!");
        System.out.println("modelo:" + this.modelo);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Cor:" + this.cor);
        System.out.println("Tampada:" + this.tampada);

    }

    public void status() {
        System.out.println(this.tampada);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void setTampar() {
        this.tampada = true;
    }

    public void setDestampar() {
        this.tampada = false;
    }

    public String setCor(String c) {
        return this.cor = c;
    }
}
