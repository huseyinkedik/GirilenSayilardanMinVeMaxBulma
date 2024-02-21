import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,a,b;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı girişi yapılacak:");
        n = input.nextInt();
        System.out.println("İlk sayıyı giriniz:");
        int c = 2;
        do {
            a = input.nextInt();
            System.out.println(c + " nolu sayıyı giriniz:");
            b = input.nextInt();
            if (a>b){
                System.out.println("En büyük sayı: " + a);
                System.out.println("En küçük sayı: " + b);
            }else {
                System.out.println("En küçük sayı: " + a);
                System.out.println("En büyük sayı: " + b);
                }
            c++;


        }while (c > n);
    }
}