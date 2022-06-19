/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
	      Card card1=new Card ("11","diamonds",11);
		Card card2=new Card ("10","spades",10);
		Card card3=new Card ("aces","spades",1);
   System.out.println("Card 1: " + card1.toString());
  System.out.println("Card 2: " + card2.toString());
  System.out.println("Card 3: " + card3.toString());
  System.out.println("Card 1 matches Card 2? " + card1.matches(card2));
  System.out.println("Card 1 matches Card 3? " + card1.matches(card3));   
  System.out.println("Card 2 matches Card 3? " + card2.matches(card3));
  
 
 }
}
	   
		
		
		
