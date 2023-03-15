import java.io.*;
interface Car
{
    void topSpeed();
    void noOfGear();
    void serviceTime();
}
class Alto implements Car
{
    Alto()
    {
        System.out.println("This is a Alto Car");
    }
    public void topSpeed()
    {
        System.out.println("Top Speed is 100km/h");
    }
    public void noOfGear()
    {
        System.out.println("No. of gears is 5");
    }
    public void serviceTime()
    {
        System.out.println("This car needs service after each 10000 km");
    }
}
class Swift implements Car
{
    Swift()
    {
        System.out.println("This is a Swift Car");
    }
    public void topSpeed()
    {
        System.out.println("Top Speed is 180km/h");
    }
    public void noOfGear()
    {
        System.out.println("No. of gears is 6");
    }
    public void serviceTime()
    {
        System.out.println("This car needs service after each 75000 km");
    }
}

public class ExampleInterface01{
public static void main(String args[]){
        Alto obj1=new Alto();
        Swift obj2=new Swift();
        obj1.topSpeed();
        obj2.topSpeed();
}
}
