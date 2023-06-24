import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        int armutKilo,elmaKilo,domatesKilo,patlicanKilo,muzKilo;
        double ucret;

        System.out.print("Armut Kaç Kilo ? :");
        armutKilo=input.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKilo=input.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        muzKilo=input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKilo=input.nextInt();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKilo=input.nextInt();

        ucret = (armutKilo*armut)+(domatesKilo*domates)+(muzKilo*muz)+(patlicanKilo*patlican)+(elmaKilo*elma);

        System.out.println("Toplam Tutar : "+ucret+" TL");
    }
}
