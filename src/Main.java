import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = sc.nextDouble();
        System.out.println("Enter the Second number");
        double b = sc.nextDouble();
        System.out.println("Enter your choice \n 1) Addition \n 2) Subtraction \n 3) Multiplication \n 4) Division \n 5) Remainder");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                double add = a + b;
                System.out.println("The subtraction is  " + add);
                break;
            case 2:
                double sub = a - b;
                System.out.println("The subtraction is  " + sub);
                break;
            case 3:
                double mul = a * b;
                System.out.println("The subtraction is  " + mul);
                break;
            case 4:
                double div = a / b;
                System.out.println("The subtraction is  " + div);
                break;
            case 5:
                double mod = a % b;
                System.out.println("The subtraction is  " + mod);
                break;
            default:
                System.out.println("wrong choice not in the list ");
        }
            sc.close();

    }
}