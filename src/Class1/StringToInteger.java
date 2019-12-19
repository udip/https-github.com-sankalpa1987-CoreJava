package Class1;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        //ask age in string and convert it to integer;
        //please enter your age

        /* String age = nextline......
        System.out.println("you will be age +5 years after 5 years");
         */

        System.out.print("Please Enter your Age:");
        Scanner scan = new Scanner(System.in);
        String age=scan.nextLine();
        int intAge = Integer.parseInt(age);
        System.out.print("you will be" +(intAge+5) +"after 5 yrs");
    }
}
