import java.util.Scanner;

public class leo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l,b,area;
        System.out.print("Enter the length of Rectangle : ");
        l=sc.nextInt();
        System.out.print("Enter the breadth of Rectangle : ");
        b=sc.nextInt();
        area=l*b;
        System.out.print("The area of the rectangle = "+area);
    }
}