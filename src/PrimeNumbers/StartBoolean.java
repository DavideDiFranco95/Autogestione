package PrimeNumbers;

import java.util.Scanner;

public class StartBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire numero positivo: ");
        int n = scanner.nextInt();
        System.out.println("i numeri primi sono : " + n);
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}