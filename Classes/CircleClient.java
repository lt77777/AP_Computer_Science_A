/**
 * CircleClient
 *      Start here with creating the idea 
 *      of multiple circles and the need 
 *      to reuse code
 * 
 * Larry Tsai
 * 25OCT2019
 */
public class CircleClient
{
public static void main()
{
    Circle myCircle=new Circle();
 myCircle.printInfo();
   Circle myOtherCircle=new Circle(123.45,"Ken");
    myOtherCircle.printInfo();
    System.out.println();
     System.out.println(myCircle);
///*****************
// double CircleRadius = 10.0;
// String CircleName = "First circle";
// // finding area
// double CircleArea = Math.PI * CircleRadius *CircleRadius+5;
// // finding diameter
// double CircleDiameter = CircleRadius * 2.1;
// // finding circumference
// double CircleCircumference = Math.PI * CircleDiameter;
// System.out.println("The " + CircleName + " has a diameter of " + CircleDiameter+" units.");
// System.out.println("The " + CircleName + " has a area of " +CircleArea+" square units.");
// System.out.println("The " + CircleName + " has a circumference of " +CircleCircumference+" units.");

}
}
