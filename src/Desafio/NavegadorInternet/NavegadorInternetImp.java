package Desafio.NavegadorInternet;

public class NavegadorInternetImp implements NavegadorInternet {
    @Override
    public String exibirPagina(String url) {
        System.out.println("Exibindo Pagina");
        return "";
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }
}
