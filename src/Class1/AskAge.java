package Class1;

import java.util.Calendar;
import java.util.Scanner;

public class AskAge {
    public static void main(String[] args) {
        //Too Auto-generated method stub

        System.out.print("Please Enter your Age:");//single Line print
        Scanner scan = new Scanner(System.in);
        int age =scan.nextInt();
        System.out.print("your age is !!"+ age);

        //Find Date of Birth
        System.out.print("Please provide DOB in the Format YYYY-MM-DD");
        Scanner s = new Scanner(System.in);
        String dob =s.nextLine();//1980-11-12
        int yearInput = Integer.parseInt(dob.substring(0,4)); //1980
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);//2019
        System.out.print("You are" + (currentYear-yearInput)+"years old");

        //
        int a = 'a';
        System.out.println(a);




    }

}
