package model.funcionalidade;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    public void tocarMusica(String musica) {
        System.out.println(" tocando a música");
    }

    public void pausarMusica() {
    	 System.out.println("A música está em pause");
    }

    public void pararMusica() {
    	 System.out.println("Parando a música");
    }

    public void fazerChamada(String numero) {
    	 System.out.println("Fazendo uma chamada");
    }

    public void receberChamada(String numero) {
    	 System.out.println("Recebendo uma chamada");
    }

    public void encerrarChamada() {
    	 System.out.println("Encerrando uma chamada");
    }

    public void abrirPagina(String url) {
    	 System.out.println("Abrindo uma página Web");
    }

    public void fecharPagina() {
    	System.out.println("Fechando uma página Web");
    }

    public void navegarParaFrente() {
    	System.out.println("Navegando para frente");
    }

    public void navegarParaTras() {
    	System.out.println("Navegando para trás");
    }
}
