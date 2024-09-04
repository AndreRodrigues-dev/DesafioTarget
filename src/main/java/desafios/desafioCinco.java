package desafios;

import java.util.Scanner;

public class desafioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma palavra: ");
        String palavra = scanner.nextLine();

        char[] arrayPalavraInvertida = new char[palavra.length()];

        for(int i = 0 ;i < palavra.length(); i++) {
            arrayPalavraInvertida[i] = palavra.charAt(palavra.length() - 1 - i);
        }

        String palavraInvertida = new String(arrayPalavraInvertida);

        // Exibe a string invertida
        System.out.println(palavraInvertida);

        scanner.close();
    }
}
