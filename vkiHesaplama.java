import java.util.Scanner;

public class vucutKitleIndexi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy=input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo=input.nextDouble();

        double vki = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+vki);
    }
}
