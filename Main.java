import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, toplam = 0, m = 0, ort;
        Scanner mec = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        k = mec.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 12 == 0) {
                System.out.println(i);
                toplam = i + toplam;
                m++;
            }
        }
        ort = toplam / m;
        System.out.println("Ortalama: " + ort);
    }
}