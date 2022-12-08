import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner mec = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            n = mec.nextInt();
            if (n % 4 == 0) {  //4'ün katları zaten 2'ninde katıdır.
                total += n;
            }

        } while (n % 2 == 0);
        System.out.println("Toplam: " + total);
    }
}