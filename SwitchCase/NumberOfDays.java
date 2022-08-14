/*(Find the number of days in a month) Write a program that prompts the user to enter the month and year and displays
the number of days in the month. For example, if the user entered month 2 and year 2012, the program should display that 
February 2012 has 29 days. If the user entered month 3 and year 2015, the program should display that March 2015 has 31 days.*/
import java.util.Scanner;
public class NumberOfDays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        NumOfDays(year, month);

    }
    public static boolean isLeap(int year)
    {
        if (year%4==0 && (year%100!=0 || year%400==0))
            return true;    
        
        else
            return false;
        
    }
    public static void NumOfDays(int y,int mon){
        if (y<1 || y>9999){
            System.out.println(-1);
            return ;
        }
        if (mon<1 || mon>12){
            System.out.println(-1);
            return ;
        }
        switch(mon){
            case 1:
            System.out.println("January "+y+" has 31 days.");
            break;
            case 2:
            System.out.println("February "+y+" has "+(isLeap(y)?"29 days.":"28 days."));
            break;
            case 3:
            System.out.println("March "+y+" has 31 days.");
            break;
            case 4:
            System.out.println("April "+y+" has 30 days.");
            break;
            case 5:
            System.out.println("May "+y+" has 31 days.");
            break;
            case 6:
            System.out.println("June "+y+" has 30 days.");
            break;
            case 7:
            System.out.println("July "+y+" has 31 days.");
            break;
            case 8:
            System.out.println("August "+y+" has 31 days.");
            break;
            case 9:
            System.out.println("September "+y+" has 30 days.");
            break;
            case 10:
            System.out.println("October "+y+" has 31 days.");
            break;
            case 11:
            System.out.println("November "+y+" has 30 days.");
            break;
            case 12:
            System.out.println("December "+y+" has 31 days.");
            break;
        }

    }
    
}
