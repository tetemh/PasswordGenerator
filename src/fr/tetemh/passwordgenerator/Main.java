package fr.tetemh.passwordgenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> a = new ArrayList<String>();
    private static ArrayList<String> b = new ArrayList<String>();
    private static ArrayList<String> c = new ArrayList<String>();

    public static void alphabet(int nb){
        String[] allAlphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n","o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for( int i = 0; i < nb ; i++){
            String letter = allAlphabets[(int) (Math.random() * 26)];
            a.add(letter);
        }
    }

    public static void numbers(int nb){
        String[] allNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for( int i = 0; i < nb; i++) {
            String number = allNumbers[(int) (Math.random() * 10)];
            b.add(number);
        }
    }

    public static void chars(int nb){
        String[] allChars = {"*", "/", "#", "~", "&", "{", "'", "\"", "(", "[", "-", "|", "`", "_", "\\", "^", "@", ")", "°", "]", "+", "=", "}", "¨", "£", "$", "¤", "µ", "*", "%", "?", ",", ".", ".", ":", "/", "!", "§"};
        for( int i = 0; i < nb; i++) {
            String cha = allChars[(int) (Math.random() * 38)];
            c.add(cha);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Methode.pseudo();


        Scanner scanner = new Scanner(System.in);
            //lettre y / n
            System.out.print("Do you want letters in it ( y / n ) : ");
            String letters = scanner.next();

            if (letters.equalsIgnoreCase("y") || letters.equalsIgnoreCase("yes")) {
                System.out.print("Enter the number of letters you want in your password : ");
                int nbChar = scanner.nextInt();
                alphabet(nbChar);
                System.out.println(a.toString() + "\n");
            }


            //chiffre y / n
            System.out.print("Do you want numbers in it ( y / n ) : ");
            String questionNumbers = scanner.next();

            if(questionNumbers.equalsIgnoreCase("y") || questionNumbers.equalsIgnoreCase("yes")) {
                System.out.print("Enter the number of numbers you want in your password : ");
                int nbNumber = scanner.nextInt();
                numbers(nbNumber);
                System.out.println(b.toString() + "\n");
            }

            //char spaces
            System.out.print("Do you want special features in it ( y / n ) : ");
            String charSpaces = scanner.next();

            if(charSpaces.equalsIgnoreCase("y") || charSpaces.equalsIgnoreCase("yes")) {
                System.out.print("Enter the number of special characters you want in your password : ");
                int nbChar = scanner.nextInt();
                chars(nbChar);
                System.out.println(c.toString() + "\n");
                //finish
            }


    }
}