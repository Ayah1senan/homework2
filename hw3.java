import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        int a,b,c,sum;
        double avg;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = s.nextInt();
        System.out.println("Enter the second number:");
        b = s.nextInt();
        System.out.println("Enter the third number:");
        c = s.nextInt();

        sum=a+b+c;
        avg=sum/3;

        System.out.println("Average of the numbers is "+avg);

    }
}
