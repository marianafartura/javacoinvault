package Cofrinho;

// Classe abstrata Moeda
abstract class Moeda {
    protected double valor;  // Valor da moeda

    // Construtor que inicializa o valor da moeda
    public Moeda(double valor) {
        this.valor = valor;
    }

    // Método abstrato que retorna informações da moeda
    public abstract String info();

    // Método abstrato que converte o valor da moeda para Real
    public abstract double converter();
}

