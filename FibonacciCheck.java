import java.util.Scanner;

public class FibonacciCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int number) {
        int num1 = 0, num2 = 1;
        while (num1 <= number) {
            if (num1 == number) {
                return true;
            }
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return false;
    }
}