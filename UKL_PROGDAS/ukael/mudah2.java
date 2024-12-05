package ukael;

import java.util.Scanner;


public class mudah2{
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan angka : ");
        int angka = in.nextInt();
        bilanganPrima(angka);

    }

    public static void bilanganPrima(int angka){
   for (int i = 2; i < angka; i++) {
       if (angka % i == 0) {
           System.out.println(angka + " bukan bilangan prima");
           return;
       }
   }
   System.out.println(angka + " bilangan prima");
}
}



