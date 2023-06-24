import java.util.Scanner;

public class hipotenusHesaplama {
    public static void main(String[] args) {
        int kisaKenar,uzunKenar;
        double hipo;

        Scanner input = new Scanner(System.in);

        System.out.println("Kısa kenar uzunluğunu giriniz : ");
        kisaKenar = input.nextInt();

        System.out.println("Uzun kenar uzunluğunu giriniz : ");
        uzunKenar = input.nextInt();

        hipo = Math.sqrt((kisaKenar*kisaKenar)+(uzunKenar*uzunKenar));
        double cevre = kisaKenar+uzunKenar+hipo;
        double u = cevre/2;
        double alan = u*(u-kisaKenar)*(u-uzunKenar)*(u-hipo);

        System.out.println("Hipotenus : "+hipo+" cevre : "+cevre+" alan : "+alan);
    }
}
