package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.impl.Whatsapp;
import edu.fatec.lp2.exercicio1.model.*;

public class Main {

    public static void main(String [] args){
        Contatinho c1 = new Contatinho("Johnatan", "12 98567-1586");
        Contatinho c2 = new Contatinho("Keven", "12 92897-3298");
        Contatinho c3 = new Contatinho("Davi", "11 96524-3686");

        Mensagem msgText = new MsgTexto(c1, "13:30", "Oi, tudo bem?", 13);
        Mensagem msgFoto = new MsgFoto(c2, "19:59", "Foto de paisagem", 10);
        Mensagem msgAudio = new MsgAudio(c3, "20:25", "Bora ir no fut?", 5);

        /// Usando o sendMessage
        Mensagem msgTextEnv = msgText.sendMessage("Bora ir no restaurante!");
        Mensagem msgFotoEnv = msgFoto.sendMessage("Foto de comida");
        Mensagem msgAudioEnv = msgAudio.sendMessage("Pega a garrafa de água para mim, por favor!");

        // Salvando os contatos e as mensagens
        Contatinho[] contatos = {c1, c2};
        Mensagem[] mensagens = {msgText, msgAudio, msgFoto, msgTextEnv, msgFotoEnv, msgAudioEnv
        };

        Whatsapp zap = new Whatsapp(contatos, mensagens);

        zap.listarContatos();
        zap.listarMensagens();

    }

}
