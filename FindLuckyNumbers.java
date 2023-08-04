// Given a number, n, return an array containing n unique random numbers between 1-10, inclusive. (That is, do not repeat any numbers in the returned list.)

// You can trust that this function will never be called with n < 0 or n > 10.

import java.util.ArrayList;

public class FindLuckyNumbers {
    public static void main(String[] args) {
        // sout the response now that we're returning.
        System.out.println(findLuckyNumbers(9));
    }

    static ArrayList<Integer> findLuckyNumbers(int num) {
        // Create an ArrayList that can be dynamically sized.
        // REMINDER: ArrayList needs to take wrapped primitives.
        ArrayList<Integer> luckyArr = new ArrayList<Integer>();
        
        // While the List hasn't reached num length...
        while(luckyArr.size() < num) {
            // Make a random number between 1 and 10.
            int random = (int) Math.floor(Math.random() * (10) + 1);
            System.out.println(random);
            // If the list doesn't contain the number, add it. Otherwise, continue.
            if(!luckyArr.contains(random)) {
                luckyArr.add(random);
            }
        }

        return luckyArr;
    }
}
