
/**
 * Circle class that makes circle objects
 *
 *Circles have name and radius
 *We want to get info on circles like area, cricumference, and diameter
 *
Larry Tsai
25OCT2019
 */
public class Circle

{
    // instance variables - replace the example below with your own
    //information and attributes of a circle
    private double radius;
    private String name;
    /**
     * constructor part
     */
    public Circle()
    {
        // initialise instance variables
        radius = 1;
        name="MyCircle";
    }

    public Circle(double radius, String name)
    {
        this.radius=radius; 
        this.name=name;

    }

    public double findArea()
    {
        double area=radius*radius*Math.PI;
        return area;

    }

    public double findCircumference()
    {
        double c=2*Math.PI*radius;
        return c;
    }

    public double findDiameter()
    {
        return radius*2;
    }

    public void setRadius(double radius)
    {
        this.radius=radius;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void printInfo()
    {
        System.out.println("The " + name + " has a diameter of " + findDiameter() +" units");
        System.out.println("The " + name + " has an area of " + findArea() +" square units");
        System.out.println("The " + name + " has a circumference of " + findCircumference() +" units");
    }
    public String toString(){
        return  "The " + name + " has a diameter of " + findDiameter() +" units"   ;
       
    }

}

