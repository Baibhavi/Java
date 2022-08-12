import java.util.Scanner;
/*Write a method hasEqualProduct with 3 parameters of type int.
The method should return boolean and it needs to return true if the product of the first and second parameter is equal to the third parameter. Otherwise, return false.  
Example 
Input :
2 3 6
Output :
True  
Explanation:
Since 2*3 is equal to 6, hence return true. */

public class equalProduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(hasEqualProduct(a,b,c));
    }
    public static boolean hasEqualProduct(int x, int y,int z){
        if (x*y==z){
            return true;
        }
        return false;
    }
}
