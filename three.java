import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner go = new Scanner(System.in);
        System.out.println("Введите любое слово:");
        String em = go.nextLine();
        System.out.println("Введите любое слово:");
        String me = go.nextLine();
        if (em.equals(me)) {
            System.out.println("Строки равны");
        }else{
            System.out.println("Строки не равны");
        }

    }
}
