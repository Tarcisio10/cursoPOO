package cursopoo;

public class Banco {

    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    public Banco(String tC) {
        this.status = true;
        this.tipoConta = tC;
        //abrirConta(tp);
        System.out.println("Status:" + this.status);
        System.out.println("TIPO DE CONTA:" + this.tipoConta);
        
        System.out.println("SALDO: " + this.saldo );
    }

    public void abrirConta(String tp) {
        this.status = true;

    }

    public void fecharConta(boolean sts) {
        this.status = false;
    }

    public void depositar(boolean sts, float v) {
        if (sts == true) {
            v += this.saldo;
        }
    }

    public void sacar() {

    }

    public void pagarMensal() {

    }

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
        if (this.tipoConta == "cc") {
            //this.tipoConta = tp;
            this.saldo = 50.0f;
        } else if (tipoConta == "cp") {
            //this.tipoConta = tp;
            setSaldo(150);
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
