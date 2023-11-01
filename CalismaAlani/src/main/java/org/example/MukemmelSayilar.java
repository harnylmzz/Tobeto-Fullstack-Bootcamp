package org.example;

public class MukemmelSayilar {
    public static void main(String[] args) {
        findPerfectNumbers(10);
    }

    public static void findPerfectNumbers(int count) {
        int number = 2;
        int found = 0;

        while (found < count) {
            if (isPerfectNumber(number)) {
                System.out.println(number);
                found++;
            }
            number++;
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sumOfDivisors = 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == (num / i)) {
                    sumOfDivisors += i;
                } else {
                    sumOfDivisors += (i + num / i);
                }
            }
        }

        return sumOfDivisors == num;
    }
}
