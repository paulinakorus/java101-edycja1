package w2.Zadania.paulinakorus;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        System.out.println("Zadanie 7");

        int liczba, suma=0, licznik=0;
        Scanner bufor = new Scanner(System.in);

        do{
            System.out.println("Podaj liczbę całkowitą");
            System.out.print("  liczba: ");

            liczba = bufor.nextInt();
            suma+=liczba;
            licznik++;
        }while(liczba>100);
        System.out.println("\nZakończenie programu");
        System.out.println("Średnia arytmetyczna: " + ((double)suma)/licznik);
    }
}
