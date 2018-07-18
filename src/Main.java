
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Whats your name?");
        name = sc.nextLine();

        LocalTime timeRightNow = LocalTime.now();

        if(timeRightNow.compareTo(LocalTime.NOON)>0)
        {
            System.out.println("Good morning "+name);
        }
        else
        {
            System.out.println("Good afternoon "+name);
        }

        int userAge;
        System.out.println("Whats your age?");
        userAge = sc.nextInt();

        int ageRange = (90 - 18) + 1;
        int computerAge = (int)(Math.random()*ageRange);
        int ageDifference = computerAge - userAge;

        if(computerAge>userAge)
        {
            System.out.println("I am "+computerAge+" years old, which is " +ageDifference+" older than you");

        }
        else
        {

            System.out.println("I am "+computerAge+" years old, which is " +  String.valueOf(ageDifference).substring(1)+" younger than you");

        }

        System.out.println("Twice my age would be " +computerAge*2);

        if(computerAge%2==0)
        {
            System.out.println("My age is an even number");
        }
        else
        {
            System.out.println("My age is an odd number");
        }

        System.exit(0);







        // write your code here
    }

}

