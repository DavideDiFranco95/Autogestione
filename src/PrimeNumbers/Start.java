package PrimeNumbers;

import java.util.Scanner;

import static PrimeNumbers.PrimeNumbers.primeNumbers;

public class Start {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire un numero: ");
        int N = scanner.nextInt();

        primeNumbers(N);
    }
}
