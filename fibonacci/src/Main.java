import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        int elemanSayisi;
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serinizin eleman sayısını giriniz : ");
        elemanSayisi = input.nextInt();

        int total = 0, total1 = 1, total2 = 0, sayac = 1;

        System.out.print(total + " "); // 0
        System.out.print(total1 + " "); // 1

        while(sayac > 0){

            total2 = total + total1;
            System.out.print(total2 + " ");
            total = total2;
            total2 = total + total1;
            System.out.print(total2 + " ");
            total1 = total2;
            sayac++;
            if(sayac == (elemanSayisi - 4)){
                break;
            }
        }
    }
}