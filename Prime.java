import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.println("enter num");
        int num= sc.nextInt();
        boolean isPrime=true;
        if(num<2)
        {
            System.out.println("num is not prime");
            return;
        }
        for(int i=2; i<=Math.sqrt(num); i++)
        {
            if(num % i ==0)

            {
                isPrime=false;
            }
        }

        if(isPrime)
        {
            System.out.println("prime nu");
        }
        else{
            System.out.println("not prime ");
        }
    }
}
