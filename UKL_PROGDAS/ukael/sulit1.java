package ukael;

import java.util.Scanner;
public class sulit1 {
    public static void main(String[] args) {
        System.out.println("Sistem rekap absen kehadiran siswa");
        Scanner input = new Scanner(System.in);
        int frek = 0;
       
        int maxfrek = 0;
        int indks = 0;

        Double totalabsen = 0.0, rataKehadiran = 0.0;


        System.out.println("masukkan jumlah siswa : ");
        int jumlahSiswa = input.nextInt();
        int[] absenSiswa = new int[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("masukkan jumlah absen siswa ke - " + (i + 1) + " : ");
            absenSiswa[i] = input.nextInt();
            frek = absenSiswa[i];
            

            totalabsen += absenSiswa[i];
        }
        rataKehadiran = totalabsen / jumlahSiswa;
        System.out.println("rata-rata kehadiran dari " + jumlahSiswa + " siswa adalah " + rataKehadiran);

        System.out.println("Kesimpulan : ");
        System.out.println("- Siswa yang kehadirannya diatas rata rata");
        for (int j = 0; j < absenSiswa.length; j++) {

            
            frek = absenSiswa[j];
            if (frek > maxfrek) {
                maxfrek = frek;
                indks = j;
            }
        }
        System.out.print("  ");
        System.out.print("- Siswa ke-" + (indks ) + " (" + absenSiswa[indks] + ")");
        

     
    }
}



