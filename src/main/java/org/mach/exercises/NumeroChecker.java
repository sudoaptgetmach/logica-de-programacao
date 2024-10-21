package org.mach.exercises;

import java.util.Scanner;

public class NumeroChecker {

    public static void main(String[] args) {

        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor inteiro aleatório:");
        a = scanner.nextInt();

        String comparador = (a%2 == 0) ? "O número " + a + " é par." :
                            (a%2 != 0) ? "O número " + a + " é impar." : "";

        // A melhor maneira de fazer o comparador acima seria:
        // String comparador = (a % 2 == 0) ? "O número " + a + " é par." : "O número " + a + " é impar.";

        String comparadorTipo = (a > 0) ? "O número " + a + " é positivo." :
                                (a < 0) ? "O número " + a + " é negativo." : "O número é zero";

        System.out.println(comparador);
        System.out.println(comparadorTipo);

        scanner.close();

    }
}
