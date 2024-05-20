package Cofrinho;

// Classe Dolar que herda de Moeda
class Dolar extends Moeda {
    private static final double TAXA_CONVERSAO = 5.0; // Taxa de conversão para Real

    // Construtor que inicializa o valor do Dolar
    public Dolar(double valor) {
        super(valor);
    }

    // Implementação do método converter para Real
    @Override
    public double converter() {
        return this.valor * TAXA_CONVERSAO;
    }

    // Implementação do método info que retorna informações sobre o Dolar
    @Override
    public String info() {
        return "Dólar: " + valor + " USD";
    }
}

