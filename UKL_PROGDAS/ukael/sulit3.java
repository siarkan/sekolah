package ukael;

import java.util.Scanner;

public class sulit3{
    public static void main(String[] args) {

    
                int[] array;
        
                System.out.println("Elemen duplikat dan frekuensi terbanyak :");
                boolean Duplikat = false;
                Scanner i = new Scanner(System.in);
                System.out.println("Masukkan panjang array: ");
                int panjang = i.nextInt();
                array = new int[panjang];
                for (int j = 0; j < array.length; j++) {
                    System.out.println("Masukkan elemen ke-" + (j + 1) + ": ");
                    array[j] = i.nextInt();
                }
        
                Frekuensi(array);
            }
        
            public static void Frekuensi(int[] array) {
                int maxFrek = 0;
                int indks = 0;
                System.out.println("Elemen duplikat dan frekuensinya:");
                boolean Duplikat = false;
        
                for (int i = 0; i < array.length; i++) {
                    int frekuensi = 0;
                    boolean sudahDihitung = false;
                    for (int j = 0; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            frekuensi++;
                        }
                    }
        
                    if (frekuensi > maxFrek) {
                        maxFrek = frekuensi;
                        indks = i;
                        Duplikat = true;
                    }
        
                }
        
                if (Duplikat) {
                    System.out.println("Elemen yang muncul terbanyak adalah " + array[indks] + " sebanyak " + maxFrek + " kali");
                }
        
                if (!Duplikat) {
                    System.out.println("Tidak ada elemen duplikat");
                }
            }
     
    }
   

    
    
    
    

 





