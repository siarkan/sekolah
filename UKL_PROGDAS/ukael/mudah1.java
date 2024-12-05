package ukael;
import java.util.Scanner;
public class mudah1{
    public static void main(String[] args) {
        Double totalbelanja =0.0, subtotal = 0.0;  

        Scanner input = new Scanner(System.in);

        System.out.println("masukkan total belanja : ");
        totalbelanja = input.nextDouble();

        if (totalbelanja >= 100000 && totalbelanja <= 200000){
            System.out.println("anda mendapatkan diskon 10%");
            Double diskon = totalbelanja * 0.1;
            totalbelanja -= diskon;
        } else if (totalbelanja > 200000){
            System.out.println("anda mendapatkan diskon 20%");
            Double diskon = totalbelanja * 0.2;
            totalbelanja -= diskon;
        } else {
            System.out.println("anda tidak mendapatkan diskon");
    }

        System.out.println("total belanja : " + totalbelanja);

       
}
}


