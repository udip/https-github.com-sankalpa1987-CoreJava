package Class1;


import java.util.Scanner;

public class AskName{
    private static String Str;

    public static void main(String[] args) {

        System.out.print("Please Enter your Name:");//stringLe line print
        //// psvm  tab shortcut for system.out
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.print("Welcome to class!!"+ name);
        System.out.println("Welcome to Class !!" + name.toUpperCase());
        System.out.println("Welcome to Class !!" + name.toLowerCase());

        // sub string
        String Str="Sankalpa Ghale";
        System.out.println(Str.substring(9));

        String Str1="Sankalpa Ghale";
        System.out.println(Str.substring(0,8));

    }
}




