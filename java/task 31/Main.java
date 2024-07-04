/******************************************************************************

write a program to remove the first prime digit from the given number using the 
parametrized constrctor.(consider:1 is not a prime number)

*******************************************************************************/

import java.util.*;
class PrimeDigitRemover {
    private int number;

    void PrimeDigitRemover(int number) {
        this.number = number;
        removeFirstPrimeDigit();
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void removeFirstPrimeDigit() {
        String numStr = Integer.toString(number);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (isPrime(digit)) {
                numStr = numStr.substring(0, i) + numStr.substring(i + 1);
                number = Integer.parseInt(numStr);
                return;
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inputNumber = sc.nextInt();
        PrimeDigitRemover remover = new PrimeDigitRemover(inputNumber);
        System.out.println("Original number: " + inputNumber);
        System.out.println("Number after removing first prime digit: " + remover.getNumber());
    }
}
