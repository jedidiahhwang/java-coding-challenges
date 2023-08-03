// Given an array of numbers, write some code to loop through the array, and print out the smallest and largest numbers in the array.

// For example, if given the array [1, 4, 11, 2, 37, -4], your code should print out -4, 37.

public class FindTheRange {
    public static void main(String[] args) {
        int[] numArr = {11, 2, 32, 4, 5};
        findRange(numArr);
    }

    public static void findRange(int[] numbers) {
        int smallest = numbers[0];
        int largest = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            } else if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest); 
    }
}
