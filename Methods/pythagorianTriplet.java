import java.util.Scanner;
//Write a program to accept three number and check whether they are pythagorean triplet or not.  
public class pythagorianTriplet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(triplet(a,b,c));
    }
    public static boolean triplet(int x,int y,int z){
        int p = x*x;
        int q = y*y;
        int r = z*z;
        if (p == q+r){

            return true;
        }
        else if (q == p+r){
            return true;
        }
        else if (r == p+q){
            return true;
        }
        else{
            return false;
        }
    }
}
