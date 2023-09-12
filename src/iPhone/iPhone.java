package iPhone;

import iPhone.aparelhotelefonico.AparelhoTelefonico;
import iPhone.navegadorinternet.NavegadorInternet;
import iPhone.reprodutormusical.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {



    @Override
    public void ligar(String numero) {
        System.out.println("Realizando chamada para numero " + numero + "!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação!");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Correio de voz!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " selecionada!");
    }


}
