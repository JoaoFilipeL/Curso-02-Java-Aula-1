public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeCarro(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Cor: "+cor);
    }
    int calculaIdade(){
        return 2024 - ano;
    }
}
