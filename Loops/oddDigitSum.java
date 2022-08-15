/*Write a method named getOddDigitSum with one parameter of type int called number.  
The method should return the sum of the odd digits within the number.  
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:  
getOddDigitSum(123456789); → should return 25 since 1 + 3 + 5 + 7 +9 = 25
getEvenDigitSum(252); → should return 5 since 5 is the only odd digit in the number
getEvenDigitSum(-22); → should return -1 since the number is negative. */
public class oddDigitSum {
    public static int getOddDigitSum(int n){
        if (n<0){
            return -1;
        }
        int sum = 0;
        int rem =0;
        while (n!=0){
            rem =n%10;
            if (rem%2!=0)
                sum+=rem;
            n/=10;    
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(getOddDigitSum(123456789));
        System.out.println(getOddDigitSum(252));
        System.out.println(getOddDigitSum(-22));
    }
}
