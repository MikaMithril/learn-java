import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("""
                    Calculator App
                    1. Add
                    2. Subtract
                    3. Multiply
                    4. Divide
                    5. Exit

                    Please enter your option
                    """);
            int user_choice = scanner.nextInt();

            switch (user_choice) {
                case 1:
                    System.out.println("Give first number");
                    int x = scanner.nextInt();
                    System.out.println("Give second number");
                    int y = scanner.nextInt();
                    System.out.println("Output: " + add(x, y));
                    break;
                case 2:
                    System.out.println("Give first number");
                    x = scanner.nextInt();
                    System.out.println("Give second number");
                    y = scanner.nextInt();
                    System.out.println("Output: " + subtract(x, y));
                    break;
                case 3:
                    System.out.println("Give first number");
                    x = scanner.nextInt();
                    System.out.println("Give second number");
                    y = scanner.nextInt();
                    System.out.println("Output: " + multiply(x, y));
                    break;
                case 4:
                    System.out.println("Give first number");
                    x = scanner.nextInt();
                    System.out.println("Give second number");
                    y = scanner.nextInt();
                    System.out.println("Output: " + divide(x, y));
                    break;
                    case 5:
                    System.exit(0);
                default: System.err.println("Please enter valid data");
            }
        }
    }

    private static int add(int x, int y) {
        return (x + y);
    }

    private static int subtract(int x, int y) {
        return (x - y);
    }

    private static int multiply(int x, int y) {
        return (x * y);
    }

    private static int divide(int x, int y) {
        return (x / y);
    }
}
