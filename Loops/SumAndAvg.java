/*Write a method called inputThenPrintSumAndAverage that does not have any parameters.  
The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.  
When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".  
XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.  
EXAMPLES OF INPUT/OUTPUT:  
EXAMPLE 1:  
INPUT:   1 2 3 4 5 a  
OUTPUT   SUM = 15 AVG = 3  
EXAMPLE 2:  
INPUT:   hello  
OUTPUT:   SUM = 0 AVG = 0*/
import java.util.Scanner;
public class SumAndAvg {
    public static void main(String[] args){
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        int count = 0;
        int sum = 0;
        int avg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        while(true){
            boolean value = sc.hasNextInt();
            if (value){
                System.out.println("Enter another number : ");
                int real_val = sc.nextInt();
                sum+=real_val;
                count+=1;
            }
            else if(count==0){
                sum=0;avg=0;
                break;
            }
            else{
                avg=sum/count;
                System.out.println("Sum = "+sum+" Average = "+avg);
                break;
                
            }
            sc.nextLine();
            }
            sc.close();
        }
    }
    

