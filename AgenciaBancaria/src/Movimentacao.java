import java.util.Date;

public class Movimentacao {
    private String descricao;
    private Date data;
    private Double valor;

    public Movimentacao(String descricao, Date data, Double valor) {
        this.descricao = descricao;
        this.data = new Date();
        this.valor = valor;
    }

    public Movimentacao(String deposito, Double valor) {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }


    public Double getValor() {
        return valor;
    }

    @Override
    public String toString(){
        String dataFormatada = DataUtil.conventerData(this.getData());
        return "Tipo: " +this.getDescricao()+ "\n " + dataFormatada +"\n" + " R$:" + this.valor;
    }

}
