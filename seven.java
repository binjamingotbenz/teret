import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();
        int firstnum1 = 0;
        int firstnum2 = 0;
        while (num1 > 0) {
            firstnum1 = num1 % 10;
            num1 /= 10;
        }
        while (num2 > 0) {
            firstnum2 = num2 % 10;
            num2 /= 10;
        }
        if (firstnum1 == firstnum2) {
            System.out.println("Первые цифры чисел совпадают");
        } else {
            System.out.println("Первые цифры чисел не совпадают");
        }
    }
}