import java.util.Scanner;
public class byteConverter {
    public static void main(String[] args){
        //Create a integer variable kiloBytes and take a input from the user in kiloBytes. Now, create a method named  printMegaBytes(int kiloBytes)
        // and convert the kiloBytes into MegaBYtes.For example, if we divide the Kilobytes by 1024 , It will give the Megabytes(MB).  
    int kiloByte;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number in kilobyte");
    kiloByte = sc.nextInt();
    printMegaByte(kiloByte);
    }
    public static void printMegaByte(int kiloByte){
        if (kiloByte<0){
            System.out.println("Invalid Input");
        }
        else   
        {int megaByte = kiloByte/1024;
         int newKiloByte = kiloByte%1024;   
        System.out.println(kiloByte+" KB = "+megaByte+" MB and "+newKiloByte+" KB");}
    }
}
