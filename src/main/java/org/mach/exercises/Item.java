package org.mach.exercises;

import java.util.Scanner;

public class Item {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int item, quantidade;
        double valor, valorFinal;

        System.out.println();
        System.out.println("CÓDIGO       ITEM              PREÇO");
        System.out.println("1      CACHORRO-QUENTE        R$ 4,00");
        System.out.println("2      X-SALADA               R$ 4,50");
        System.out.println("3      X-BACON                R$ 5,00");
        System.out.println("4      TORRADA SIMPLES        R$ 2,00");
        System.out.println("5      REFRIGERANTE           R$ 1,50");
        System.out.println();

        System.out.println("Informe o item e a quantidade.");
        item = scanner.nextInt();
        quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("Você precisa selecionar uma quantidade maior do que um item.");
            scanner.close();
            return;
        }

        switch (item) {
            case 1:
                valor = 4;
                valorFinal = valor * quantidade;
                break;
            case 2:
                valor = 4.50;
                valorFinal = valor * quantidade;
                break;
            case 3:
                valor = 5;
                valorFinal = valor * quantidade;
                break;
            case 4:
                valor = 2;
                valorFinal = valor * quantidade;
                break;
            case 5:
                valor = 1.50;
                valorFinal = valor * quantidade;
                break;
            default:
                System.out.println("Escolha um dos itens listados.");
                scanner.close();
                return;
        }

        System.out.printf("Total: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}