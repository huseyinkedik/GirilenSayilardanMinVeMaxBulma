import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı girişi yapılacak: ");
        int n = input.nextInt();
        int c = 1;
        System.out.print(" 1 nolu sayıyı giriniz: ");
        int ilkDeger = input.nextInt();
        int enBuyukSayi = ilkDeger;

        int enKucukSayi;
        for(enKucukSayi = ilkDeger; c < n; ++c) {
            System.out.print(c + 1 + ". nolu sayıyı giriniz: ");
            int a = input.nextInt();
            if (a > enBuyukSayi) {
                enBuyukSayi = a;
            } if (a < enKucukSayi){
                enKucukSayi = a;
            }
        }

        System.out.println("En büyük sayı: " + enBuyukSayi);
        System.out.println("En küçük sayı: " + enKucukSayi);
    }
}
