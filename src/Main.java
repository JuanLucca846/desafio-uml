import iPhone.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone iPhone = new iPhone();

        System.out.println("---------");
        iPhone.ligar("912345678");
        iPhone.atender();
        iPhone.iniciarCorrerioVoz();

        System.out.println("---------");
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

        System.out.println("---------");
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Teste");
    }
}