package PrimeNumbers;

public class PrimeNumbers {

    static void primeNumbers(int n) {
        int x;
        int y;
        int flag;
        System.out.println(
                "All the Prime numbers within 1 and " + n + " are:");
        for (x = 1; x <= n; x++) {

            if (x == 1 || x == 0)
                continue;
            //Variabile Flag = la var che definiamo avrà un valore finchè la condizione sarà true,
            // in questo caso la variabile cambierà
            flag = 1;

            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print(x + " ");
        }
    }

}
