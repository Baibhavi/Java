//print prime numbers from 1 to a given number by the user.
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last number");
        int last_num = sc.nextInt();
        for (int j=1;j<last_num;j++){
        isPrime(j);
    }
    }
    public static void isPrime(int n){
        if (n>1){
            int count=0;
            for (int i=2;i<n;i++){
                if (n%i==0){
                    count+=1;
                    break;
                }}
            if (count==0){
                System.out.println(n);
            }    
            
        }
        else if (n==2){
            System.out.println(n);
        }
    }
}
