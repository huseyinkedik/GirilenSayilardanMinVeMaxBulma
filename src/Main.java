import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı girişi yapılacak: ");
        int n = input.nextInt();

        //Döngüyü 1 olarak başlatıyoruz
        int c = 1;

        System.out.print(" 1 nolu sayıyı giriniz: ");
        int ilkDeger = input.nextInt();
        int enBuyukSayi = ilkDeger;
        int enKucukSayi = ilkDeger;

        {
            while (c < n) {
                System.out.print(c + 1 + ". nolu sayıyı giriniz: ");
                int yenideger = input.nextInt();

                if (yenideger > enBuyukSayi) {
                    enBuyukSayi = yenideger;
                } else {
                    enKucukSayi = yenideger;
                }
                c++;
            }
            System.out.println("En büyük sayı: " + enBuyukSayi);
            System.out.println("En küçük sayı: " + enKucukSayi);
        }
    }
}