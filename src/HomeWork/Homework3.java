package HomeWork;

public class Homework3 {

    public static void main(String[] args) {



        // Question - 1
        String sentence_1 = "hello dear, how are you?";
        int result_1 = 0;
        /**
         * Assign result_1 as 100 if the length of sentence_1 is 10 or greater
         * else assign result_1 as 15
         *
         * use: Ternary operator
         *
         */

       int  sentence_1length = sentence_1.length();
        System.out.println( sentence_1length + " sentence_1length()");

        result_1 = sentence_1length >= 10 ? 100 : 15;
        System.out.println("result_1 = " + result_1);






        // Question - 2
        String sentence_2 = "We all ARe GOod ProgrAMmer";
        /**
         * replace all 'R/r' with 'F'
         */


        String sent_2 = sentence_2.replace("r", "R");
        System.out.println( " sent_2 " + sent_2);
        String sent_2F = sent_2.replace( "R","F");
        System.out.println( " sent_2F " + sent_2F);

        System.out.println(sentence_2);     // "We all AFe GOod PFogFAMmeF";




        // Question - 3
        String sentence_3 = "ABC Networks";
        String result_3 = "";
        /**
         * 1. Display/Print length of your sentence_3
         * 2. does sentence_3 starts with "a" (ignore cases)
         * 3. does sentence_3 ends with "K" (ignore cases)
         * 4. Assign result_3 as "Media" if sentence_3 starts with 'a' (ignore cases)
         *      else assign "Entertainment"
         *      Print the result_3 in console.
         */

        int sentence_3Length = sentence_3.length();
        System.out.println( "\n sentence_3Length() = " +  sentence_3Length);


        String sentence_3InLowercases = sentence_3.toLowerCase();
        System.out.println("\n sentence_3.toLowerCase() " + sentence_3InLowercases);
        char sentence_3CharAt = sentence_3InLowercases.charAt(0);
        System.out.println("In " + sentence_3 + "char at index-0 : " + sentence_3CharAt);
        boolean doesSentence_3StartsWitha = 'a' == sentence_3CharAt;
        System.out.println(" does sentence_3 starts with a ? : " + doesSentence_3StartsWitha );


        String sentence_3InUppercases = sentence_3.toUpperCase();
        System.out.println("\n sentence_3.toUpperCase() " + sentence_3InUppercases);
        int sent_3Index = sentence_3.length() - 1;
        System.out.println("sent_3Index : " + sent_3Index);
        char sentence_3CharAtK = sentence_3InUppercases.charAt(sent_3Index);
        System.out.println("In " + sentence_3 + "char at index : " + sentence_3CharAtK);
        boolean doesSentence_3EndsWithK = 'K' == sentence_3CharAt;
        System.out.println(" does sentence_3 ends with K ? : " + doesSentence_3EndsWithK );



     String sent_3InLowercases = sentence_3.toLowerCase();
     System.out.println("\n sent_3.toLowerCase() " + sentence_3InLowercases);
     char sent_3CharAt = sentence_3InLowercases.charAt(0);
     System.out.println("In " + sentence_3 + "char at index-0 : " + sent_3CharAt);
     result_3 = sent_3CharAt == 'a' ? "Media" : "Entertainment";
     System.out.println("result_3 = " + result_3);

    }

}
