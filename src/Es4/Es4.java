package Es4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci un numero intero per il countdown: ");
        int numero = scanner.nextInt();

        System.out.println("countdown:");

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
