package SistemaGeral.Musica;

public class funcaoMusical implements ReprodutorMusical {
    public void tocar(){
        System.out.println("Musica sendo reproduzida Ipod apenas");
    }
    public void pausar(){
        System.out.println("Musica pausada no Ipod");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando a musica " + musica + " no Ipod");
    }
    
}
