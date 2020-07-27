package harish.hibare.javaday;

import java.util.InputMismatchException;
import java.util.Scanner;

class logic{                                                                                        //parent class
    static long n;

    public static boolean isPrime(int num) {

        if (num == 2 || num == 3) {
            //System.out.println(+num+" ::Is prime number\n");
            return true;
        }

        else if (num % 2 == 0 || num % 3 == 0) {
            //System.out.println(+num+" ::Is not prime number\n");
            return false;
        }

        else
            for (int i = 3; i < Math.sqrt(num); i += 2) {
                if (num % Math.sqrt(num) == 0 || num % i == 0) {
                    //System.out.println(+num+" ::Is not prime number\n");
                    return false;
                }
            }

        //System.out.println(+num+" ::Is prime number\n");
        return true;
    }
}


class rec extends logic{                                                                            //child class1
    static long sum;
    static int ch;
    static void example(){
        Scanner s = new Scanner(System.in);


        System.out.println("\nEnter the Number till where you want to check sum of prime numbers");

        try {
            n = s.nextInt();


        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (isPrime(i))
                    sum = sum + i;
            }

            System.out.println("\nSum of prime number's between 2-" + n + ":: " + sum + "\n");
            sum=0;
            ch=0;

        } else {
            System.out.println("\nPlease enter number greater than 1\n");
            example();                                                                              //Recersive call
        }
        } catch (InputMismatchException e) {
            System.out.println("\nPlease Enter Integer Value\n");
            example();                                                                               //Recersive call
        }
    }
}



class c extends rec{                                                                                //child class2
    static int ch2;

    public c(){                                                                                     //constructor
        Scanner s = new Scanner(System.in);
        while(ch==0){
            switch (ch) {
                case 0:
                    System.out.println("Do you want to continue?\n1.Press 1 for yes\n2.Press 2 for exit\n");

                    try {
                        ch = s.nextInt();


                    if (ch == 1 || ch == 2)
                        ch2 = ch;

                    else {
                        System.out.println("\nPlease enter correct input\n");
                        ch2 = 0;
                    }
                    }
                    catch (InputMismatchException e) {
                        System.out.println("\nPlease enter correct input..\n");
                        return;
                    }

                    switch (ch2) {                                                                  //Nasted switch case
                        case 0:
                            ch = 0;
                            break;
                        case 1:
                            example();
                            break;
                        case 2:
                            System.out.println("Thankyou!!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Unexpected value: " + ch2 + "\n");
                            break;
                    }
                    break;
                default:
                    System.out.println("Unexpected value: " + ch + "\n");
                    break;
            }
        }
    }
}


public class PrimeNo extends c {                                                                     //child class3

    public static void main(String[] args) {
        example();
        while (ch == 0) {
            c c = new c();
        }

    }

}


