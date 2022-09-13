package java_lec1;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        System.out.println("bye, world");
        String s = "     2";
        String n = null;
        System.out.println(s);
        System.out.println(n);

        short age = 10;
        int salary = 123455; // 4 bites
        System.out.println(age);
        System.out.println(salary);
// вещественные числа
        float e = 2.7f; // суффикс f
        double pi = 3.1415;
        System.out.println(e);
        System.out.println(pi);

// символ
        char ch = '1';
        System.out.println(Character.isDigit(ch));
        ch = 'a'; // check if int
        System.out.println(Character.isDigit(ch));
    
// boolean
        boolean flag1 = 123 <= 234;
        System.out.println(flag1);
        boolean flag2 = 123 >= 234;
        System.out.println(flag2);
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);
        boolean f = true && false; // & // \\
        System.out.println(f);
        boolean h = true ^ false; // дизъюнкция, выдает тру, когда одно из значений тру
        System.out.println(h);
       
// switching types
        //int b = 123;
        //double c = b;

// strings
        String mag = "Hello, world!";
        System.out.println(mag); // 1 символ - 2 байта
        
// неявная типизация
        var i = 123; // при компиляции тип данных подставится автоматич.
        var r = 123.456;
        System.out.println(getType(i));
        System.out.println(getType(r));
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();

    }
/* Классы обертки
    примитив - класс обертка (в проге инт - потом значение)
 */ 


}

/*
 * многострочный комментарий
 * базавая единица - класс, в котором есть 
 * 1 метод main, кот. принимает в качестве аргумента
 * массив строк
 */

 // однострочный комментарий 

 /*
  * Типы данных и переменные 
  1. ссылочные (классы, интерфейсы)
  2. примитивные (логические типы данных, мн-венные, 
  вещественные, символьные, числовые)

  тип данных - идентификатор;
  идентификатор = значение;
  */