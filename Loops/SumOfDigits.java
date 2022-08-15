import java.util.Scanner;
public class SumOfDigits {
/*Declare a variable n and store a number in it. Declare two more variables rem and sum. Your task is to calculate the sum
of the digits of the number, rem will be used for storing the digits, and sum will be used to store the sum of those digits.
For example
N = 12345
Sum of digits will be = 15 */
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    int rem;
    int sum =0;
    do{
        rem=n%10;
        sum+=rem;
        n/=10;
    } while(n!=0);
    System.out.println("Sum of the digits is "+sum);
}
    
}
