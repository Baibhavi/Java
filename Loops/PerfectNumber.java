public class PerfectNumber {
    public static boolean isPerfectNumber(int x){
        boolean result = false;
        if (x<1){
            return result;
        }
        else{
            int sum = 0;
            for (int i =1;i<=x;i++){
                if (x%i==0){
                    sum+=i;
                    if (sum == x){
                        result =true;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(-5));
        System.out.println(isPerfectNumber(1));
    }
    
}
