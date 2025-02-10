package GerenciamentoProdutos;

public class Produto {
    private String nome;
    private Categoria categoria;
    private double preco;
    private int qtd_estoque;

    public Produto(String nome, Categoria categoria, double preco, int qtd_estoque) {
        if (!validarPreco(preco)) {
            throw new IllegalArgumentException("Preço não pode ser negativo!");
        }
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.qtd_estoque = qtd_estoque;
    }

    static boolean validarPreco(double preco) {
        return preco >= 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", categoria=" + categoria +
                ", preco=" + preco +
                ", qtd_estoque=" + qtd_estoque +
                '}';
    }
}
