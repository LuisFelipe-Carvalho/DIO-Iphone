package Equipamentos.Musica;
public class Ipod implements ReprodutorMusica{

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }
    
}
