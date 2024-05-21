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
public class MsgTexto extends Mensagem{
    private int numChar;

    public MsgTexto(Contatinho contato2, String time, String cadeVoce, int i) {
        super(contato2, time, cadeVoce);
        this.numChar = i;
    }


    @Override
    public String toString() {
        return "";
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        this.setConteudo(conteudo);
        this.numChar = conteudo.length();
        System.out.println("Mensagem de texto enviada: " + conteudo);
        return this;
    }
}
