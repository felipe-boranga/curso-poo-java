public class Pessoa {
    //#region Classe
    private String nome;
    private Integer idade;
    //#endregion

    //#region Construtores
    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //#endregion

    //#region Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    //#endregion
}
