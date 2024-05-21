package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.mensagem.Mensagem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Whatsapp {
    private List<Contatinho> contatos;
    private List<Mensagem> mensagens;

    public void listarContatos() {
        for (Contatinho contato : contatos) {
            System.out.println(contato.getNome());
        }
    }

    public void listarMensagens() {
        for (Mensagem mensagem : mensagens) {
            System.out.println(mensagem.getConteudo());
        }
    }
}
