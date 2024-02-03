package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean[][] quartosOcupados = new boolean[4][3]; // Array para armazenar a ocupação dos quartos

        do {
            System.out.println("Informe Andar e Quarto:");
            int andar = input.nextInt();
            int quarto = input.nextInt();
            quartosOcupados[andar - 1][quarto - 1] = true;

            System.out.println("Deseja informar outra ocupação? (S/N)");
            input.nextLine(); // Limpar o buffer
        } while (input.nextLine().equalsIgnoreCase("S"));

        System.out.println("Ocupação do hotel:");
        for (int i = 0; i < quartosOcupados.length; i++) {
            System.out.println((i + 1) + "º andar:");
            for (int j = 0; j < quartosOcupados[i].length; j++) {
                String ocupacao = quartosOcupados[i][j] ? "ocupado" : "desocupado";
                System.out.println("- quarto " + (j + 1) + " " + ocupacao);
            }
        }
    }
}