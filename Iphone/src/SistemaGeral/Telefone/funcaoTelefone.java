package SistemaGeral.Telefone;

public class funcaoTelefone implements AparelhoTelefonico{
    public void ligar(){
        System.out.println("Ligando para numero (xx) xxxxx-xxxx pelo aplicativo");
    }
    public void atender(){
        System.out.println("Atendendo ligação pelo aplicativo");
    }
    public void iniciarCorreio(){
        System.out.println("Correio sendo iniciado pelo aplicativo");
    }
}