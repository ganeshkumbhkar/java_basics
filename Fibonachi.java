import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num= sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2; i<=num; i++){
            int next=a+b;
           a=b;
           b=next;
    
            System.out.println(b);
        }
    }
}
