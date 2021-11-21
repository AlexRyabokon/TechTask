package TechTask2;
/*
Write a program that receives a word A and some texts as input.
You need to output the texts (without modifying them) in the ascending
order of the number of occurrences of the word A in the texts.
The input is as follows: an integer M (between 1 and 100, inclusive), followed
by the word A in the next line, and some text in each of the M next lines.

Note: The texts and the word A contain only lowercase Latin letters (a, b, c, …, z)
and blank spaces (“ ”). The maximum size of the texts and the word A is 100 characters.
Every text has a different number of occurrences of the word A.

Note2: You must print one text per line without modifying the texts.

 */
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string");


        String str = scan.nextLine().toLowerCase(Locale.ROOT);
        int countA=0;
        for (char element : str.toCharArray()){
            if (element == 'a') countA++;
        }



        System.out.println("Enter second string");

        String str1 = scan.nextLine().toLowerCase(Locale.ROOT);
        int countA1=0;
        for (char element : str1.toCharArray()){
            if (element == 'a') countA1++;
        }



    if(countA>countA1) {
            System.out.println(str1);
            System.out.println(str);
        } else if (countA<countA1) {
            System.out.println(str);
            System.out.println(str1);
        } else if (countA == 0) {
            System.out.println(str1);
        } else if(countA1 == 0){
            System.out.println(str);
        }

    }


}

