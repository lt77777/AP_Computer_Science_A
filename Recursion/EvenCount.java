
/**
 * Use the same client as Factorial. 
 * Add a recursive method (EvenCount) to count the number of even numbers in an arraylist of integers. 
 * Again use the SAME client to demonstrate it works correctly.
 *
 * Lawrence Tsai
 * 15MAR2020
 */ 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class EvenCount
{
    public static int EvenCount(int x, ArrayList<Integer>s,int w)
    {

     

      
        if(x==0){
            return w;
        }

        if (s.get(x)%2==0){
            w= 1;
        }
        else {                  
            w=0;
        }
        return w + EvenCount(x-1,s,w);
    }

        
    // int w=s.length-1;
    // int h=0;

    // if(w==0&&s[0]%2==1)
    // { 
    // return x-1;
    // }

    // else{
    // if(s[x]%2==1)
    // {
    // x
    // }

    // return (h+EvenCount(x-1

    // }}

    public static int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
}
