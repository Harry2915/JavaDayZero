package harish.hibare.javaday;

import java.util.Scanner;

import static harish.hibare.javaday.DayZeroThree.A;
import static harish.hibare.javaday.DayZeroThree.B;

class Test
{
    void display()
    {
        System.out.println("A|B = " + (A | B));
        System.out.println("A&B = " + (A & B)); // program execution using boolean
        System.out.println("!A = " + (!A));
        System.out.println("A^B = " + (A ^ B));
        System.out.println("(A|B)&A = " + ((A | B) & A));
    }
}
public class DayZeroFour extends Test{
    /*
     * Integer
     * Character
     * Float Point
     * Boolean
     * */

    public DayZeroFour() {
        System.out.println("Boolean");
    }

    public static void main(String[] args) {

        DayZeroFour dayZeroFour =new DayZeroFour();
        dayZeroFour.display();

        //Array
        int i=0,a_length,a_lengthin=0;
        Scanner scanner=new Scanner(System.in);
        int test[]= new int[]{1,2,3,4,5,6,7};

        System.out.println("TEST 0 :: " +test[-1]);
        System.out.println("TEST 0 :: " +test[0]);

        System.out.println("Length="+test.length);
        while(a_lengthin!=test.length){
            System.out.println("Enter the value:: "+a_lengthin);
            test[i]=scanner.nextInt();
            System.out.println("value for:: "+a_lengthin+" is "+test[i]);
            i++;
            a_lengthin--;
        }
    }

}
