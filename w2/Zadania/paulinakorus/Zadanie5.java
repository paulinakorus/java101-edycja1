package w2.Zadania.paulinakorus;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        System.out.println("Zadanie 5");
        System.out.println("Podaj liczbę dodatnią całkowitą");
        System.out.print("  liczba: ");

        int n;
        Scanner bufor = new Scanner(System.in);
        n = bufor.nextInt();

        if(n>0){
            for(int i=1; i<=n; System.out.print(i++ + " "));
            System.out.print("\n");

            for(int i=n; i>=1; System.out.print(i-- + " "));
            System.out.print("\n");

            for(int i=1; i<=n; i++) {
                if (i % 3 == 0 || i % 5 == 0)
                    System.out.print(i + " ");
            }System.out.print("\n");

            for(int i=1; i<=n; i++) {
                if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0))
                    System.out.print(i + " ");
            }System.out.println("\n");
        }
    }
}
