package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.
        // Sıfır ise sıfır yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi = oku.nextInt();

        if(sayi<0)

            System.out.println("Sayi negatiftir");


        if(sayi>0)

            System.out.println("Sayi pozitiftir");


        if(sayi==0)

            System.out.println("Sayi sifira esittir");




    }
}
