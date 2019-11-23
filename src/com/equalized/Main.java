package com.equalized;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1+2 = 3
        result += result;
        System.out.println(result);
        result = result -1;
        System.out.println(result);
        result = result * 10;
        System.out.println(result);
        int previousResult = result;
        System.out.println(previousResult);
        result = result % 4;
        System.out.println(result);

        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result *= 10;
        System.out.println(result);
        result -= 5;
        System.out.println(result);

        result /= 5;
        System.out.println(result);

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("This is not an alien");
        }else {
            System.out.println("This is an alien");
        }

        int newValue = 50;


        /// Operator Challenge
        // score = 100
        // score > 99
        // you got the highscore
        // score = 0

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;

        double totalDouble = (firstDouble + secondDouble) * 100.00d;
        System.out.println("totalDouble = " + totalDouble);
        double remainderDouble = totalDouble % 40.00;
        System.out.println("remainderDouble = " + remainderDouble);
        boolean checkForZero = remainderDouble  == 0 ? true : false;
        System.out.println(checkForZero);
        if (!checkForZero) {
            System.out.println("Got some remainder");

        }


    }
}
