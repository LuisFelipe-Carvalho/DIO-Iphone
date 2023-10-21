package Usuario;

import Equipamentos.Internets.Internet;
import Equipamentos.Internets.navegadorInternet;
import Equipamentos.Musica.ReprodutorMusica;
import Equipamentos.Telefonia.AparelhoTelefonico;
import Equipamentos.multifuncional.Iphone;

public class usuario {
    public static void main(String[] args) {

        Iphone Iphone = new Iphone();
        navegadorInternet navegadorInternet = new Iphone();
        ReprodutorMusica ReprodutorMusica = new Iphone();
        AparelhoTelefonico AparelhoTelefonico = new Iphone();

        navegadorInternet.exibirPagina();
        ReprodutorMusica.tocar();
        AparelhoTelefonico.ligar();
    }
}
