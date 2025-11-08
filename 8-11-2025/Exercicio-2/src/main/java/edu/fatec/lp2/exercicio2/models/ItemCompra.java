package edu.fatec.lp2.exercicio2.models;

import edu.fatec.lp2.exercicio2.interfaces.Calculavel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ItemCompra implements Calculavel {

    private int quantidade;
    private Produto produto;
    private double desconto;

    @Override
    public double calcularPreco(){

        if(quantidade >= 5){
           double precoComDescontoMax =  produto.getPreco() - (produto.getPreco() * (produto.getDescontoMax() / 100));
           return precoComDescontoMax * quantidade;

        } else if(quantidade >= 2){
            double precoComDesconto =  produto.getPreco() - (produto.getPreco() * (desconto / 100));
            return precoComDesconto * quantidade;

        } else {
            return produto.getPreco() * quantidade;

        }
    }


}
