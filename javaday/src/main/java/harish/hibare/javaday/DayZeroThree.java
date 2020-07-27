package harish.hibare.javaday;

import java.util.*;

public class DayZeroThree {

    static float rsi;
    static boolean A,B;
    int p1,r1,t1;
    public DayZeroThree() {
        System.out.println("Simple Interest Program");
    }

    public DayZeroThree(int p1, int r1, int t1) {
        this.p1 = p1;
        this.r1 = r1;
        this.t1 = t1;
        System.out.println("Current P ::"+p1);
        System.out.println("Current R ::"+r1);
        System.out.println("Current T ::"+t1);
        rsi = (p1 * r1 * t1);
        rsi = rsi / 100;
        System.out.println("SI RENEW VALUE::"+rsi);
    }

    public static void main(String[] args) {
        DayZeroThree dayZeroThree = new DayZeroThree();
        System.out.println("SI RENEW ::"+rsi);

//Basic
        int p = 6, t = 2, r = 3;
        float si;
        si = (p * r * t);
        si = si / 100;
        System.out.println("SI ::" + si);

//Parametrized
        DayZeroThree dayZeroThree1 = new DayZeroThree(60,2,31);
        DayZeroThree dayZeroThree2 = new DayZeroThree(100,3,4);
        DayZeroThree dayZeroThree3 = new DayZeroThree(8,3,12);
        DayZeroThree dayZeroThree4 = new DayZeroThree(7,3,13);

        simInt(p,r,t);
/* Scanner scanner = new Scanner(System.in);
System.out.println("Enter the value of P::");
p=scanner.nextInt();
System.out.println("Enter the value of R::");
r=scanner.nextInt();
System.out.println("Enter the value of T::");
t=scanner.nextInt();
si = (p * r * t);
si = si / 100;
System.out.println("SI NEW ::" + si);*/

    }

    private static void simInt(int p, int r, int t) {
        rsi = (p * r * t);
        rsi = rsi / 100;
        System.out.println("SI RENEW VALUE STATIC::"+rsi);
    }
}
