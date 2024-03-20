public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacao;
    int duracaoEmMinutos;

    void exibeFicha() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Tempo: " + duracaoEmMinutos);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacao++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalAvaliacao;
    }
}
