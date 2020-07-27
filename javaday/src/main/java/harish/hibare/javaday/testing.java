package harish.hibare.javaday;
import java.util.Scanner;
public class testing {

    static double factorial(int n)
    {

        double result;
        if(n==1|n==0){
            return 1;

        }

        result= factorial(n-1)* n;
        return result;


    }

    static void example ()
    {
        int input = 0;
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        try {


            input = sc.nextInt();
            if (input < 0)
                System.out.println(" Enter positive Number");
            else {

                System.out.println("Factorial of " + input + " is :" + factorial(input));
            }


            System.out.println("Do u want to continue??(1/0)");
            ch = sc.nextInt();

        } catch (Exception e) {
            System.out.println("Enter valid number");
        }
        ;
        if (ch == 1)
            example();
        else
            System.exit(0);


    }
    public static void main(String[] args) {
        example();



    }

}
