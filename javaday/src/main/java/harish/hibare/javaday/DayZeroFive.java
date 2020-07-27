package harish.hibare.javaday;
import java.util.Scanner;
public class DayZeroFive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 10;
        int num2 = 20;
        num1+=num1;
        System.out.println("+= :"+num1);
        num1-=num1;
        System.out.println("-= :"+num1);
        num1*=num1;
        System.out.println("*= :"+num1);
        System.out.println("+ : "+ (num1 + num2));
        System.out.println("- : "+ (num1 - num2));
        System.out.println("* : "+ (num1 * num2));
        System.out.println("/ : "+ (num1 / num2));
        System.out.println("% : "+ (num1 % num2));
        System.out.println("++ : "+(num1++));
        System.out.println("-- : "+(num1--));
        System.out.println('H'+"h"+1+4+"hi");
    }
}
