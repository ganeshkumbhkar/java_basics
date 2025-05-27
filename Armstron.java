import java.util.Scanner;

public class Armstron {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num");
        int num = sc.nextInt();
        int orignal=num;
        int sum=0;
        while ((num>0)) {
            int digit=num%10;
         sum+=(digit*digit*digit);
         num=num/10;
        }
        if(orignal==sum)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not armstrogn");
        }
    }
}
