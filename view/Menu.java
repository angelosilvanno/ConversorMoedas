package view;

import service.ServicoCambio;
import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException; 

public class Menu {

    private Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private ServicoCambio servicoCambio = new ServicoCambio();

    public void iniciar() {
        int opcao = 0;

        while (opcao != 7) {
            exibirMenu();
            
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1 -> converter("BRL", "USD");
                    case 2 -> converter("USD", "BRL");
                    case 3 -> converter("BRL", "EUR");
                    case 4 -> converter("EUR", "BRL");
                    case 5 -> converter("USD", "EUR");
                    case 6 -> converter("EUR", "USD");
                    case 7 -> System.out.println("Encerrando o programa...");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }

                if (opcao != 7) {
                    System.out.println("\nPressione ENTER para continuar...");
                    scanner.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite apenas números.");
                scanner.nextLine(); 
                opcao = 0; 
            }
        }
    }

    private void exibirMenu() {
        System.out.println("\n=================================");
        System.out.println("        CONVERSOR DE MOEDAS       ");
        System.out.println("=================================");
        System.out.println("1 - Real para Dólar");
        System.out.println("2 - Dólar para Real");
        System.out.println("3 - Real para Euro");
        System.out.println("4 - Euro para Real");
        System.out.println("5 - Dólar para Euro");
        System.out.println("6 - Euro para Dólar");
        System.out.println("7 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void converter(String de, String para) {
        try {
            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            double resultado = servicoCambio.converter(de, para, valor);

            System.out.println("\nResultado da conversão:");
            // Usei o printf para mostrar apenas 2 casas decimais no valor final
            System.out.printf("%.2f %s = %.2f %s%n", valor, de, resultado, para);
            
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor numérico inválido.");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Erro na conversão: " + e.getMessage());
        }
    }
}