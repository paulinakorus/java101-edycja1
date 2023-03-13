package w2.Zadania.paulinakorus;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println("Zadanie 4");
        System.out.print("\n");
        System.out.println("Kwartały");
        System.out.println("Podaj liczbę całkowita 1-12");
        System.out.print("  liczba: ");

        int liczba1;
        Scanner bufor = new Scanner(System.in);
        liczba1 = bufor.nextInt();

        switch (liczba1){
            case 1, 2, 3:
                System.out.println("Pierwszy kwartał");
                break;
            case 4, 5, 6:
                System.out.println("Drugi kwartał");
                break;
            case 7, 8, 9:
                System.out.println("Trzeci kwartał");
                break;
            case 10, 11, 12:
                System.out.println("Czwarty kwartał");
                break;
            default:
                System.out.println("Liczba spoza zakresu");
                break;
        }
        System.out.print("\n");

        System.out.println("Dzień tygodnia");
        System.out.print("  liczba: ");
        int liczba2 = bufor.nextInt();

        String wynik = switch (liczba2){
            case 1:
                yield "Poniedziałek";
            case 2:
                yield "Wtorek";
            case 3:
                yield "Środa";
            case 4:
                yield "Czwartek";
            case 5:
                yield "Piątek";
            case 6:
                yield "Sobota";
            case 7:
                yield "Niedziela";
            default:
                yield "Liczba spoza zakresu";
        };
        System.out.println(wynik);

        bufor.close();
    }
}
