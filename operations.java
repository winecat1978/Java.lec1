package java_lec1;

public class operations {
    public static void main(String[] args) {
        /*
         * присваивание = 
         * арифм: =.-.*./.%
         * сравнение >/</=>/<=
         * Логические операции \\, &&, ^, !
         * Побитовые операции <<,>>,&,\,^
         */

        int i = 123;
        System.out.println(i++); // 123 постфиксный инкремент
        System.out.println(i); // 124
        int x = 123;
        System.out.println(++x); // 124 префиксный инкремент
        System.out.println(x); // 124       
        
        int a = 123;
        a = --a-a--;
        System.out.println(a);

        boolean f = 123 <= 234;
        System.out.println(f);
// Побитовые операции
        int v = 8;
        // 1000
        //v = v << 1;
        System.out.println(v << 1); // 16 -> 10000
        int r = 18; // 10010
        System.out.println(r >> 1); // 9 -> 1001

        int p = 5;
        int g = 2;

        System.out.println(p | g); //или
        // 101
        // 010
        // 111

        int o = 5;
        int w = 2;

        System.out.println(o & w); //и
        // 101
        // 010
        // 000

        int ab = 5;
        int bf = 2;

        System.out.println(ab ^ bf); //истина когда 1 истина
        // 101
        // 010
        // 111

        boolean ag = true;
        boolean bc = true;
        System.out.println(ag & bc);
        System.out.println(ag && bc);

        //String s = "qwe1"; // 4, 0... 
       // boolean ss = s.length() >= 5 && s.charAt(4) == '1'; 
       // && - fast operation, if one wrong, it doesn't check other
       // & - will check all parts any way
       // || - or & |
       //boolean ss = s.length() >= 5 & s.charAt(4) == '1';
       //System.out.println(ss);

       // Массивы
       // Одномерные массивы:
       int[] arr = new int [10]; // по умлочанию заполняет нулями
       System.out.println(arr[3]);
       

       int[] array = new int[] { 1, 3, 2, 23, 45 };
       System.out.println(array.length); 
        // int[]arr
        // int brr[]
       int[] arrrr = new int[4];
       arrrr[2] = 12;
       System.out.println(arrrr[2]);

       // Многомерные массивы
       int[] Arr[] = new int [3][5];
       for (int[] line : Arr) {
            for (int item : line){
                System.out.printf("%d", item);
            }
            System.out.println();
       }

       // Преобразования
       int ii = 123; double dd = ii;
       System.out.println(dd);
       int oo = 12;
       double pp = 3.1415; oo = (int)pp;
       System.out.println(oo);
       byte dad = Byte.parseByte("123");
       System.out.println(dad);
       dad = Byte.parseByte("1234");
       System.out.println(dad);
    }
    
}
