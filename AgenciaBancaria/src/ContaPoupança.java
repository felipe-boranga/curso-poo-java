import java.util.Date;

public class ContaPoupança extends ContaBancaria{
    public ContaPoupança(String agencia, String conta, Integer digito, Double saldoInicial) {
        super(agencia, conta, digito, saldoInicial);
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println("**********************");
        System.out.println("****** EXTRATO CONTA POUPANÇA *******");
        System.out.println("**********************");
        System.out.println();
        System.out.println("Gerado em: "+ DataUtil.conventerData(new Date()));
        System.out.println();
        for (Movimentacao movimentacao : this.movimentacoes){
            System.out.println(movimentacao);
        }
        System.out.println();
        System.out.println("**********************");
        System.out.println("**********************");



    }
}
