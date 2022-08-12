/*Write a method named hasNotTeen with 3 parameters of type int.
We’ll say that a number is  “teen” if it is in the range 13..19 inclusive, otherwise it is not teen. Given 3 int values, return true if none of them are teen, otherwise return false..
Example 
Sample Input 1 : 13 12 20
Sample Output 1: False
Explanation: Since 13 is a teen number, hence false is returned.
Sample Input 2: 9 29 21
Sample output 2: True
Explanation: Since numbers 9,29,21 are not in range 13-19, hence true is returned.  */

import java.util.Scanner;
public class notTeen {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter ages of three people: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(hasNotTeen(a,b,c));
    }
    public static boolean hasNotTeen(int x,int y,int z){
        if ((x>12 && x<20) || (y>12 && y<20) || (z>12 && z<20)){
            return false;
        }
        else
        {return true;}
    }
}
