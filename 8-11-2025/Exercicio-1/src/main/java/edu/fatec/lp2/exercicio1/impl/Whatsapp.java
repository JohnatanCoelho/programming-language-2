package edu.fatec.lp2.exercicio1.impl;

import edu.fatec.lp2.exercicio1.model.Contatinho;
import edu.fatec.lp2.exercicio1.model.Mensagem;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Whatsapp {

    private Contatinho[] contatos;
    private Mensagem[] mensagens;

    public Whatsapp(Contatinho[] contatos, Mensagem[] mensagens){
        this.contatos = contatos;
        this.mensagens = mensagens;
    }

    public void listarContatos(){
        System.out.println("=== Contatos ===");
        for(Contatinho contato: contatos){
            System.out.println(contato);
        }
    }

    public void listarMensagens(){
        System.out.println("=== Mensagens ===");
        for(Mensagem mensagem: mensagens){
            System.out.println(mensagem);
        }
    }

}
