package Equipamentos.multifuncional;

import Equipamentos.Internets.navegadorInternet;
import Equipamentos.Musica.ReprodutorMusica;
import Equipamentos.Telefonia.AparelhoTelefonico;

public class Iphone implements navegadorInternet, ReprodutorMusica, AparelhoTelefonico {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina - Iphone");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando Aba - Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina - Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando - Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando - Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica - Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando - Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo - Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz - Iphone");
    }
    
}
