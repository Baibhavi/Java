/*Write a method called numberToWords with one int parameter named number.
The method should print out the passed number using words for the digits.
If the number is negative, print “Invalid Value”.  
Example Input/Output   
numberToWords(123)-> should print “One Two Three”.
numberToWords(3456)-> should print “Three Four Five Six”.
numberToWords(-7)-> should print “Invalid Value” since parameter is negative; */
import java.util.regex.Pattern;
import java.util.Arrays;
public class NumToWordsConverter {
    public static void numberToWords(int num){
        if(num>0){
            int digit = 0;
            int t = num;
            String name="";
            String[] numbers = {"Zero ","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
            while(t!=0){
                digit = t%10;
                t/=10;
                name+=numbers[digit];   
            }
            Pattern p=Pattern.compile("\s");
            String[] result = p.split(name);
            String rev = "";
            for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1)
            rev = result[i] + rev;
            else
            rev = " " + result[i] + rev;
      }
            System.out.println(rev);
        }
        else{
            System.out.println("Invalid Value");
        }
    }
    public static void main(String[] args){
        numberToWords(123);
        numberToWords(45376);
        numberToWords(-7);
    }
}
