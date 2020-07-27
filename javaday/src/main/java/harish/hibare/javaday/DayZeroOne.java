package harish.hibare.javaday;

public class DayZeroOne {
    public static void main(String[] args) {
        //string is a class [] for CLI command line interface
        System.out.println("Welcome Developers");
        int a=45;
        int b=35;
        int c=a+b;
        System.out.println("Result:"+c);
        char A='a';
        System.out.println("Char Result:"+A);
        int cc=A; //Type Conversion
        System.out.println("Intiger to Char" +cc);
        //Type Casting
        A=(char) c;
        System.out.println("Val in Char :"+A);
        if (c<50)
        {
            System.out.println("Value of C 1:: " +c+ " Case True");
        }else if (c>100)
        {
            System.out.println("Value of C 2:: " +c+ " Case False");
        }
        else
        {
            System.out.println("Value of C 3:: " +c+ "Case True");
        }

    }
}
