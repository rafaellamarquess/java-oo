package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor padrão da diária. Digite apenas números. Exemplo: 100.");
        double valorDiaria = input.nextDouble();
        input.nextLine();

        int gratuidades = 0;
        int meiasHospedagens = 0;
        double valorTotal = 0;

        System.out.println("Digite o nome do hóspede e em seguida digite sua idade. Faça isso para cada hóspede e digite 'Pare' para finalizar): ");
        while (true) {
            String nomeHospede = input.nextLine();
            if (nomeHospede.equalsIgnoreCase("PARE")) {
                break;
            }

            int idade = input.nextInt();
            input.nextLine();

            if (idade < 4) {
                System.out.println(nomeHospede + " possui gratuidade");
                gratuidades++;
            } else {
                double valorDiariaHospede = valorDiaria;
                if (idade > 80) {
                    valorDiariaHospede /= 2;
                    System.out.println(nomeHospede + " paga meia");
                    meiasHospedagens++;
                }

                valorTotal += valorDiariaHospede;
            }
        }

        System.out.println("Total de hospedagens: R$" + valorTotal +
                "; " + gratuidades + " gratuidade(s); " + meiasHospedagens + " meia(s)");
    }
}