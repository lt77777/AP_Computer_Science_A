
/**
 * Prompt the user to enter their full name (on one line, not separately). Then….
a. If the user forgot to enter a space, make them try again.
b. Display the number of characters in the name (not including the space).
c. Display the 1st letter, the 3rd letter, and the last letter (of the full name).
d. Display the name in all caps.
e. If the letters A and Z are both in the name, display “both.”
f. Display the characters from index #4 to (and including) index #6
g. Display the characters from index #2 to the end of the name
h. Display the person’s initials only.
 *
 * Larry Tsai
 * 24OCT2019
 */
import java.util.Scanner;
public class Lettahs

{
    public static void main(){

        Scanner scanny=new Scanner (System.in);
        System.out.println("Print your full name on one line");
        String name=scanny.nextLine();
        if(!name.contains(" "))
        {
            System.out.println("Print your full name with a space please");
            name=scanny.nextLine();
        }
int count=name.length()-1;
System.out.println("There are "+count+" characters in your name");
System.out.println(name.charAt(0));
System.out.println(name.charAt(2));
System.out.println(name.charAt(name.length()-1));

System.out.println(name.toUpperCase());
if(name.contains("A")&&name.contains("Z")){
    System.out.println("Both");
    }
  String a = name.substring(4,7);
  String b = name.substring(2);
  System.out.println(a);
  System.out.println(b);
  System.out.print(name.charAt(0)); 
  for(int i=1; i<name.length(); i++){
      if(name.charAt(i-1)==(' ')){
        
         System.out.println(name.charAt(i));
        break;
    }
        
    
}
}
}