package java_lec1;
import java.util.Scanner;
public class functions {
    public static void mam(String[] args) {
       sayHi(); 
    }
    static void sayHi()
    {
        System.out.println("hi");
    }
    


// we can do it through the Lib file
// управляющие конструкции

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
        // Тернарный оператор
        int d = 1;
        int f = 2;
        int min = d < f ? d : f; // если то, что до ? выполняется,
        // то возвращается то, что после ?
        System.out.println(min);
        // Оператор выбора
        /*
         * switch (a) {
         * case 1: syso("a");
         * break;
         * case 10: sys("a");
         * break;
         * default: ...
         * }
         */

        // Циклы (while, do while, for, for in)

        int value = 321;
        int count = 0;
        while(value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
        
        for (int i = 0; i < 10; i++) {
            if(i%2 != 0) 
                continue; // перекидывает обратно в цикл for
            System.out.println(i);
        }
        int [] arr = new int []{1,2,3,4,5,77};
        for (int item : arr) {
            System.out.println(item);
        }
        

    }
}