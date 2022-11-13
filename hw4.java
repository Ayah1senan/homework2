import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        int a ,b;
        double primeter ;
        double area;
        Scanner w= new Scanner(System.in);
        System.out.println("Enter the lenghth of a rectangle");
        a =w.nextInt();
        System.out.println("Enter the width of a rectangle");
        b=w.nextInt();
        area=a*b;
        primeter= 2 *a *2*b;
        System.out.println("the area of a rectangle "+ area);
        System.out.println("the primeter of a rectangle "+ primeter);
    }
}
