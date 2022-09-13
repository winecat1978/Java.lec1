package java_lec1;
import java.util.Scanner;
public class terminal {
    public static void main(String[] args) {
        // Получение данных из терминала
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        System.out.println();
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt(); // проверка
        System.out.println(flag);
        int x = iScanner.nextInt();
        System.out.println(x);
        iScanner.close();

    }
    
}
