package Desafio.ReprodutorMusical;

public class ReprodutorMusicalimp implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }

    @Override
    public String selecionarMusica(String musica) {
        System.out.println("Selecionando Musica");
        return "";
    }
}
