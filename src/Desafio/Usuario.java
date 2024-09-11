package Desafio;

import Desafio.AparelhoTelefonico.AparelhoTelefonicoImp;
import Desafio.Iphone.Iphone;
import Desafio.NavegadorInternet.NavegadorInternetImp;
import Desafio.ReprodutorMusical.ReprodutorMusicalimp;

public class Usuario {
    public static void main(String[] args) {
        AparelhoTelefonicoImp aparelhoTelefonico = new AparelhoTelefonicoImp();
        NavegadorInternetImp navegadorInternet = new NavegadorInternetImp();
        ReprodutorMusicalimp reprodutorMusical = new ReprodutorMusicalimp();

        Iphone iphone = new Iphone("Samsung", "120 GB");

        iphone.ligar("123456789");
        iphone.atender();
        iphone.desligar();
        iphone.iniciarCorreioDeVoz();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Minha Música");

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarAba();
        iphone.atualizarPagina();
    }
    
}
