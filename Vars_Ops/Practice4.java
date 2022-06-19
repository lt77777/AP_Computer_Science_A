
/**
 *
 * 
 * Larry Tsai
 * 11SEP2019
 */
public class Practice4
{
    public static void main (){
        double a1 = 96;
        double a2 = 37;
        double a3 = 69;
        double sum = (a1+a2+a3);
        double ave =(sum/3);
        double variance =(((Math.pow(a1 - ave,2))+(Math.pow(a2 - ave,2))+(Math.pow(a3 - ave,2)))/3);
        double standarddeviation = Math.sqrt(variance);
        System.out.print("Average ");
        System.out.println(ave);
        System.out.print("Variance ");
        System.out.println(variance);
        System.out.print("Standard Deviation ");
        System.out.println(standarddeviation);
    }
}
        
    