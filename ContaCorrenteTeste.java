package Banco;

public class ContaCorrenteTeste {

    public static void main(String[] args) {

        ContaCorrente conta00 = new ContaCorrente();

        conta00.setNconta(444777);
        conta00.setSaldo(5000);

        System.out.println("num da conta:" + conta00.getNconta());
        System.out.println("saldo: " + conta00.getSaldo());

        conta00.depositar(100.0);

        System.out.println("num da conta: " +conta00.getNconta());
        System.out.println("saldo atual: " +conta00.getSaldo());

        conta00.sacar(1000);

        System.out.println("num da conta: " +conta00.getNconta());
        System.out.println("saldo atual: " +conta00.getSaldo());
    }
}
