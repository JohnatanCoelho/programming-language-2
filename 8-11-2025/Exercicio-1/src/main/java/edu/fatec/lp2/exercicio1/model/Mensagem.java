package edu.fatec.lp2.exercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Mensagem {

    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public abstract Mensagem sendMessage(String msg);

    @Override
    public String toString(){
        return "Para: " + destinatario + " | " + horaEnvio + " | " + conteudo;
    }

}
