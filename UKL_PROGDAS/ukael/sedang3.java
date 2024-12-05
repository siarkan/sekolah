package ukael;

import java.util.Random;
import java.util.Scanner;

public class sedang3 {
    public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    
    String[] operator = {"+", "-", "x", "%", "/"};
    Random rand = new Random();
    int hasil = 0;
    
   
        int bil1 = rand.nextInt(20) + 1;
        int bil2 = rand.nextInt(20) + 1;
        
        int op = rand.nextInt(operator.length); 
    
    

            while (true) { 
                switch (operator[op]) {
                    case "+":
                        hasil = bil1 + bil2;
                        break;
                    case "-":
                        hasil = bil1 - bil2;
                        break;
                    case "x":
                        hasil = bil1 * bil2;
                        break;
                    case "%":
                        hasil = bil1 % bil2;
                        break;
                    case "/":
                        hasil = bil1 / bil2;
                        break;
                }
                System.out.println((bil1 + operator[op] + bil2 )  );
                System.out.println("masukkan Jawaban : ");
                 int jawaban = inputScanner.nextInt();
                 int totaljawaban = 0;
                 totaljawaban++;
                 int jawabanbenar = 0;
            
                if (jawaban == hasil) {
                    System.out.println("Jawaban Benar");
                    jawabanbenar++;
            
                } else {
                    System.out.println("Jawaban Salah");
                    System.out.println("jawaban yang benar adalah : "+hasil);
                }
    
                System.out.println("apakah anda ingin melanjutkan? (y/n) : ");
                String lanjut = inputScanner.next();
                if (lanjut.equals("y")) {
                    bil1 = rand.nextInt(20) + 1;
                    bil2 = rand.nextInt(20) + 1;
                    
                    op = rand.nextInt(operator.length); 
                } else {
                    System.out.println("Terima Kasih");
                    System.out.println("Jawaban benar : "+jawabanbenar);
                    System.out.println("Jumlah soal yang dijawa : "+totaljawaban);
                    System.out.println("Skor anda : "+(jawabanbenar*10));
                }
            }
            
               
               
        }
        
    }
   

  



    


