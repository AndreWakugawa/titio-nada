package edu.fatec.lp2.exercicio1.mensagem;

import edu.fatec.lp2.exercicio1.Contatinho;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MsgAudio extends Mensagem{
    private int duracao;

    public MsgAudio(Contatinho contato1, String time, String s, int i) {
        super(contato1, time, s);
        duracao = i;
    }


    @Override
    public String toString() {
        return "";
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        this.setConteudo(conteudo);
        System.out.println("Mensagem de áudio enviada com duracao: " + duracao);
        return this;
    }
}
