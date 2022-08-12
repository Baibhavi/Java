/*Write a method areEqualByFiveDecimalPlaces with three parameters of type double.The method should return boolean and it needs to return true if three double numbers are the same up to five decimal places.Otherwise, return false.  
Example 
areEqualByFiveDecimalPlaces(1.176231, 1.176232, 1.176233) -> should return true since number are equal up to 5 decimal places.
areEqualByFiveDecimalPlaces(2.23543, 2.235432, 2.235451) -> should return false since numbers are not equal up to 5 decimal places. */ 
public class decimal_comparator {
    public static void main(String[] args){
        System.out.println(areEqualByFiveDecimalPlaces(1.123456,1.123457,1.123459));
        System.out.println(areEqualByFiveDecimalPlaces(2.234321,2.234566,2.234689));
    }
    public static boolean areEqualByFiveDecimalPlaces(double x,double y,double z){
        x = Math.round(x*100000);
        y = Math.round(y*100000);
        z = Math.round(z*100000);
        if (x==y && y==z){
            return true;
        }
        return false;
    }
}
