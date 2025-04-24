package colecoes.minecraft.Baú;

public class Itens {
    private String nome;
    private int quantidade;

    public Itens(String nome) {
        this.nome = nome;
        this.quantidade = 1; // Por padrão, ao adicionar um novo item, ele começa com quantidade 1
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
