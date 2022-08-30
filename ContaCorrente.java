package Banco;

public class ContaCorrente {

    private int nconta;
    private double saldo;

    public void sacar(double valorsaque){
        if (valorsaque<=saldo){
            saldo = saldo - valorsaque;
        } else {
            System.out.println("saldo foi insuficiente");
        }

    }
    public void depositar(double valordeposito){
        if (valordeposito > 0) {
        saldo = saldo + valordeposito;
    } else {
            System.out.println("Valor precisa ser maior que 0");
        }
    }

    public int getNconta() {
        return nconta;
    }

    public void setNconta(int nconta) {
        this.nconta = nconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

