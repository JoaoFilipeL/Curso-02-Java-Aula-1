public class Produto {

    String nome;
    double preco;
    double descontoParaPix;
    double precoFinal;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix == true) {
            precoFinal = preco - descontoParaPix;
        } else {
            precoFinal = preco;
        }
        return precoFinal;
    }

    }
