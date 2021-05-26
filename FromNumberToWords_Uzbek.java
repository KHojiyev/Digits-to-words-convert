package Module1_Basics.ConvertionTYpes;

import java.util.Scanner;

public class FromNumberToWords_Uzbek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println(FromNumberToWords(number));
    }

    public static String FromNumberToWords(long number) {
        String[] tens = {"", "o'n", "yigirma", "o'ttiz", "qirq", "ellik", "oltmish", "yetmish", "sakson", "to'qson"};
        String[] ones = {"", "bir", "ikki", "uch", "tort", "besh", "olti", "yetti", "sakkiz", "to'qqiz"};
        String result = "";
        if (number / 1000000000000000L > 0) {
            result += FromNumberToWords(number / 1000000000000000L) + " triliard ";
            number = number % 1000000000000000L;
        }
        if (number / 1000000000000L > 0) {
            result += FromNumberToWords(number / 1000000000000L) + " trilion ";
            number = number % 1000000000000L;
        }
        if (number / 1000000000 > 0) {
            result += FromNumberToWords(number / 1000000000) + " milliard ";
            number = number % 1000000000;
        }
        if (number / 1000000 > 0) {
            result += FromNumberToWords(number / 1000000) + " million ";
            number = number % 1000000;
        }
        if (number / 1000 > 0) {
            result += FromNumberToWords(number / 1000) + " ming ";
            number = number % 1000;
        }
        if (number / 100 > 0) {
            result += FromNumberToWords(number / 100) + " yuz ";
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
