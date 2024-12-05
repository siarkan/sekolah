package ukael;

import java.util.Scanner;

public class sedang1 {
    public static void main(String[] args) {
        System.out.println("Tabungan Uang Saya");
        int uang = 100000;
        int totaltabungan = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("note : setiap bulan uang tabungan mengalami kenaikan 50000");
        System.out.println("ingin menabung selama berapa bulan? ");
        int bulan = input.nextInt();
        for (int i = 1; i <=bulan ; i++) {
            System.out.println("bulan ke - " + i + " uang saya sekarang " + uang + " rupiah");
            uang += 50000;
            totaltabungan += uang;
            
            }
            System.out.println("total tabungan saya selama " + bulan + " bulan adalah " + totaltabungan + " rupiah");
}
}
