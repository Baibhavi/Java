import java.util.Scanner;
public class RomanNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman number: ");
        String rnum = sc.nextLine();
        int sum=0;
        for(int i = 0; i<rnum.length();i++){
            char s =rnum.charAt(i);
            if(s=='I' || s =='i'){
                sum+=1;
            }
            else if (s=='V' || s=='v'){
                sum+=5;
            }
            else if (s=='X' || s=='x'){
                sum+=10;
            }
            else if (s=='L' || s =='l'){
                sum+=50;
            }
            else if (s=='C' || s == 'c'){
                sum+=100;
            }
            else if (s=='D' || s == 'd'){
                sum+=500;
            }
            else if (s=='M'|| s=='m'){
                sum+=1000;
            }
        }
        System.out.println("Integer Form = "+sum);
    }
}
