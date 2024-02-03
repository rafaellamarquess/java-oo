package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String[] hospedes = new String[15]; // Array para armazenar os hóspedes
        int totalCadastros = 0; // Contador de cadastros realizados

        int opcao;
        do {
            System.out.println("Digite 1- para cadastrar; 2 - para pesquisar; 3 - para sair");
            opcao = input.nextInt();
            input.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    if (totalCadastros < 15) {
                        System.out.println("Digite o nome do hóspede:");
                        String nomeHospede = input.nextLine();
                        hospedes[totalCadastros] = nomeHospede;
                        totalCadastros++;
                    } else {
                        System.out.println("Máximo de cadastros atingido.");
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome para pesquisar:");
                    String nomePesquisa = input.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < totalCadastros; i++) {
                        if (hospedes[i].equals(nomePesquisa)) {
                            System.out.println("Hóspede " + nomePesquisa + " foi encontrado no índice " + i);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Hóspede não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 3);
    }
}