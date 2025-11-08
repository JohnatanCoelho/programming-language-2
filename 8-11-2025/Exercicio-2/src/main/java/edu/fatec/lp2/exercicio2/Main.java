package edu.fatec.lp2.exercicio2;

import edu.fatec.lp2.exercicio2.models.ItemCompra;
import edu.fatec.lp2.exercicio2.models.ListaCompra;
import edu.fatec.lp2.exercicio2.models.Produto;
import edu.fatec.lp2.exercicio2.models.Supermercado;

public class Main {

    public static void main(String [] args) {
        // Produtos
        Produto arroz = new Produto("Arroz Tio João", "kg", "Arroz 100% integral", 23.90, 20, new Supermercado("Simpatia"));
        Produto feijao = new Produto("Feijão Tarumã", "kg", "Feijão Carioca Tipo 1", 13.20, 10, new Supermercado("Shibata"));

        //Item das compreas
        ItemCompra item1 = new ItemCompra(2, arroz, 10);
        ItemCompra item2 = new ItemCompra(2, feijao, 5);

        ListaCompra lista = new ListaCompra(2);

        lista.incluir(item1);
        lista.incluir(item2);

        System.out.printf("Preço total: R$ %.2f",lista.calcularPreco());

    }

}
