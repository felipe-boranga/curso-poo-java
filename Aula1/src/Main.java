public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Karol", 26);
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        Carro meucarro = new Carro("Clio", 2001, "vermelho");
        System.out.println(meucarro.getModelo());
        System.out.println(meucarro.getAno());
        System.out.println(meucarro.getCor());

    }
}