package pr9;

public class TestF {
    public static void main(String[] args) {
        F f = new F();

        System.out.println(f.i);     // строка 1
        System.out.println(f.s);     // строка 2
        f.imethod();                 // строка 3
        f.smethod();                 // строка 4
       // System.out.println(F.i);  // строка 5 — ошибка
        System.out.println(F.s);     // строка 6
       // F.imethod();              // строка 7 — ошибка
        F.smethod();                 // строка 8
    }
}