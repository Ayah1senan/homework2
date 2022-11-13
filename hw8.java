import java.util.Scanner;

public class hw8



    {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double num;
            double square_num;
            double cube_num;
            double fourth_num;

            System.out.print("Please enter a Number: ");
            num = input.nextDouble();

            input.close();

            square_num = num * num;
            cube_num = square_num * num;
            fourth_num = cube_num * num;

            System.out.printf("\nSquare: %.2f\n", square_num);
            System.out.printf("Cube: %.2f\n", cube_num);
            System.out.printf("Fourth Power: %.2f\n", fourth_num);}}




