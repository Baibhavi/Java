public class DiamondPattern {
    public static void main(String[] args){
        int n=4;
        for (int i =1;i<=n;i++){
            int stars=(2*i)- 1;
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j =1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n;i>=1;i--){
            int stars=(2*i)-1;
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j =1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
