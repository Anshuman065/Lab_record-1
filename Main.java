import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a :");
        a=sc.nextInt();
        System.out.println("Enter the value of b :");
        b=sc.nextInt();
        System.out.println((a<<2)+(b>>2));
        System.out.println(b>0);
        System.out.println((a+b*100)/10);
        System.out.println(a&b);

    }
}
