import java.util.Scanner;
//Declare a double variable weightKgs and take input from the user in kilograms. Also, Create a method convert(double kgs) 
//and convert the weight to grams and milligrams.
public class weightConverter {
    public static void main(String[] args){
        double weightKgs ;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the weight in kgs : ");
            weightKgs  = sc.nextDouble();
        }
        weightConvert(weightKgs);
    }
    public static void weightConvert(double weight){
        double grams = weight*1000;
        double milliGrams = weight*100000;
        System.out.println("The weight in grams is : "+grams+" grams");
        System.out.println("The weight in milligrams is :"+milliGrams+" milligrams");
    }
}
