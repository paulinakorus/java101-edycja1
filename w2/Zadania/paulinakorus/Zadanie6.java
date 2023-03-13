package w2.Zadania.paulinakorus;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        System.out.println("Zadanie 6");

        int liczba=-1, suma=0;
        Scanner bufor = new Scanner(System.in);

        while(liczba!=0){
            System.out.println("Podaj liczbę całkowitą");
            System.out.print("  liczba: ");
            liczba = bufor.nextInt();
            suma += liczba;
        }
        System.out.println("\nZakończenie programu");
        System.out.println("Suma: " + suma);
    }
}
