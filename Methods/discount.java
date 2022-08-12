import java.util.Scanner;
public class discount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coupon code : ");
        String code = sc.nextLine();
        codeChecker(code);
    }
    public static void codeChecker(String coupenCode){
        String ourCode = "CHGDVC875";
        if (coupenCode == ourCode){
            System.out.println("Congrats you'll get 100% discount !");
        }
        else{
            System.out.println("The code doesn't match. Better luck next time!");
        }
    }
}
