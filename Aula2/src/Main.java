import java.util.Date;

public class Main{

    public static void main(String[] args){

        System.out.println("--- Banco POO JAVA ---");

        ContaCorrente conta = new ContaCorrente("1","123",1,200.0);

        System.out.println("Saldo atual: " + conta.getSaldo());
        conta.depositar(150.0);
        System.out.println("Saldo atual: " + conta.getSaldo());
        conta.sacar(120.0);
        System.out.println("Saldo atual: " + conta.getSaldo());

        var saque = conta.sacar(120.0);
        System.out.println("Saldo atual: " + conta.getSaldo());

        ContaPoupança conta2 = new ContaPoupança("1", "1234", 2, 200.0);
        System.out.println("Saldo conta 2 "+conta2.getSaldo());
        System.out.println("Saldo conta 1 "+conta.getSaldo());

        conta2.transferir(100.0, conta);
        System.out.println("Saldo conta 2 "+conta2.getSaldo());
        System.out.println("Saldo conta 1 "+conta.getSaldo());
        System.out.println(conta2.getDataAbertura());

       // DataUtil util = new DataUtil();
        var formatado = DataUtil.conventerData(conta2.getDataAbertura());

        System.out.println(formatado);
    }
}
