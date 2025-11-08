package edu.fatec.lp2.exercicio2.models;

import edu.fatec.lp2.exercicio2.interfaces.Calculavel;

public class ListaCompra implements Calculavel {

    private ItemCompra[] itensCompra;
    private int qtdeMax;
    private int posicao;

    public ListaCompra(int qtdeMax){
        this.qtdeMax = qtdeMax;
        itensCompra = new ItemCompra[qtdeMax];
    }

    public void incluir(ItemCompra item){
        if(posicao < qtdeMax){
            itensCompra[posicao++] = item;
        } else{
            System.out.println("Lista cheia! Não é possível colocar mais itens na lista!");
        }
    }

    @Override
    public double calcularPreco(){
        double total = 0;
        for(int i = 0; i < posicao; i++){
            total += itensCompra[i].calcularPreco();
        }
        return total;
    }

}
