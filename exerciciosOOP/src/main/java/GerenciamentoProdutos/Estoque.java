package GerenciamentoProdutos;

public class Estoque {

    private static Produto[] produtos = new Produto[5];
    private static int contador = 0;

    public static void adicionarProduto(String nome, Categoria categoria, double preco, int quantidade_estoque) {
        if (contador < produtos.length) {

            produtos[contador++] = new Produto(nome, categoria, preco, quantidade_estoque);

        } else {
            System.out.println("Limite de produtos excedido");
        }
    }

    public static void listarProdutos() {
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    public static void buscarPorCategoria(Categoria categoria){
        for (Produto produto : produtos){
            if (produto.getCategoria() == categoria)  {
                System.out.println(produto);
            }
        }
    }

    public static double calcularValorTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco() * p.getQtd_estoque();
        }
        return total;
    }

    public static void main(String[] args) {

        adicionarProduto("Pão", Categoria.ALIMENTO, 14.00, 15);
        adicionarProduto("Notebook", Categoria.ELETRONICO, 3.590, 10);
        adicionarProduto("Calça", Categoria.ROUPA, 300.00, 20);
        adicionarProduto("Blusa", Categoria.ROUPA, 100.00, 5);
        adicionarProduto("Mortadela", Categoria.ALIMENTO, 8.00, 40);

        listarProdutos();

        buscarPorCategoria(Categoria.ELETRONICO);

        System.out.println("Valor total do estoque: " + calcularValorTotal());


    }
}

