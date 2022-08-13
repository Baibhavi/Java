/*Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
You should validate that the first parameter minutes is >= 0.
You should validate that the 2nd parameter seconds is >= 0 and <= 59. The method should return Invalid value in the method if either of the above are not true.
If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format gXXh YYm ZZsh where XX represents a number of hours, YY the minutes and ZZ the seconds.
Create a 2nd method of the same name but with only one parameter seconds.
Validate that it is >= 0, and return gInvalid valueh if it is not true.
If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.
Call both methods to print values to the console.
Tips: Use int or long for your number data types is probably a good idea.
1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
Methods should be static as we have used previously.
Bonus: For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
Create a new console project and call it SecondsAndMinutesChallenge */
public class DurationString {
    public static void main(String[] args)
    {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
    }
    public static String getDurationString(long minutes,long seconds)
    {
        if (minutes<0 || (seconds<0 || seconds>59)){
            return "Invalid value";
        }
        else{
            long hours = minutes/60;
            long new_mins = minutes%60;
            String hoursString = hours +" hrs";
            String minString = new_mins+" mins";
            String secString = seconds+" secs";
            if (hours<10){hoursString ="0"+hoursString;}
            if (new_mins<10){minString ="0"+minString;}
            if (seconds<10){secString ="0"+secString;}
            return hoursString+" "+minString+" "+secString;
        }
    }
    public static String getDurationString(long seconds)
    {
        if (seconds<0)
        {
            return "Invalid value";
        }
        else{
            long mins=seconds/60;
            long sec=seconds%60;
            String min_string = mins+" mins";
            String sec_string = sec+" secs";
            if (mins<10){min_string="0"+min_string;}
            if (sec<10){sec_string="0"+sec_string;}
            return min_string+" "+sec_string;
        }

    }
}
