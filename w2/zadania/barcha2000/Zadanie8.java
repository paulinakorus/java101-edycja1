import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        for(int i = 1; i < 101; i += 1){
            if (i % 3 == 0){
                System.out.println(i);
            }
            if (i == 50) {
                break;
            }
        }
    }
}