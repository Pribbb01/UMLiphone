public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    // Construtor
    public iPhone() {
        reprodutorMusical = new ReprodutorMusicalImpl();
        aparelhoTelefonico = new AparelhoTelefonicoImpl();
        navegadorInternet = new NavegadorInternetImpl();
    }

    public void usarReprodutorMusical() {
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();
    }

    public void usarAparelhoTelefonico() {
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void usarNavegadorInternet() {
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}
