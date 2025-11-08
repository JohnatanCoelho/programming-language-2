package edu.fatec.lp2.exercicio1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MsgFoto extends Mensagem {

    private int tamanho;

    public MsgFoto(Contatinho destinatario, String horaEnvio, String conteudo, int tamanho){
            super(destinatario, horaEnvio, conteudo);
            this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage(String conteudo){
        return new MsgFoto(getDestinatario(), getHoraEnvio(), conteudo, tamanho);
    }

    @Override
    public String toString(){
        return "[Foto] " + super.toString() + " (" + tamanho + "mb" +  ")";
    }
}
