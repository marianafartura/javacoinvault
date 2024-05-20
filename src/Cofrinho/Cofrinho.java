package Cofrinho;

import java.util.ArrayList;

class Cofrinho {
    private ArrayList<Moeda> listaMoedas;  // Lista de moedas no cofrinho

    // Construtor que inicializa a lista de moedas
    public Cofrinho() {
        this.listaMoedas = new ArrayList<>();
    }

    // Método para adicionar uma moeda ao cofrinho
    public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }

    // Método para remover uma moeda do cofrinho
    public void remover(Moeda moeda) {
        this.listaMoedas.remove(moeda);
    }

    // Método para listar todas as moedas no cofrinho
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("Cofrinho está vazio.");
        } else {
            for (Moeda moeda : listaMoedas) {
                System.out.println(moeda.info());
            }
        }
    }

    // Método para calcular o total de dinheiro no cofrinho convertido para Real
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }

    // Método para obter a lista de moedas (para ser usado no Main)
    public ArrayList<Moeda> getListaMoedas() {
        return listaMoedas;
    }
}
