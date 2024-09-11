package Desafio.AparelhoTelefonico;

public class AparelhoTelefonicoImp implements AparelhoTelefonico{
    @Override
    public String ligar(String num) {
        System.out.println("LIGANDO PARA O NUMERO:" + num);
        return "";
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }

    @Override
    public void desligar() {
        System.out.println("DESLIGANDO");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}
