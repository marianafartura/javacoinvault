package Cofrinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();  // Instanciação do objeto Cofrinho
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Loop do menu interativo
        do {
            System.out.println("Menu do Cofrinho:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total convertido para Real");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar uma moeda ao cofrinho
                    System.out.print("Escolha a moeda (1-Dólar, 2-Euro, 3-Real): ");
                    int tipoMoeda = scanner.nextInt();
                    System.out.print("Digite o valor da moeda: ");
                    double valor = scanner.nextDouble();
                    Moeda moeda = null;

                    switch (tipoMoeda) {
                        case 1:
                            moeda = new Dolar(valor);
                            break;
                        case 2:
                            moeda = new Euro(valor);
                            break;
                        case 3:
                            moeda = new Real(valor);
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido!");
                    }

                    if (moeda != null) {
                        cofrinho.adicionar(moeda);
                        System.out.println("Moeda adicionada com sucesso!");
                    }
                    break;

                case 2:
                    // Remover uma moeda do cofrinho
                    System.out.println("Digite o índice da moeda a ser removida:");
                    cofrinho.listagemMoedas();
                    int index = scanner.nextInt();
                    if (index >= 0 && index < cofrinho.getListaMoedas().size()) {
                        cofrinho.remover(cofrinho.getListaMoedas().get(index));
                        System.out.println("Moeda removida com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 3:
                    // Listar todas as moedas no cofrinho
                    cofrinho.listagemMoedas();
                    break;

                case 4:
                    // Calcular e mostrar o total convertido para Real
                    System.out.printf("Total convertido para Real: %.2f BRL%n", cofrinho.totalConvertido());
                    break;

                case 0:
                    // Sair do programa
                    System.out.println("Saindo...");
                    break;

                default:
                    // Opção inválida
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();  // Fechar o scanner
    }
}
