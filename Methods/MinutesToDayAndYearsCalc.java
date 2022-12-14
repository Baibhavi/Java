/*Write a method printYearsAndDays with parameter of type long named minutes.  
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.  
If the parameter is less than 0, print text "Invalid Value".   Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.  
EXAMPLES OF INPUT/OUTPUT:  
printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
TIPS:  Use the remainder operator
1 hour = 60 minutes
1 day = 24 hours
1 year = 365 days */
public class MinutesToDayAndYearsCalc {
    public static void printYearsAndDays(long minutes){
        if (minutes<0){System.out.println("Invalid Value");}
        else{
            long year  = (minutes/525600);
            long remainingMinutes = (minutes - (year*525600));  //60*24*365=525600
            long day  = remainingMinutes/1440;  //60*24=1440
            System.out.println(minutes+" mins = "+year+" y and "+day+" d");
        }
    }
    public static void main(String[] args){
        printYearsAndDays(561600);
    }
}
