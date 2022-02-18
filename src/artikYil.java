import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {

        int yil, kalanYilDort, kalanYilYuz, kalanYilDortYuz;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        kalanYilDort = yil % 4;
        kalanYilYuz = yil % 100;
        kalanYilDortYuz = yil % 400;


        if (kalanYilDort == 0) {
            if (kalanYilYuz == 0) {
                if (kalanYilDortYuz == 0) {
                    System.out.print(yil + " bir artık yıldır !");
                } else {
                    System.out.print(yil + " bir artık yıl değildir !");
                }
            } else {
                System.out.print(yil + " bir artık yıldır !");
            }
        } else {
            System.out.print(yil + " bir artık yıl değildir !");
        }
    }
}