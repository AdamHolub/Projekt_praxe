package com.company;

import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println(" \033[0;31m \033[4;31m Welcome to the multifunctional program where you can find: \033[4;31m \033[0m");
        System.out.println("");

        for (int i = 0; i > -1; i++) {

            System.out.println("1 - \033[0;33m Calculator \033[0m");
            System.out.println("2 - \033[0;34m Random number generator \033[0m");
            System.out.println("3 - \033[0;32m Counting vowels and consonants \033[0m");
            System.out.println("4 - \033[0;36m Find out the leap year \033[0m");
            System.out.println("5 - \033[0;35m BMI calculator \033[0m");
            System.out.println("");
            System.out.println("0 - \033[0;31m Exit \033[0m");
            System.out.println("");
            System.out.println(" Use the numbers to select the program you want to run: ");
            System.out.println("");

            int choicefirst = sc.nextInt();

            if(choicefirst == 1) {

                System.out.println("\033[0;31m Welcome in calculator \033[0m");
                System.out.println(" Select your option:");
                System.out.println("");
                System.out.println("\033[0;34m 1 - Normal calculator (+, -, *, /) \033[0m");
                System.out.println("\033[0;32m 2 - Scientific calculator(sin, cos, tg, cotg, log) \033[0m");
                System.out.println("\033[0;36m 3 - Conversion degree to radians \033[0m");
                System.out.println("");

                int option = sc.nextInt();
                System.out.println("");

                switch (option) {

                    //            *********************
                    //           Normal calculator
                    //            *********************

                    case 1 -> {
                        System.out.println("\033[0;31m You choice Normal calculator \033[0m");
                        System.out.println("");
                        System.out.println(" Choose an operation: ");
                        System.out.println(" 1 -> +");
                        System.out.println(" 2 -> -");
                        System.out.println(" 3 -> *");
                        System.out.println(" 4 -> /");

                        int choice = sc.nextInt();

                        System.out.println("Enter two numbers");

                        int x = sc.nextInt();
                        int y = sc.nextInt();

                        if(choice == 1){
                            System.out.println("Answer is: " + "\033[0;31m" + plus(x,y) + "\033[0m");
                            System.out.println("");
                        }
                        else if(choice == 2){
                            System.out.println("Answer is: " + "\033[0;31m" + minus(x,y) + "\033[0m");
                            System.out.println("");
                        }
                        else if(choice == 3){
                            System.out.println("Answer is: " + "\033[0;31m" + krat(x,y) + "\033[0m");
                            System.out.println("");
                        }
                        else if(choice == 4){
                            System.out.println("Answer is: " + "\033[0;31m" + delen(x,y) + "\033[0m");
                            System.out.println("");
                        }
                        else {
                            System.out.println("\033[0;33m Error \033[0m");
                            System.out.println("");
                        }
                    }

                    //            *********************
                    //             scientific calculator
                    //            *********************

                    case 2 -> {
                        System.out.println("\033[0;31m You choice scientific calculator \033[0m");
                        System.out.println(" Write the operation: sin, cos, tan, sinh, cosh, tanh, log");
                        String operation = sc.next();
                        switch (operation) {
                            case "sin" -> {
                                System.out.println("You want degrees or radians ?");
                                System.out.println("1 - Degrees");
                                System.out.println("2 - Radians");
                                int choice = sc.nextInt();
                                if(choice == 1){
                                    System.out.println("Enter degrees: ");
                                    double sin = sc.nextInt();
                                    double si;
                                    si = Math.toRadians(sin);
                                    System.out.println("Answer is: " + "\033[0;31m" + Math.sin(si) + "\033[0m");
                                    System.out.println("");
                                }
                                else if(choice == 2){
                                    System.out.println("Enter radians: ");
                                    double sin = sc.nextInt();
                                    System.out.println("Answer is: " + "\033[0;31m" + Math.sin(sin) + "\033[0m");
                                    System.out.println("");
                                }
                                else{
                                    System.out.println("\033[0;33m Error \033[0m");
                                }
                            }
                            case "cos" -> {
                                System.out.println("You want degrees or radians ?");
                                System.out.println("1 - Degrees");
                                System.out.println("2 - Radians");
                                int choice = sc.nextInt();
                                if(choice == 1){
                                    System.out.println("Enter degrees: ");
                                    double cos = sc.nextInt();
                                    double co;
                                    co = Math.toRadians(cos);
                                    System.out.println("Answer is: " + "\033[0;31m" + Math.cos(co) + "\033[0m");
                                    System.out.println("");
                                }
                                else if(choice == 2){
                                    System.out.println("Enter radians: ");
                                    double cos = sc.nextInt();
                                    System.out.println("Answer is: " + "\033[0;31m" + Math.cos(cos) + "\033[0m");
                                    System.out.println("");
                                }
                                else{
                                    System.out.println("\033[0;33m Error \033[0m");
                                }
                            }
                            case "tan" -> {
                                System.out.println("You want degrees or radians ?");
                                System.out.println("1 - Degrees");
                                System.out.println("2 - Radians");
                                int choice = sc.nextInt();
                                if(choice == 1){
                                    System.out.println("Enter degrees: ");
                                    double tan = sc.nextInt();
                                    double ta;
                                    ta = Math.toRadians(tan);
                                    System.out.println("Answer is: " + "\033[0;31m" + Math.tan(ta) + "\033[0m");
                                    System.out.println("");
                                }
                                else if(choice == 2){
                                    System.out.println("Enter radians: ");
                                    double tan = sc.nextInt();
                                    System.out.println("Answer is: " + "\033[0;31m" + Math.tan(tan) + "\033[0m");
                                    System.out.println("");
                                }
                                else{
                                    System.out.println("\033[0;33m Error \033[0m");
                                }
                            }
                            case "ln" -> {
                                System.out.println("Enter number: ");
                                double ln = sc.nextInt();
                                System.out.println("Answer is: " + "\033[0;31m" + Math.log(ln) + "\033[0m");
                                System.out.println("");
                            }
                            case "sinh" -> {
                                System.out.println("Enter number: ");
                                double sin = sc.nextInt();
                                System.out.println("Answer is: " + "\033[0;31m" + Math.sinh(sin) + "\033[0m");
                                System.out.println("");
                            }
                            case "cosh" -> {
                                System.out.println("Enter number: ");
                                double cos = sc.nextInt();
                                System.out.println("Answer is: " + "\033[0;31m" +Math.cosh(cos) + "\033[0m");
                                System.out.println("");
                            }
                            case "tanh" -> {
                                System.out.println("Enter number: ");
                                double tan = sc.nextInt();
                                System.out.println("Answer is: " + "\033[0;31m" + Math.tanh(tan) + "\033[0m");
                                System.out.println("");
                            }
                            default -> {
                                System.out.println("\033[0;31m Error 404 \033[0m");
                                System.out.println("");
                            }
                        }
                    }

                    //            *********************
                    //         converting radians and degrees
                    //            *********************

                    case 3 -> {
                        System.out.println("\033[0;31m You have selected converting \033[0m");
                        System.out.println(" degrees to radians - 1");
                        System.out.println(" radians to degreees - 2");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1 -> {
                                System.out.println("You choice degrees to radians");
                                System.out.println("Enter degrees");
                                double degrees = sc.nextInt();
                                double radians;
                                radians = Math.toRadians(degrees);
                                System.out.println("Answer is: " + "\033[0;31m" + radians + "\033[0m");
                                System.out.println("");
                            }
                            case 2 -> {
                                System.out.println("You choice radians to degrees");
                                System.out.println("Enter radians");
                                double radians = sc.nextInt();
                                double degrees;
                                degrees = radians * Math.PI / 180;
                                System.out.println("Answer is: " + "\033[0;31m" + degrees + "\033[0m");
                                System.out.println("");
                            }
                            default -> {
                                System.out.println("\033[0;31m Error 404 \033[0m");
                                System.out.println("");
                            }
                        }
                    }
                    default -> {
                        System.out.println("\033[0;31m Error 404 \033[0m");
                        System.out.println("");
                    }
                }
            }

            //            *********************
            //            Random number generator
            //            *********************

            else if(choicefirst == 2){
                System.out.println("Random number generator");
                System.out.println("Enter the number you want (e.g. when entering the number 100, a number from 0 to 100 will be generated)");
                int first = sc.nextInt();

                int random = (int)(Math.random()*first);
                System.out.println("\033[0;31m" + random + "\033[0m");
            }

            //            *********************
            //        Counting vowels, consonants, words and sentences
            //            *********************

            else if(choicefirst == 3){
                System.out.println("Enter any text");
                String help = sc.nextLine();
                String textsec = sc.nextLine();
                System.out.println("");
                String[] array = textsec.split("\\. ");
                System.out.println("Is found in the text: \033[0;31m" + array.length + " sentences \033[0m");
                System.out.println("");
                System.out.println("List of sentences and information about them: ");
                System.out.println("");
                for (String txt:
                     array) {
                    System.out.println(txt);
                    System.out.println("");
                    String y = txt;

                    String[] txtsen = y.split(" ");
                    System.out.println("Word count: \033[0;31m" + txtsen.length + "\033[0m");

                    char[] charnum = y.toCharArray();
                    System.out.println("Number of characters: \033[0;31m" + charnum.length + "\033[0m");

                    int souhlaskynum = 0;
                    int samohlaskynum = 0;

                    txt=txt.toLowerCase();

                    String souhlasky = "aeiouyáéěíóúůý";
                    String samohlasky = "bcčdďfghjklmnpqrřsštťvwxzž";

                    for (char c:txt.toCharArray()) {

                        if (souhlasky.contains(String.valueOf(c))){
                        souhlaskynum++;
                        }

                        else if (samohlasky.contains(String.valueOf(c))){
                        samohlaskynum++;
                        }
                    }
                    System.out.println("The number of consonants in the sentence: " + "\033[0;31m" + souhlaskynum + "\033[0m");
                    System.out.println("The number of vowels in the sentence: " + "\033[0;31m" + samohlaskynum + "\033[0m");
                    System.out.println("");
                }
            }

            //            *********************
            //                 leap year
            //            *********************

            else if(choicefirst == 4){

                System.out.println("Find out the leap year");
                System.out.println("Enter year: ");

                int year = sc.nextInt();

                if (Year.isLeap(year)){
                    System.out.println("Answer is: \033[0;31m it is a leap year \033[0m");
                    System.out.println("");
                }
                else{
                    System.out.println("Answer is: \033[0;31m it is not a leap year \033[0m");
                    System.out.println("");
                }
            }

            //            *********************
            //            BMI calculator
            //            *********************

            else if(choicefirst == 5){

                System.out.println("You choice BMI calculator");

                System.out.println("Enter weight (kg): ");
                double weight = sc.nextInt();

                System.out.println("Enter height (cm): ");
                double height = sc.nextInt();
                double he;
                he = height/100;

                double help = 0;
                help = weight/(he*he);

                System.out.println("Answer is: \033[0;31m " + help + " \033[0m");
                System.out.println("");


            }

            //            *********************
            //               Exit program
            //            *********************

            else if(choicefirst == 0) {

                System.out.println("You want to exit the program?");
                System.out.println("");
                System.out.println("\033[0;31m Exit - 1\033[0m");
                System.out.println("\033[0;34m Stay - 2 \033[0m");

                int answer = sc.nextInt();

                if (answer == 1){
                    System.out.println("\033[0;31m Exiting program \033[0m");
                    System.out.println("");
                    break;
                }

                else if(answer == 2){
                    System.out.println("\033[0;34m Thanks for staying with the program \033[0m");
                    System.out.println("");
                }

                else{
                    System.out.println("\033[0;31m Error 404 \033[0m");
                    System.out.println("");
                }
            }

            else{
                System.out.println("\033[0;31m Error 404 \033[0m");
                System.out.println("");
            }
        }
    }


    public static int plus(int x, int y){
        int n;
        n=x+y;
        return n;
    }
    public static int minus(int x, int y){
        int n;
        n=x-y;
        return n;
    }
    public static int krat(int x, int y){
        int n;
        n=x*y;
        return n;
    }
    public static int delen(int x, int y){
        int n;
        n=x/y;
        return n;
    }
}
