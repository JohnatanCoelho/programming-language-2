package edu.fatec.lp2.exercicio1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Contatinho {

    private String nome;
    private String celular;


    @Override
    public String toString() {
        return nome + " | " + celular;
    }
}
