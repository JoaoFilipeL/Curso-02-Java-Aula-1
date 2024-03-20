import java.util.SortedMap;

public class Musica{
    String nome;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    int totalAvaliacao;
    double numAvaliacao;

    void exibeMusica(){
        System.out.println("Musica: " + nome);
        System.out.println("Artista: " + artista);
        System.out.println("Lançamento: "+ anoLancamento);
    }

    void avaliaMusica(double nota1) {
        somaAvaliacao += nota1;
        totalAvaliacao++;
    }

    double media(){
       return somaAvaliacao / totalAvaliacao;
    }


}
