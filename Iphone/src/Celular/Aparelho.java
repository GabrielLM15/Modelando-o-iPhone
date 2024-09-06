package Celular;

import SistemaGeral.SistemaCelular;

public class Aparelho {
    public static void main(String[] args) {
        SistemaCelular iphone = new SistemaCelular();
        System.out.println("Sitema de musica iphone");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Szoone - Sza");

        System.out.println("Sistema Telefonico Iphone");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreio();

        System.out.println("Sitema de navegação na internet Iphone");
        iphone.adicionarAba();
        iphone.adicionarAba();
        iphone.exibirPagina();
    }
}
