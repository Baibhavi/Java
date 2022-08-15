public class OddOrNot {
    //Write a method to predict an odd number, if odd return true or else return false.
    //In the main methode print all the odd number from 5 to 30.
    public static boolean isOdd(int x){
        if (x%2!=0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int a = 5;
        while (a<30){
            if (isOdd(a)){
                System.out.println(a);
            }
            a++;
        }

    }
    
}
