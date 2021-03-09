import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator {
    public static void main(String []args)
    {
        System.out.println("1.Factorial   2.NaturalLog  3.Power  4.Squareroot  5.exit");
        while(true) {
            System.out.println("Please select an option:");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a number");
                    int a = scanner.nextInt();
                    Factorial f = new Factorial();
                    f.factorial(a);
                    break;
                case 2:
                    System.out.println("Enter a number");
                    int b = scanner.nextInt();
                    NaturalLog n = new NaturalLog();
                    n.log(b);
                    break;
                case 3:
                    System.out.println("Enter two numbers");
                    int c = scanner.nextInt();
                    int d = scanner.nextInt();
                    Power p = new Power();
                    p.power(c, d);
                    break;
                case 4:
                    System.out.println("Enter a number");
                    int e = scanner.nextInt();
                    SquareRoot s = new SquareRoot();
                    s.sroot(e);
                    break;
                case 5:
                    exit(0);
                default:
                    System.out.println("Invalid input!");

            }
        }
    }
}
