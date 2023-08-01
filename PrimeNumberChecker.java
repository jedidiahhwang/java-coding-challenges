// A prime number is a whole number greater than 1 whose only factors are 1 and itself. The only even prime number is 2.

// The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.

public class PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }

    private static boolean isPrime(long num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}