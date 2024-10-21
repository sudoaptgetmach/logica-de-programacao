package org.mach.exercises;

public class ComparadorSoma {

    public static void main(String[] args) {

        int a, b, c;

        a = (int) (Math.random() * 100);
        b = (int) (Math.random() * 100);
        c = (int) (Math.random() * 100);

        System.out.println("O número A gerado foi: " + a);
        System.out.println("O número B gerado foi: " + b);
        System.out.println("O número C gerado foi: " + c);

        String comparador = (a > b) ? "O número A é maior que B." : (b > a) ? "O número B é maior que A." : "A e B são iguais.";

        String comparadorC;
        if (c > a && c > b) {
            comparadorC = "O número C é maior que A e B.";
        } else if (c > a) {
            comparadorC = "O número C é maior que A.";
        } else if (c > b) {
            comparadorC = "O número C é maior que B.";
        } else {
            comparadorC = "A, B e C são iguais.";
        }

        System.out.println(comparador);
        System.out.println(comparadorC);

    }
}
