package HomeWork;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class Homework7 {
    public static void main(String[] args) {

        // Due date: July 28

        /**
         * Task 1:
         * Find out if the value stored in word variable is palindrome.
         * And, store the result in "isPalindrome" variable
         * --> palindrome: string which reads the same in reverse
         * eg:
         * level --> level          (palindrome)
         * eye  --> eye             (palindrome)
         * head --> daeh            (not palindrome)
         * racecar --> racecar      (palindrome)
         */
        String task1Word = "fish";
        int task1L = task1Word.length();
        System.out.println("Polindrome length is : " + task1L);
        String reverseWord = "";
        for (int i = 1; i <= task1L ; i++ ){
            reverseWord = reverseWord + task1Word.charAt(task1L-i);
        }
        boolean isPalidrome = false;
        if (task1Word.toLowerCase().equals(reverseWord.toLowerCase())) {
            System.out.println("is Palindrome :" + task1Word );
            isPalidrome = true;
        }
        else {
            System.out.println("is not Palindrome :" + task1Word);
        }




        /**
         * Task2:
         * Find if the value stored in num variable is a prime number or not.
         * And, store the final result in "isPrime" variable
         * --> prime number -> number which is ONLY divisible by 1 and itself.
         * eg:
         * 5 -> prime
         * 7 -> prime
         * 10 -> not a prime
         */
        System.out.println("\n");
        int num = 8;
        boolean isPrime = true;
        for ( int i = 2; i < num; i++ ) {
            if (num%i ==0) {
               isPrime = false; // System.out.println("Is it prime number ? : " + false);
            }

        }
        System.out.println("Is it prime number ? : " + isPrime);


        /**
         * Task3:
         * Write code to reverse a string
         *
         * "happy holidays"
         *
         * "syadiloh yppah"
         *
         */

        String originalString = "happy holidays";
        String task3String = "";
        String[] taskSplit = originalString.split("");
        System.out.println("\nAfter split : " + Arrays.toString(taskSplit));
        int taskL = taskSplit.length;
        System.out.println("Task lenght :" + taskL);
        String reverseSentence = "";
        for (int i = 1 ; i<= taskL ; i++ ) {
            System.out.println("After reverse : " + taskSplit[taskL - i]);
             reverseSentence = reverseSentence  + taskSplit[taskL - i];
        }
        System.out.println("Sentence reversed is : " + reverseSentence.trim());




        /**
         * Task4:
         * Count the number of the vowels (a,e,i,o,u) present in the given sentence.
         */
        String task4Sentence = "hOW arE You My DEAr FRiEnd";    // 9

        String taskToLower = task4Sentence.toLowerCase();
        System.out.println("\nTask in lowercase :" + taskToLower);
        int task4L = taskToLower.length();
        System.out.println("Task length = " + task4L);
        int vowelCount = 0;
       for (int i = 0; i<= task4L-1 ; i++){
            char count = taskToLower.charAt(i);
             if ( (count == 'a') || (count == 'e') || (count == 'i') || (count == 'o') || (count == 'u'))
                 vowelCount++;{

             }
        }
        System.out.println(" Number of vowels are : " + vowelCount);

    }
}

