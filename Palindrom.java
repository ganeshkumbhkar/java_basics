import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the num");
    int num= sc.nextInt();
    String st=Integer.toString(num);
    String pali="";
    for(int i=st.length()-1; i>=0; i--)
    {
        char ch=st.charAt(i);
        pali+=ch;

    }
    if(pali.equals(st))
    {
  System.out.println("palindrom");
    }
    else{
        System.out.println("not palindrome");
    }
    }
}
