import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator {
    public static void main(String []args)
    {

        while(true) {
            System.out.println("1.Factorial   2.NaturalLog  3.Power  4.Squareroot  5.exit");
            System.out.println("Please select an option:");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a number");
                    int a = scanner.nextInt();
                    Factorial f = new Factorial();
                    System.out.println(f.factorial(a));
                    break;
                case 2:
                    System.out.println("Enter a number");
                    int b = scanner.nextInt();
                    NaturalLog n = new NaturalLog();
                    System.out.println(n.log(b));
                    break;
                case 3:
                    System.out.println("Enter two numbers");
                    double c = scanner.nextDouble();
                    double d = scanner.nextDouble();
                    Power p = new Power();
                    System.out.println(p.power(c, d));
                    break;
                case 4:
                    System.out.println("Enter a number");
                    int e = scanner.nextInt();
                    SquareRoot s = new SquareRoot();
                    System.out.println(s.sroot(e));
                    break;
                case 5:
                    exit(0);
                default:
                    System.out.println("Invalid input!");

            }
        }
    }
}
