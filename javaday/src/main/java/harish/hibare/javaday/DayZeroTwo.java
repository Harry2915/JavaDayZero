package harish.hibare.javaday;

public class DayZeroTwo {
    public static void main(String[] args) {
        int input=5;
        int result=1;
        for (int i=1;i<=input;i++)
        {
            System.out.println("Before "+result+":"+"Value :: "+i);

            result=result*i;

            System.out.println("After "+result+":"+"Value :: "+i);
        }
        System.out.println("Factorial :FOR: "+result);

        int result1=1;
        while(input!=0)
        {
            result1=result1*input;
            input--;
        }
        System.out.println("Factorial :While: "+result);

        int input2=5;
        int result2=3;
        //for loop in terms of while loop
        for (;input2!=input;input2--)
        {
            System.out.println("Before "+result+":"+"Value :: "+input2);

            result2=result2*input2;

            System.out.println("After "+result+":"+"Value :: "+input2);
        }
        System.out.println("Factorial :For: "+result2);
    }
}
