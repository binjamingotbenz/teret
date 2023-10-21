import java.sql.SQLOutput;
import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        Scanner go = new Scanner(System.in);
        System.out.println("Введите любое слово:");
        String em = go.nextLine();
        char end = em.charAt((em.length() - 1));
        char broke = 'ь';
        if (end != broke) {
            System.out.println(end);
        } else {
            end = em.charAt((em.length()) - 2);
            System.out.println(end);


        }
    }
}
