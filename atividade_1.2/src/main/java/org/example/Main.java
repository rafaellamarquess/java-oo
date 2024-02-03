package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro cliente: ");
        String nomeClienteA = input.nextLine();
        System.out.println("Digite a idade do primeiro cliente: ");
        int idadeClienteA = input.nextInt();

        input.nextLine(); // Limpar o buffer

        System.out.println("Digite o nome do segundo cliente: ");
        String nomeClienteB = input.nextLine();
        System.out.println("Digite a idade do segundo cliente: ");
        int idadeClienteB = input.nextInt();

        boolean idosoA = idadeClienteA >= 60;
        boolean idosoB = idadeClienteB >= 60;

        if (idadeClienteB < idadeClienteA) {
            System.out.println("Quarto A: " + nomeClienteA + (idosoA ? " com desconto de 40%" : "") + "; Quarto B: " + nomeClienteB);
        } else if (idadeClienteB > idadeClienteA) {
            System.out.println("Quarto A: " + nomeClienteB + (idosoB ? " com desconto de 40%" : "") + "; Quarto B: " + nomeClienteA);
        } else {
            System.out.println("Quartos mantidos como estão.");
        }
    }
}