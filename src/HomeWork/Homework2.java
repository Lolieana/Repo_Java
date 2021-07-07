package HomeWork;

public class Homework2 {

    public static void main(String[] args) {

        /**
         *
         * Due: July 8
         *
         * Convert deg-Cel into Fahrenheit
         *
         * fT = cT × 9/5 + 32
         */

        double cTemp = 21.11;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println(cTemp + "°C = " + fTemp + "°F");

        /**
         * Refer -> https://www.rapidtables.com/convert/temperature/how-celsius-to-fahrenheit.html
         *
         *
         * C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         * K -> C
         * K -> F
         *
         */

       // c -> k:  T(K) = T(°C) + 273.15
        double cT = 10;
        double kT = cT + 273.15;
        System.out.println(cT + "°C = " + kT + " K ");


        // C -> F: T(°F) = T(°C) × 9/5 + 32
        double cTemperature = 32.15;
        double fTemperature = cTemperature * 9/5 + 32;
        System.out.println(cTemperature + "°C = " + fTemperature + "°F");



        // F -> C: T(°C) = (T(°F) - 32) / 1.8
        double fahrTempra = 70;
        double celsTempra = (fahrTempra - 32) / 1.8;
        System.out.println("F to C is: " + fahrTempra + "°F = " + celsTempra + "°C ");


       //  F -> k : T(K) = (T(°F) + 459.67) × 5/9
          fahrTempra = 67.31;
          kT = (fahrTempra + 459.67) * 5/9;
        System.out.println(fahrTempra + "°F = " + kT + " K ");


        // K -> C: T(°C) = T(K) - 273.15
        kT = 140;
        cT = kT - 273.15;
        System.out.println(kT + " K =" + cT + " C ");


        // K -> F: T(°F) = T(K) × 9/5 - 459.67
        kT = 200;
        fTemperature = kT * 9/5 - 459.67;
        System.out.println(kT + " K = " + fTemperature + " F ");








        // Second try to do this homework using different variable:


        // c -> k:  T(K) = T(°C) + 273.15
        float celT = 10f;
        float kelT = celT + 273.15f;
        System.out.println(celT + "°C = " + kelT + " K ");



        // C -> F: T(°F) = T(°C) × 9/5 + 32
        float celTemperature = 32.15f;
        float fahTemperature = celTemperature * 9/5 + 32f;
        System.out.println(celTemperature + "°C = " + fahTemperature + "°F");


        // F -> C: T(°C) = (T(°F) - 32) / 1.8
        float fahTemp = 70f;
        float celTemp = (fahTemp - 32) / 1.8f;
        System.out.println("F to C is: " + fahTemp + "°F = " + celTemp + "°C ");


        //  F -> k : T(K) = (T(°F) + 459.67) × 5/9
        float fTempFloat = 67.31f;
        float kTeFloat = (float) ((fTempFloat + 459.67) * 5 / 9);
        System.out.println(fTempFloat + "°F = " + kTeFloat + " K ");



        // K -> C: T(°C) = T(K) - 273.15
       float keTFl = 140f;
        float ceTFl = keTFl - 273.15f;
        System.out.println(keTFl + " K = " + ceTFl + " C ");



        // K -> F: T(°F) = T(K) × 9/5 - 459.67
       float keTeF = 200f;
        float fTemperatureF = keTeF * 9/5 - 459.67f;
        System.out.println(keTeF + " K = " + fTemperatureF + " F ");


    }

}

