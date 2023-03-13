package w2.Zadania.paulinakorus;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println("Zadanie 3");
        System.out.println("Podaj trzy całkowite boki");

        Scanner bufor = new Scanner(System.in);
        int[] tablica = new int[3];
        System.out.print("  a: ");
        tablica[0] = bufor.nextInt();
        System.out.print("  b: ");
        tablica[1] = bufor.nextInt();
        System.out.print("  c: ");
        tablica[2] = bufor.nextInt();

        int pom;
        for(int i=0; i<3; i++){
            for(int j=0; j<3-i-1; j++) {
                if (tablica[j] < tablica[j + 1]) {
                    pom = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = pom;
                }
            }
        }

        if(tablica[0] <= tablica[1] + tablica[2]){
            System.out.println("Z podanych boków można utworzyć trójkąt");

            if(Math.pow(tablica[1],2) + Math.pow(tablica[2],2) == Math.pow(tablica[0],2))
                System.out.println("Trójkąt jest prostokątny");
            else if (Math.pow(tablica[1],2) + Math.pow(tablica[2],2) > Math.pow(tablica[0],2))
                System.out.println("Trójkąt jest ostrokątny");
            else
                System.out.println("Trójkąt jest rozwartokątny");

        }else {
            System.out.println("Z podanych boków nie można utworzyć trójkąta");
        }
    }
}

