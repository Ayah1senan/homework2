import java.util.Scanner;

public class hw2{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);


        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double  area=Math.PI*r*r ;
        double primeter=2*Math.PI*r;
        System.out.println("Area of Circle is: " + area);
        System.out.println("Primeter of a circle is "+ primeter);

    }
}
