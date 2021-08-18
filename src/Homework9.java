import java.util.Arrays;
import java.util.Locale;

public class Homework9 {

    // Due: Aug 8th

    public static void main(String[] arges) {
     String[] nameL = {"happy", "peace", "love", "dear"};
     String[] allWords = findL(nameL);
        System.out.println(Arrays.toString(allWords));
        //
        //

        String[] wordsToSearch = {"happy holidays" , "how are you", "have a happy vacation", "happyness is the key" , "I want happiness for you"};
        String wordToFind = "happy";
        String[] words = countWords(wordsToSearch, wordToFind);
        System.out.println(Arrays.toString(words));


    }

    /**
     * Count the words which contains "happy" in the given array.
     *
     * if no word contains 'happy' --> "none"
     * if 1 word contains 'happy' --> word
     * if 2 or more words contain 'happy' --> all the words which happy
     *
     * {"happy holidays" , "how are you", "have a happy vacation", "happyness is the key" , "I want happiness for you"}
     *      {"happy holidays", "have a happy vacation", "happyness is the key"}
     *
     * {"happidays" , "how are you"}
     *      none
     *
     * {"happy holidays" , "happiness is the key" , "I want happiness for you"}
     *      happy holidays
     *
     * input: 2 ( String[] , String )
     * return type: String[] ( {"happy holidays", null, null} )
     *
     *
     */

     public static String[] countWords (String[] form, String task ) {
         String[] words = new String[form.length];
         int numWordsFound = 0;
         for (int i = 0; i<= words.length-1; i++){
             if( form[i].toLowerCase().contains(task.toLowerCase()) ) {
                 words[i] = form[i];
                 numWordsFound++;
             }

             if(numWordsFound == 0) {
                 words[0] = "none";
             }

         }

         return words;
     }



    /**
     * Find the name which has the max length.
     *
     * Note: If 2 or more names has same length (which is max) then send all such names
     *
     * {"happy, "peaceful", "loving", "dear"}
     *      peaceful
     *
     * {"happy, "peace", "love", "dear"}
     *      happy, peace
     *
     * input: 1 (String[])
     * return type: String[]
     *
     */

    public static String[] findL(String[] nameL){
        String[] maxLenWords = new String[nameL.length];
        int maxL = 0;
        for(int i=0; i<=nameL.length-1; i++){
         if(nameL[i].length() > maxL) {
             maxL=nameL[i].length();
         }
        }

        for(int i=0; i<=nameL.length-1; i++){
            if (maxL == nameL[i].length()) {
                maxLenWords[i] = nameL[i];
            }
        }

        return maxLenWords;
    }





}

