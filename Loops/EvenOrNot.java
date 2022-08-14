/*Write a method called isEven with an int parameter and call it number. The method needs to return a boolean.
Check that number is >0, if it is not return false. If number is even return true, otherwise return false.  
Write a second method called sumEven that has 2 int parameters start and end, which represent a range of numbers.  
The method should use a for loop to sum all even numbers in that range including the end and return the sum.  
It should call the method isEven to check if each number is even. The parameter end need to be greater than or equal to start 
and both start and end parameters have to be greater than 0.  
If those conditions are not satisfied return -1 from the method to indicate invalid input.  
Example input/output :
sumEven(1,100) return
sumEven(-1,100)-> should return -1
sumEven(10,10)->should return 10 */
public class EvenOrNot {
    public static boolean isEven(int n){
        if (n>0){
            if (n%2==0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    public static int EvenSum(int start,int end){
        int sum = 0;
        if (start>end || start<=0 || end<=0){
            return -1;
        }
        for (int i = start; i<=end ;i++){
            if (isEven(i)){
                    sum+=i;
                }}
        return sum;
        
        
    }
    public static void main(String[] args){
        System.out.println(EvenSum(10,10));
        
    }
    
}
