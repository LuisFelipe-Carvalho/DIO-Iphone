package Equipamentos.Internets;
public class Internet implements navegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

}
