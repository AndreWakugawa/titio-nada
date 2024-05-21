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
public class MsgFoto extends Mensagem{
    private int tamanho;

    public MsgFoto(Contatinho contato1, String time, String image, int i) {
        super(contato1, time, image);
        this.tamanho = i;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        this.setConteudo(conteudo);
        System.out.println("Mensagem de foto enviada de tamanho: " + tamanho);
        return this;
    }
}
