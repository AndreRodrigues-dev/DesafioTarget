package desafios;

import java.util.Scanner;

public class desafioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int proximo = a + b;
        boolean pertence = false;

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();

        while (proximo <= numero) {
            if (proximo == numero) {
                pertence = true;
                break;
            }

            a = b;
            b = proximo;
            proximo = a + b;
        }

        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
