package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.mensagem.Mensagem;
import edu.fatec.lp2.exercicio1.mensagem.MsgAudio;
import edu.fatec.lp2.exercicio1.mensagem.MsgFoto;
import edu.fatec.lp2.exercicio1.mensagem.MsgTexto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contatinho contato1 = new Contatinho("Zé", "12999999999");
        Contatinho contato2 = new Contatinho("Jorge", "12955555555");

        List<Contatinho> contatos = new ArrayList<Contatinho>();
        contatos.add(contato1);
        contatos.add(contato2);

        MsgAudio msgAudio = new MsgAudio(contato1, "21:55", "eae.wav", 10);
        MsgTexto msgTexto = new MsgTexto(contato2, "16:15", "CADE VOCE", 9);
        MsgFoto msgFoto = new MsgFoto(contato1, "09:40", "GATINHO.PNG", 75);
        List<Mensagem> msgs = new ArrayList<Mensagem>();
        msgs.add(msgAudio);
        msgs.add(msgTexto);
        msgs.add(msgFoto);

        Whatsapp whatsapp = new Whatsapp(contatos, msgs);

        whatsapp.listarContatos();
        whatsapp.listarMensagens();
    }
}
