
/**
 * The local book store has a markup of 10% on each book sold.
 * Write a program continues to prompt the uses for the sales price of a book(s) as input. 
 * The prompts should end when the user enters a negative number for the price. 
 * The program should then display the following outputs:
Total sales price.
Total markup of the books sold.
Example: Enter sales price of the book: 1.10
Enter sales price of the book: 2.30
Enter sales price of the book: 3.20
Enter sales price of the book: -1
Total sales price: 6.60
Total markup of books sold: .60
 * 
 * Larry Tsai
 * 16OCT2019
 */
import java.util.Scanner;
public class BookStore
{
    public static void main (){
        Scanner scanny=new Scanner (System.in);
         double total=0;
            double markup=0;
        for(int i=1; i>0; i++){
           
            System.out.println("What is the sale price of the book?");
            double price=scanny.nextDouble();
            if (price>=0){
            total+=price;
            markup=total/11;
        }
            else{
                System.out.println("Total sales price: " + total);
                 System.out.println("Total markup of books sold: " + markup);
           
            break;
                }
            }
    }
    }
    