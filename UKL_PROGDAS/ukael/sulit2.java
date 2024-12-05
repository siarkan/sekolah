package ukael;
import java.util.Scanner;
public class sulit2 {
    public static void main(String[] args) {
        System.out.println("Sistem validasi angka negatif dalam array");
        Scanner input = new Scanner(System.in);

        int [] angka = new int[12 ];


        for(int i = 1; i < 15; i++){
            System.out.println("masukkan angka ke - "+i);
            angka[i] = input.nextInt();
        }
        
        System.out.println("elemen mengandung negatif :");
        for(int i = 1; i < angka.length; i++){
            for(int j = 1; j < angka.length; j++){
                if (angka[j] == -i){ {
                    System.out.print(-i+", ");
                    break;
                }
        }

    }
}
}}



