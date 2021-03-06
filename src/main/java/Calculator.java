import java.util.Scanner;

public class Calculator {
    public static void main(String []args)
    {
        System.out.println("Enter two numbers:");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        Add a1=new Add();
        Divide d1=new Divide();
        System.out.println(a1.add(a,b));
        System.out.println(d1.divide(a,b));
    }
}
