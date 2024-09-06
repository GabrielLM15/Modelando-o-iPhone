package SistemaGeral;

import SistemaGeral.Internet.NavegarInternet;
import SistemaGeral.Musica.ReprodutorMusical;
import SistemaGeral.Telefone.AparelhoTelefonico;

public class SistemaCelular implements ReprodutorMusical, AparelhoTelefonico, NavegarInternet{
    public void tocar(){
        System.out.println("Musica sendo reproduzida no Iphone");
    }
    public void pausar(){
        System.out.println("Musica pausada no Iphone");
    }
    public void selecionarMusica(String musica){
        System.out.println("Tocando a musica " + musica + " no Iphone");
    }


    public void ligar(){
        System.out.println("Ligando para numero (xx) xxxxx-xxxx pelo Iphone");
    }
    public void atender(){
        System.out.println("Atendendo ligação pelo Iphone");
    }
    public void iniciarCorreio(){
        System.out.println("Correio sendo iniciado pelo Iphone");
    }


    public void adicionarAba(){
        System.out.println("Abrindo nova página no Iphone");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página no Iphone");
    }
    public void exibirPagina(){
        System.out.println("Exibindo página selecionada no iphone");
    }
}
