package java_lec1;

public class vivod {
    public static void main(String[] args) {
        String s = "qwe";
        int a = 123;
        String q = s + a;
        System.out.println(q);

        int b = 1, c = 2;
        int d = b + c;
        String res = c + "+" + b + " = " + d;
        System.out.println(res);

        String res1 = String.format("%d + %d = %d \n", b,c,d);
        System.out.println(res1);

        /*
         * Виды спецификаторов (маски):
         * %d целочисленные значения
         * %x 16-чные числа
         * %f с плавающей точкой
         * %e экспоненциальная форма
         * %c одиночный символ
         * %s строковые значения
         */

         // Область видимости переменных "{}" 

        

    }
    
}
