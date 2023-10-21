import java.util.Scanner;
public class dva {
    public static void main(String[] args) {
        Scanner go = new Scanner(System.in);
        System.out.println("Введите любое число:");
        int em = go.nextInt();
        if (em < 0) {
            System.out.println("Число отрицательное");
        }else{
            System.out.println("Число положительно либо равно нулю");
        }






    }
}
