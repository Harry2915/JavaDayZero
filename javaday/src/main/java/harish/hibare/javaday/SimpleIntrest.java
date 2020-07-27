package harish.hibare.javaday;

public class SimpleIntrest {
    public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            System.out.println(+num+" ::Is prime number\n");
            return true;
        }
        else if (num % 2 == 0 || num % 3 == 0) {
            System.out.println(+num+" ::Is not prime number\n");
            return false;
        }
        else
            for (int i = 3; i < Math.sqrt(num); i += 2) {
                if (num % Math.sqrt(num) == 0 || num % i == 0) {
                    System.out.println(+num+" ::Is not prime number\n");
                    return false;
                }
            }
        System.out.println(+num+" ::Is prime number\n");
        return true;
    }
    public static void main(String[] args) {
        int sum=0;
        for (int i = 2; i <= 100; i++)
        {
            if (isPrime(i))
                sum=sum+i;
        }
        System.out.println("\nSum of prime number's between 1-100:: "+sum);
    }
}