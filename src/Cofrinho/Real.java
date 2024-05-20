package Cofrinho;

// Classe Real que herda de Moeda
class Real extends Moeda {
    // Construtor que inicializa o valor do Real
    public Real(double valor) {
        super(valor);
    }

    // Implementação do método converter que retorna o próprio valor do Real
    @Override
    public double converter() {
        return this.valor;
    }

    // Implementação do método info que retorna informações sobre o Real
    @Override
    public String info() {
        return "Real: " + valor + " BRL";
    }
}

