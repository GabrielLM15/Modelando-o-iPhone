package SistemaGeral.Internet;

public class funcaoInternet implements NavegarInternet{
    public void adicionarAba(){
        System.out.println("Abrindo nova página no navegador");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página no navegador");
    }
    public void exibirPagina(){
        System.out.println("Exibindo página selecionada no navegador");
    }
}
