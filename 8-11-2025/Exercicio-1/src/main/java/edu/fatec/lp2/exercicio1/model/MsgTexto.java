package edu.fatec.lp2.exercicio1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MsgTexto extends Mensagem {

    private int numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio, String conteudo, int numChar){
        super(destinatario, horaEnvio, conteudo);
        this.numChar = numChar;
    }

    @Override
    public Mensagem sendMessage(String conteudo){
        return new MsgTexto(getDestinatario(), getHoraEnvio(), conteudo, conteudo.length());
    }

    @Override
    public String toString() {
        return "[Texto] " + super.toString() + " (" + numChar + " caracteres" + ")";
    }
}
