package cursopoo;

public class ContaBanco {

    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(String tC, int numConta) {
        this.setStatus(true);
        //setTipoConta(tC);
        //abrirConta(tp);
        this.setTipoConta(tC);
        this.setNumConta(numConta);
        System.out.println("Status:" + this.status);
        System.out.println("TIPO DE CONTA:" + this.tipoConta);
        System.out.println("NUMERO DA CONTA:" + this.numConta);
        System.out.println("SALDO: " + getSaldo());
    }

    //Métodos personalizados
    public void abrirConta(String tp) {
        this.setStatus(true);
        if ("cc".equals(tp)) {
            this.setSaldo(50);
        } else if ("cf".equals(tp)) {
            this.setSaldo(150);
        }

    }

    public void fecharConta() { //Não mostrar coisas em métodos, encapsular.
        if (this.getSaldo() > 0) {
            System.out.println("Nao posso fechar!! Saldo positivo");
        } else if (this.getSaldo() < 0) {
            System.out.println("Não posso fechar!! Saldo negativo");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!");
        }
    }

    public void depositar(boolean sts, float v) {
        if (sts == true) {
            //v += this.saldo;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Imposivel depositar");
        }
    }

    public void sacar(int v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("SAQUE REALIZADO");
            } else {
                System.out.println("SALDO INSULFICIENTE PARA SAQUE");
            }
        } else {
            System.out.println("CONTA INATIVA");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if ("CC".equals(this.getTipoConta())) {
            v = 12;
        } else if ("CF".equals(this.getTipoConta())) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga");
        }else{
            System.out.println("");
        }
    }

    //Métodos especiais
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
        if ("cc".equals(this.tipoConta)) {
            //this.tipoConta = tp;
            this.setSaldo(50.2f);
        } else if ("cf".equals(tipoConta)) {
            //this.tipoConta = tp;
            this.setSaldo(150);
        }
        return this.tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

}
