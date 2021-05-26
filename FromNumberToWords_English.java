package Module1_Basics.ConvertionTYpes;

import java.util.Scanner;

public class FromNumberToWords_English {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println(FromNumberToWords(number));
    }

    public static String FromNumberToWords(long number) {
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String result = "";
        if (number / 1000000000000000L > 0) {
            result += FromNumberToWords(number / 1000000000000000L) + " Quadrillion ";
            number = number % 1000000000000000L;
        }
        if (number / 1000000000000L > 0) {
            result += FromNumberToWords(number / 1000000000000L) + " trillion  ";
            number = number % 1000000000000L;
        }
        if (number / 1000000000 > 0) {
            result += FromNumberToWords(number / 1000000000) + " billion ";
            number = number % 1000000000;
        }
        if (number / 1000000 > 0) {
            result += FromNumberToWords(number / 1000000) + " million  ";
            number = number % 1000000;
        }
        if (number / 1000 > 0) {
            result += FromNumberToWords(number / 1000) + " thousand ";
            number = number % 1000;
        }
        if (number / 100 > 0) {
            result += FromNumberToWords(number / 100) + " hundred and ";
            number = number % 100;
        }

        if (number >= 10) {
            result += tens[(int) number / 10] + " " + ones[(int) number % 10];
        } else {
            result += ones[(int) number] + " ";
        }
        return result;
    }
}
