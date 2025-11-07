package edu.fatec.lp2.exercicio1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class MsgAudio extends Mensagem{

    private int duracao;

    public MsgAudio(Contatinho destinatario, String horaEnvio, String conteudo, int duracao){
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage(String conteudo){
        return new MsgAudio(getDestinatario(), getHoraEnvio(), conteudo, duracao);
    }

    @Override
    public String toString() {
        return "[Audio] " + super.toString() + " (" + duracao + "s)";
    }
}

