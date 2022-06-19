
/**
 *Fish Class
 *
 * name, xPos, yPos, color, weight
 *
 * swim, eat, mutate, toString
 *
 *
 * Larry Tsai
 * 29OCT2019
 */
public class Fish
{
    //instance variables
    private String name, color;
    private int xPos, yPos;
    private double weight;
    //constructor needs to be public
    public Fish()
    {
        name="fishy";
        color="blue";
        xPos=10;
        yPos=10;
        weight=35.6;
    }

    public Fish(String name, String color, int x, int y)
    {
        name=name;
        this.color=color;
        xPos=x;
        yPos=y;

    }

    public void eat(double x)   //void means it returns nothing
    {
        weight+=x;  
    }

    public void mutate(String mut)
    {
        color=color+ "-" + mut; 
    }
public void setWeight(double w)
{ 
    weight=w;
}
public void getName(
    public void swim(String dir,int mov)
    {
        weight--;
        if(dir.equals("up"))
        {
            yPos-=mov;
        }
        else if(dir.equals("down"))
        {
            yPos+=mov;
        }
        else if(dir.equals("left"))
        {
            xPos-=mov;
        }
        else if(dir.equals("right"))
        {
            xPos+=mov;
        }

    }
    public String toString()
    {
        return "Name:" + name + 
        "\nColor:" + color +
        "\nxPos:" + xPos+
        "\nyPos:" + yPos+
        "\nWeight:" + weight;

    }
}
