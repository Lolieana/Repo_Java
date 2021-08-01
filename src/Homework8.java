import java.util.Arrays;

public class Homework8 {

    public static void main(String[] arges) {

        String sentenceAfter = Titlecase();
        System.out.println(sentenceAfter.trim());
        //
        reverse();
        //
        String task1Word = "eye";
        boolean isPalidrome = polindrome(task1Word );
        System.out.println(task1Word + " is Palindrome = " + isPalidrome);
        //
        int average = average();
        System.out.println(" Average is : " + average);
        //
        int maxV = maxvalue();
        System.out.println("Maximum value = " + maxV );
        
    }

    /**
     * Write a method to convert given string into Titlecase
     *
     * Input sentence = "happy new year TO You DeaR"
     * Final answer = "Happy New Year To You Dear"
     */
    public static String Titlecase () {
        String sentenceBefore = "happy new year TO You DeaR";
        String sentenceAfter = "";
        String sentenceToLower= sentenceBefore.toLowerCase();
        System.out.println("Sentence_1 : " + sentenceToLower);
        String[] sentenceSplit = sentenceToLower.split(" ");
        System.out.println(" Sentence after split : " + Arrays.toString(sentenceSplit));
        int sentenceLength = sentenceSplit.length;
        System.out.println("Sentence length : " + sentenceLength);
        for (int i = 0 ; i <= sentenceLength-1 ; i++ ) {
            sentenceAfter = sentenceAfter + " " + sentenceSplit[i].substring(0,1).toUpperCase() + sentenceSplit[i].substring(1);
        }

      return sentenceAfter;
    }


    /**
     * Write a method to reverse a String
     */
    public static void reverse () {

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

    }

    /**
     * Write a method which will return the result, if the given string is a Palindrome
     *
     * return type: boolean
     */
    public static boolean polindrome (String task1Word) {

        int task1L = task1Word.length();
        System.out.println("Polindrome length is : " + task1L);
        String reverseWord = "";
        for (int i = 1; i <= task1L ; i++ ){
            reverseWord = reverseWord + task1Word.charAt(task1L-i);
        }
        boolean isPalidrome = false;
        if (task1Word.toLowerCase().equals(reverseWord.toLowerCase())) {
            //System.out.println("is Palindrome :" + task1Word );
            isPalidrome = true;
        }
        else {
            //System.out.println("is not Palindrome :" + task1Word);
        }
        return isPalidrome ;
    }


    /**
     * Write a method to return the average of a given int array
     *
     * Input array : {7, 10, 3, 6, 10}
     * ans : 7.2
     *
     */
    public static int average () {

        int value[] = {7,10,3,6,10};
        int valueL = value.length;
        System.out.println("\nValue length is : " + valueL);
        int sum = 0;
        for (int s = 0; s <= valueL-1 ; s++ ){
            sum = sum + value[s];
        }

        System.out.println("sum is : " + sum);
        int averge = sum / valueL;
     return averge;
    }

    /**
     * Write a method to return the maximum value from a given int array
     *
     * Input array: {33, 54, 67, 19, 9, 52}
     * max : 67
     */
    public static int maxvalue () {
        int [] num = {33,54,67,19,9,52};
        int maxV = 0;
        for (int i = 0; i <= num.length-1; i++) {
            if (num[i] > maxV ) {
                maxV = num [i];
            }
        }
     return maxV;
    }



}

