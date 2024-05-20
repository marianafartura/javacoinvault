package Cofrinho;

// Classe Euro que herda de Moeda
class Euro extends Moeda {
    private static final double TAXA_CONVERSAO = 6.0; // Taxa de conversão para Real

    // Construtor que inicializa o valor do Euro
    public Euro(double valor) {
        super(valor);
    }

    // Implementação do método converter para Real
    @Override
    public double converter() {
        return this.valor * TAXA_CONVERSAO;
    }

    // Implementação do método info que retorna informações sobre o Euro
    @Override
    public String info() {
        return "Euro: " + valor + " EUR";
    }
}


