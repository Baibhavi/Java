/*Create a function isPalindrome with one int parameter number and Check if the number is palindrome number or not. 
If it is palindrome return true, otherwise return false.
For example ,
isPalindrome(121)-> should return true
isPalindrome(12343)-> should return false because the reverse is 34321 and it is not equal to 12343. */
import java.util.Scanner;
public class PalindromeNum {
    public static boolean isPalindrome(int num){
        int rev = 0;
        int temp = num;
        while (temp!=0){    
        rev = rev*10 + temp%10;
        temp/=10;
    }
    if (num == rev){
        return true;
    }
    else{return false;}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int n = sc.nextInt();
        boolean result=isPalindrome(n);
        System.out.println(result);
    }
}
