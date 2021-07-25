package HomeWork;

import java.util.Arrays;
import java.util.Locale;

public class Homework6 {
    public static void main(String[] arges) {

        /**
         * String sentence = "happy new year TO You DeaR"
         * // code
         * String sentence = "Happy New Year To You Dear"
         *
         * For hint refer: Loops_Concept , Line#34
         */

        String sentenceBefore = "happy new year TO You DeaR";
        String sentenceAfter = "";
        String sentenceToLower= sentenceBefore.toLowerCase();
        System.out.println("Sentence_1 : " + sentenceToLower);
        String[] sentenceSplit = sentenceToLower.split(" ");
        System.out.println(" Sentence after split : " + Arrays.toString(sentenceSplit));
        int sentenceLength = sentenceSplit.length;
        System.out.println("Sentence length : " + sentenceLength);
        for (int i = 0 ; i <= sentenceLength-1 ; i++ ) {
           // System.out.println(sentenceSplit[i]);
            sentenceAfter = sentenceAfter + " " + sentenceSplit[i].substring(0,1).toUpperCase() + sentenceSplit[i].substring(1);
            //System.out.println(sentenceAfter);
        }

        System.out.println(sentenceAfter.trim());



        /**
         * create the abbreviation  // HNY
         */
        //String threeWordSentence_2 = "very gOOD MorNING to You dear";
       // String abbr = "";

        // code

        //System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
        // Abbreviation for 'very gOOD MorNING to You dear' is : VGMTYD

        String form_1 = "very gOOD MorNING to You dear";
        String abbr = "";
        String[] formTo = form_1.toUpperCase().split(" ");
        System.out.println("\nSentence is : " + Arrays.toString(formTo));
        int formLength = formTo.length;
        System.out.println("Sentence length is : " + formLength);
        for (int j = 0 ; j <= sentenceLength-1 ; j++ ){
            abbr = abbr + formTo[j].substring(0,1);
        }
        System.out.println(abbr);




        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         *
         * student got grade A, gets full scholarship for next year
         *
         * student got better than grade D (i.e. B or C), get half scholarship for next year
         *
         * otherwise no scholarship for next year
         *
         *
         * Sample output:
         *  Your percentage: XX.yy and your Grade is: Z
         *  Based on your grade(Z), you get XXXX scholarship for next year
         *
         */

        int studentScore = 80;
        int maxScore = 150;
        String grade = "";
        double percentage = (100 * studentScore) / maxScore;
        System.out.println("\npercentage = " + percentage );
        if (percentage >= 91.0 && percentage <= 100.0){
            grade = "A";
        } else if (percentage >= 81.0){
            grade = "B";
        } else if (percentage >= 71.0){
            grade = "C";
        } else if (percentage >= 61.0){
            grade = "D";
        } else if (percentage >= 51.0){
            grade = "E";
        } else
            grade = "F";

         switch (grade){
             case "A":
                 System.out.println("Based on your grade(" + grade + "), you get full scholarship for next year");
                 break;
             case "B":
             case "C":
                 System.out.println("Based on your grade(" + grade + "), you get half scholarship for next year");
                 break;
              case "D":
              case "E":
              case "F":
                 System.out.println("Based on your grade(" + grade + "), you get no scholarship for next year");
                 break;
             default:
                 System.out.println("grade");


         }
        System.out.println("Your percentage = " + percentage + " and your grade is = " + grade);




        /**
         * Create an array and store 5 int-values.
         * Print the average of numbers in array.
         *
         * sum of values / number of values
         *
         * {10, 20, 30, 40, 50}
         * (10+20+30+40+50)/5
         *
         */

        int value[] = {10,20,30,40,50};
        int valueL = value.length;
        System.out.println("\nValue length is : " + valueL);
        int sum = 0;
        for (int s = 0; s <= valueL-1 ; s++ ){
            sum = sum + value[s];
        }

        System.out.println("sum is : " + sum);
        int averge = sum / valueL;
        System.out.println(" Average is : " + averge);


        /**
         *
         * String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"}
         * String nameToSearch = "faith";
         *
         * if name found, Print "LUI is at position-5 in the array"
         * if name not found, print "king is not present in the array"
         *
         */
        String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"};
        String nameToSearch = "harry";
        int position = 0;
        for(int i = 0; i<=names.length-1; i++) {
            if (nameToSearch.equalsIgnoreCase(names[i])) {
                position = i + 1;
            }

        }
        if(position > 0){
            System.out.println(nameToSearch + " is at position-" + position + " in the array");
        } else{
            System.out.println(nameToSearch + " is not present in the array");
        }

        /**
         *
         * String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
         * print the names from array if the name-length is >=5 and name contains 'o' or 'O'
         *
         */


        String[] names_2 = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
        int nameL = names_2.length;
        for(int i=0; i <= nameL-1; i++){
            if(names_2[i].length() >= 5 && names_2[i].toLowerCase().contains("o")){
                System.out.println(names_2[i]);
            }
        }





        /**
         * int[] numbers = {11, 22, 33, 44, 55, 98, 65};
         * String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
         *
         * Limitation: both array must be of same length
         *
         * if the numbers-array has 33 in it,
         *      print the index at which 33 is present in numbers array
         *      And, print the name present at same index in names array.
         *
         */


        int[] numbers = {11, 22, 33, 44, 55, 98, 65};
        String[] names_3 = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
        for(int i=0; i <= numbers.length-1; i++){
            if(numbers[i] == 33){
                System.out.println("The index is " + i + " and the name is " + names_3[i]);
            }
        }



























    }

}
