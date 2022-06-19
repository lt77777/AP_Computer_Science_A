
/**
 * Design and implement a recursive program(Pascal) to print the Nth line of Pascal’s Triangle, see below. 
 * Each inside value is the sum of the two values above it. (hint - You could use an arraylist to store the values on each line.) 
 * See attached image for Pascal's Triangle up to the 5th row. Remember to use the same client to demonstrate your work. Note, row 5 outputs [1,5,10,10,5,1]
 *
 * Larry Tsai
 * 15MAR2020
 */
import java.util.ArrayList;
public class Pascal
{
    public static int [] Pascal(int x)
    {
        int [] n=new int [x+1];
if(x==0){
    n[0]=1;
    return n;
}
        if (x==1)
        {
            n[0]=1;
            n[1]=1;
            return n;

        }
       n[0]=1;
        int [] m=Pascal(x-1);
        for (int i=0;i<m.length-1;i++){
            n[i+1]=m[i]+m[i+1];
            
            
        }
        n[x]=1;
        return n;
    }
    public static void print(int [] a){
        for (int j=0;j<a.length;j++){
            System.out.print(a[j]+ " " );
        }
    }
        
        
}