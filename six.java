import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        int lastnum = num % 10;
        int firstnum = 0;
        while (num > 0) {
            firstnum = num % 10;
            num /= 10;
        }
        int sum = firstnum + lastnum;
        System.out.println("Сумма первого и последнего числа: " + sum);
    }
}