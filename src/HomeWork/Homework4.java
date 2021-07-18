package HomeWork;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {


        // Question - 1:
        /**
         * String threeWordSentence = "hApPy nEW yeAr"
         * // code
         * String threeWordSentence = "Happy New Year"
         */
        String threeWordSentence_1 = "hApPy nEW yeAr";
        System.out.println("Before code : " + threeWordSentence_1);     // "hApPy nEW yeAr"
        // code
        System.out.println("After code : " + threeWordSentence_1);      // "Happy New Year"


        //The answer is:
        String threeWordSentence = "hApPy nEW yeAr";
        String threeWordInLowercase = threeWordSentence.toLowerCase();
        System.out.println("3Words in lowercase are : " + threeWordInLowercase);
        String[] threeWords_2Split = threeWordInLowercase.split(" ");
        System.out.println("Sentence_2 after split : " + Arrays.toString(threeWords_2Split));

        String threeWord_0 = threeWords_2Split[0];
        String threeWord = threeWordInLowercase.substring(0,1 ).toUpperCase() +threeWord_0.substring(1) ;
        System.out.println( " Word_1 is : " + threeWord);

        String threeWord_1 = threeWords_2Split[1];
        String threeWord2 = threeWords_2Split[1].substring(0,1 ).toUpperCase() +threeWord_1.substring(1) ;
        System.out.println( " Word_2 is : " + threeWord2);

        String lastWord_3 = threeWords_2Split[2];
        String lastWord = lastWord_3.substring(0,1 ).toUpperCase() +lastWord_3.substring(1 );
        System.out.println("Last word is : " + lastWord);

        String threeWords = threeWord + " " + threeWord2 + " " +lastWord;
        System.out.println("After code Is : " + threeWords);


        // Question - 2:
        /**
         * create the abbreviation  // HNY
         */
        String threeWordSentence_2 = "very gOOD MorNING";
        String abbr = "";

        // code

        System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
        // Abbreviation for 'very gOOD MorNING' is : VGM

        // The answer is :
        String sentence_2 = threeWordSentence_2.toUpperCase();
        System.out.println("\nSentence_2 is : " + threeWordSentence_2.toUpperCase());
        String sentence_2InUpperCase = sentence_2;
        System.out.println(" Sentence_2 in Uppercase is : " + sentence_2InUpperCase);
        String[] sentence_2Split = sentence_2InUpperCase.split(" ");
        System.out.println("Sentence_2 after split : " + Arrays.toString(sentence_2Split));
        String sentence_2SplitCharAt = sentence_2Split[0].substring(0, 1);
        System.out.println("First word starts with : " + sentence_2SplitCharAt);
        String sent_2SplitCharAt = sentence_2Split[1].substring(0, 1);
        System.out.println("Second word starts with : " + sent_2SplitCharAt);
        String sen_2SplitCharAt = sentence_2Split[2].substring(0, 1);
        System.out.println("Third word starts with : " + sen_2SplitCharAt);
        abbr = sentence_2SplitCharAt + sent_2SplitCharAt + sen_2SplitCharAt;
        System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);



        // Question - 3:
        /**
         * print the number of words in the sentence.
         */
        String sentence_3 = "We all are here to learn programming and testing";


       // The answer is:
        String[] sentence_3_split_space = sentence_3.split(" ");
        System.out.println("\nSentence_3 after split : " + Arrays.toString(sentence_3_split_space));
        int sentence_3Words = sentence_3_split_space.length;
        System.out.println("Number of words in sentence_3 : " + sentence_3Words);

        // this is the lenght of String
        int sent3StringLenght = sentence_3.length();
        System.out.println("sentence3 lenght " + sent3StringLenght);

        // another way to answer:
        System.out.println("Number_2 of words in sentence_3 : " + sentence_3.split(" ").length);
        
    }
}
