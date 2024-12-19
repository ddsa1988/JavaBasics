package S002_Operators;

public class PrimeNumbers {
    public static void main(String[] args) {
        final int minNumber = 2;
        final int maxNumber = 100;

        for (int i = minNumber; i <= maxNumber; i++) {
            int count = 0;
            for (int j = minNumber; j <= i; j++) {
                if (i % j == 0)
                    count++;
                if (count > 1)
                    break;
            }

            if (count == 1)
                System.out.print(i + " ");
        }

    }
}
