
/**
 * Write a program that "calculates" and prints the number of minutes in a year.
 * 
 * Larry Tsai 
 * 16SEP2019
 */
public class Rent
{
    public static void main() {
    double year= 1;
    double days = year*365; 
    double hours = days*24;
    double minutes = hours*60;
    System.out.println(year + " year * 365 days per year means " + days + " days total");
    System.out.println(days + " days * 24 hours per day means " + hours + " hours total");
    System.out.println(hours + " hours * 60 minutes per hour means " + minutes + " minutes total");
  
        
    }
}