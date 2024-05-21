package edu.fatec.lp2.exercicio2;

public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado("Supermercado Astolfo");

        Produto produto1 = new Produto(supermercado);
        produto1.setNome("Cebola");
        produto1.setUnidade("kg");
        produto1.setDescricao("Cebola grandona");
        produto1.setPreco(3);
        produto1.setDescontoMaximo(10);

        Produto produto2 = new Produto(supermercado);
        produto2.setNome("Cachaça");
        produto2.setUnidade("un");
        produto2.setDescricao("Caçhaca pinguça");
        produto2.setPreco(12.00);
        produto2.setDescontoMaximo(5);

        ItemCompra item1 = new ItemCompra(produto1, 5);
        item1.setQuantidade(2);

        ItemCompra item2 = new ItemCompra(produto2, 10);
        item2.setQuantidade(3);

        ListaCompra listaCompra = new ListaCompra(5);
        listaCompra.incluir(item1);
        listaCompra.incluir(item2);

        System.out.println("Preço total da lista de compras: " + listaCompra.calcularPreco());
    }
}