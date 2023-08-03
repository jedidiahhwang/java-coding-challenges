// Given an array of numbers, console.log true if any two numbers in the array add to zero, otherwise log false.

// For example:

// [1, 4, 11, 2, 37, -4] should log true because 4 and -4 add to 0.

// [0, 21, 33, 6, 0, -9] should log true because 0 and 0 add to 0.

// [0, 1, 2, 3, 4, 5] should log false because no two numbers add to 0.

public class AddToZero {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 0, 1};
        addToZero(arr);
    }

    static void addToZero(int[] numArr) {
        boolean checker = false;

        for(int i = 0; i < numArr.length; i++) {
            for(int j = 1; j < numArr.length; j++) {
                if(numArr[i] + numArr[j] == 0) {
                    checker = true;
                }
            }
        }
        System.out.println(checker);
    }
}
