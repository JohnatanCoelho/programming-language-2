package edu.fatec.lp2.exercicio2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Produto {

    private String nome;
    private String unidade;
    private String descricao;
    private double preco;
    private double descontoMax;
    private Supermercado supermercado;

    @Override
    public String toString(){
       return "Produto:" + nome;
    }
}
