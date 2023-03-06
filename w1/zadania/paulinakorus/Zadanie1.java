package w1.zadania.paulinakorus;

public class Zadanie1 {
    public static void main(String[] args){
        int a = 1, b = 2, c = 3, d = 4;
        System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);

        int ab = a+b, cd = c-d;
        System.out.println("ab: " + ab + " cd: " + cd);

        double e = 1.1, f = 2.2, g = 3.3, h = 4.4;
        System.out.println("e: " + e + " f: " + f + " g: " + g + " h: " + h);

        double ef = e*f, gh = g/h;
        System.out.println("ef: " + ef + " gh: " + gh);

        System.out.println("Reszta z dzielenia ab/b: " + ab%b);

        char i = 'A', j = 'a';
        System.out.println(i + j);
        // Da się dodać do siebie dwie zwienne będące charami, wynikiem będzie suma wartości w ASCII

        String k = "Ala", l = "ma";
        System.out.println(k + " " + l);
        // Da się dodać do siebie dwie zmienne będące stringami, wynikiem będzie napis w podanej kolejności

        boolean m = true, n = false;
        System.out.println(m && n);
    }
}
