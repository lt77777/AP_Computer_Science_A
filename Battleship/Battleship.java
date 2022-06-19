
/**
 * Before starting the assignment, read through the entire set of directions. This project will take several class periods (approximately 10 hrs.) so make a plan, don't wait til the last few days and expect to complete this project. Please use your time wisely. You MUST plan your code using some type of Document creator like Google Docs (not the code but the pseudocode). I encourage cooperation, a good plan makes writing code easier. If asked I can help you get your plan started as well as give you ideas.
Plan all of your for loops, while loops, if-and-or statements, array declarations, etc…..

1. Create four 10-by-10 game boards – a “Ship Board” for each player (to place ships on), and a “Torpedo Board” for each player (to fire torpedoes on). Place a dash (-) in each “cell” of each board.

2. Start by asking each player to place his/her 3 ships:
a. First, display his/her Ship Board.
b. The Cruiser and the Destroyer are both 4 cells long; the Battleship is 5.
c. You must ask the player where to start placing a ship (for example, Row 3, Column 7),
and then asking which direction the ship should go from there (up, down, left, or right).
(this will require some serious(SERIOUS) error checking!)
d. Assign an uppercase C (Cruiser), D (Destroyer), or B (Battleship) to the cells where a
ship is located. (you can be creative here)

3. Now…let the game begin. Display Player 1’s Ship Board and Torpedo Board. Let Player 1 enter the coordinates of the location he would like to fire a torpedo at. Announce whether he hits or misses. If he hits, place an X in the location of the hit (on Player 1’s Torpedo Board, AND on Player 2’s Ship Board). If he misses, place an uppercase O.

4. SERIOUS Error checking: do not allow a player to fire at a location he has already fired at; there are only 10 rows & columns; some directions are impossible.

5. If a player sinks a ship, announce it. (“You sunk Player 2’s Destroyer!”).
6. After Player 1 fires, it is Player 2’s turn.
7. The players take turns until one player’s ships are all sunk.
 *
 * Larry Tsai
 * 18MAR2020
 */
public class Battleship
{
    public String[][]FillBoard (String[][]board){
        
         for(int r = 0;r<board.length; r++)
        {
            for(int c = 0; c<board[r].length;c++)
            {
                board[r][c] = "-";
            }
       
    }
    return board;
}
    public static void main(){
        
        String [][]shipboard1=new String [10][10];
        String [][]shipboard2=new String [10][10];
        String [][]torpedoboard1=new String [10][10];
        String [][]torpedoboard2=new String [10][10];
        shipboard1=FillBoard(shipboard1);
        
        
        
    }
}