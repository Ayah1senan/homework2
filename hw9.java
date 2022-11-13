import java.util.Scanner;
import java.lang.Math;
public class hw9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers  ");
        int n1 =input.nextInt();
        int n2 = input.nextInt();
        int sum;
        int avg;
        int dif;
        int prod;
       double dist1;
       double dist2;


      sum = n1+n2;
      avg= sum/2;
      dif=n1-n2;
      prod=n1*n2;
      dist1= n2-n1;
      dist2 =dist1;
      Math.sqrt(dist2);
      Math.max(n1,n2);
      Math.min(n1,n2);

        System.out.println(" the sum =" + sum);
        System.out.println(" the avg=  " + avg);
        System.out.println("the product ="+prod);
        System.out.println(" the diffrence =" + dif);
        System.out.println(" the distance= " + dist2);
        System.out.println("the max =" + Math.max(n1,n2));
        System.out.println("the min =" +Math.min(n1,n2));






    }

}

