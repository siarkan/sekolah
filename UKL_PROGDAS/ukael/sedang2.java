package ukael;

import java.util.Scanner;

public class sedang2 {
    public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    int jari = 0;
    Double phi = 3.14;
    Double luaspermukaan=0.0;
    System.out.println("masukkan jari-jari : ");
    jari = inputScanner.nextInt();
    
    luaspermukaan(jari, phi, luaspermukaan);
        
    }
    public static void luaspermukaan(int jari, Double phi, Double luaspermukaan) {
        luaspermukaan = 4 * phi * jari * jari;
     
        System.out.println("luas permukaan tabung adalah " + luaspermukaan);
}
}
   

  



    



