package fr.tetemh.passwordgenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> a = new ArrayList<String>();
    private static ArrayList<String> b = new ArrayList<String>();
    private static ArrayList<String> c = new ArrayList<String>();

    private static String[] allAlphabets;
    private static String[] allNumbers;
    private static String[] allChars;

    private static int nbLettre;
    private static int nbNumber;
    private static int nbChar;

    public static void alphabet(int nb) {
        String[] allAlphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < nb; i++) {
            String letter = allAlphabets[(int) (Math.random() * 26)];
            a.add(letter);
        }
    }

    public static void numbers(int nb) {
        String[] allNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (int i = 0; i < nb; i++) {
            String number = allNumbers[(int) (Math.random() * 10)];
            b.add(number);
        }
    }

    public static void chars(int nb) {
        String[] allChars = {"*", "/", "#", "~", "&", "{", "'", "\"", "(", "[", "-", "|", "`", "_", "\\", "^", "@", ")", "°", "]", "+", "=", "}", "¨", "£", "$", "¤", "µ", "*", "%", "?", ",", ".", ".", ":", "/", "!", "§"};
        for (int i = 0; i < nb; i++) {
            String cha = allChars[(int) (Math.random() * 38)];
            c.add(cha);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Methode.pseudo();


        try (Scanner scanner = new Scanner(System.in);) {
            //lettre y / n
            System.out.print("Do you want letters in it ( y / n ) : ");
            String questionLetters = scanner.next();

            if (questionLetters.equalsIgnoreCase("y") || questionLetters.equalsIgnoreCase("yes")) {
                System.out.print("Enter the number of letters you want in your password : ");
                nbLettre = scanner.nextInt();
                alphabet(nbLettre);
                System.out.println(a.toString() + "\n");
            }


            //chiffre y / n
            System.out.print("Do you want numbers in it ( y / n ) : ");
            String questionNumbers = scanner.next();

            if (questionNumbers.equalsIgnoreCase("y") || questionNumbers.equalsIgnoreCase("yes")) {
                System.out.print("Enter the number of numbers you want in your password : ");
                nbNumber = scanner.nextInt();
                numbers(nbNumber);
                System.out.println(b.toString() + "\n");
            }

            //char spaces
            System.out.print("Do you want special features in it ( y / n ) : ");
            String questionCharSpaces = scanner.next();

            if (questionCharSpaces.equalsIgnoreCase("y") || questionCharSpaces.equalsIgnoreCase("yes")) {
                System.out.print("Enter the number of special characters you want in your password : ");
                nbChar = scanner.nextInt();
                chars(nbChar);
                System.out.println(c.toString() + "\n");
            }

            //TODO sout mdp
            StringBuilder mdp = new StringBuilder();
            while (true) {
                int random = (int) (Math.random() * 3);

                int tablettre = a.size();
                int randomTabLettre = (int) (Math.random() * tablettre);

                int tableNumber = b.size();
                int randomTableNumber = (int) (Math.random() * tableNumber);

                int tableChar = c.size();
                int randomTableChar = (int) (Math.random() * tableChar);

                if(random == 0 && questionLetters.equalsIgnoreCase("y")){
                    mdp.append(a.get(randomTabLettre));
                    a.remove(randomTabLettre);
                }

                if(random == 1 && questionNumbers.equalsIgnoreCase("y")) {
                    mdp.append(b.get(randomTableNumber));
                    b.remove(randomTableNumber);
                }

                if(random == 2 && questionCharSpaces.equalsIgnoreCase("y")) {
                    mdp.append(c.get(randomTableChar));
                    c.remove(randomTableChar);
                }
                System.out.println(mdp);
            }


        }
    }
}