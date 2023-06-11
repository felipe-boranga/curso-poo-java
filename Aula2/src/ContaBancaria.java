import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {
    //#region ATRIBUTOS
    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;
    private Date dataAbertura;
    private Double VALOR_MINIMO_DEPOSITO = 10.0;
    //#endregion

    //#region CONSTRUTORES
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
    }
    //#endregion

    //#region GETTERS e SETTERS
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    //#endregion

    //#region METODOS
    public void depositar(Double valor) {
        if (valor < VALOR_MINIMO_DEPOSITO) {
            throw new InputMismatchException("O valor minimo de deposito é 10 reais");
        }
        this.saldo += valor;
    }
        public Double sacar(Double saldo) {
            if (saldo > this.saldo) {
                throw new InputMismatchException("Saldo insuficiente");
            }
            this.saldo -= saldo;
            return saldo;
        }
        public void transferir(Double valor, ContaBancaria contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
        }
        //#endregion


    }





