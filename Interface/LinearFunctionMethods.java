
/**
 * Write a description of class LinearFunction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public interface LinearFunctionMethods 
{ 
    double getSlope( ); 

    double getYintercept( ); 

    double getRoot( ); 

    double getYvalue(double x); //return the y value corresponding to x 
    double getXvalue(double y); //return the x value corresponding to y 
} 
public class LinearFunction implements LinearFunctionMethods{
    private double slope;
    private double yIntc;
    private double root;
    private double x;
    private double y;

    public class LinearFunction(double slope,double y){
        slope=slope;
        y=y;
    }
    public double getSlope(double slope ) {
        return slope;
    }

    public double getYintercept( double yIntc){
        return yIntc;
    }

    public double getRoot(double slope,double yIntc ){
        double root=-(yIntc)/slope;
        return root;
    }

    public double getYvalue(double x,double slope,double yIntc){
        double y=getSlope(slope)*x+getYintercept(yIntc);
        return y;
    }

    public double getXvalue(double y,double slope,double yIntc){
        double x=(y-yIntc)/slope;
        return x;
    }
}
}
