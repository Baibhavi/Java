/*The parameter goal represents the goal amount of kilos of flour needed to assemble a package.  
Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method should 
return true if it is possible to make a package with goal kilos of flour.  
If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, 
bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, 
if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount 
bags equal goal, and it's okay if there are additional bags left over.
If any of the parameters are negative, return false.  
EXAMPLE INPUT/OUTPUT:  
canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left 
which is ok as mentioned above.
canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), 
makes in total 12 kilos and goal is 11 kilos.
canPack (-3, 2, 12); should return false since bigCount is negative. */
import java.util.Scanner;
public class FlourBag {
    public static boolean canPack(int bb,int sb,int goal){
        boolean result =false;
        if(bb<0 || sb<0 || goal<0){
            return result;
        }
        else{
            if ((bb*5) + sb < goal){
                return result;
            }
            else if (bb*5 + sb == goal){
                result = true;
            }
            else{
                int rem= goal - (bb*5 + sb);
                if (sb ==0 && rem<0){
                    return result;
                }
                else{
                if (rem==0){
                    result = true;
                }
                else if(rem <0){
                    result = true;
                }}
            }
        }
        return result;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of big bags , small bags and goal respectively : ");
        int bigBag = sc.nextInt();
        int smallBag = sc.nextInt();
        int Goal = sc.nextInt();
        System.out.println(canPack(bigBag, smallBag, Goal));
    }
}