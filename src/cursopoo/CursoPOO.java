
package cursopoo;


public class CursoPOO {

    public static void main(String[] args) {
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
        Caneta c2 = new Caneta();
        c2.cor= "Preto";
        c2.ponta = 0.7f;
        c2.carga = 95;
        c2.modelo = "Topper";
        c2.tampada = true;
        c2.rabiscar();
        c2.status();
        c2.destampar();
        c2.rabiscar();
        
    }
    
}
