package Desafio.Iphone;

import Desafio.AparelhoTelefonico.AparelhoTelefonico;
import Desafio.NavegadorInternet.NavegadorInternet;
import Desafio.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    private String modelo;
    private String capacidade;
 
    public Iphone(String modelo, String capacidade) {
       this.modelo = modelo;
       this.capacidade = capacidade;
    }
 
    public String getModelo() {
       return modelo;
    }
 
    public void setModelo(String modelo) {
       this.modelo = modelo;
    }
 
    public String getCapacidade() {
       return capacidade;
    }
 
    public void setCapacidade(String capacidade) {
       this.capacidade = capacidade;
    }
 
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
