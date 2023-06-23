import java.util.Scanner;
public class kdvHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat,kdvliFiyat,kdvTutari;

        System.out.print("Ürün ücretini giriniz : ");
        fiyat = input.nextDouble();

        if(fiyat >= 1000)
        {
            kdvliFiyat=fiyat*1.18;
            kdvTutari=kdvliFiyat-fiyat;
        }
        else
        {
            kdvliFiyat=fiyat*1.08;
            kdvTutari=kdvliFiyat-fiyat;
        }

        System.out.println("KDV'siz Fiyat = "+fiyat);
        System.out.println("KDV'li  Fiyat = "+kdvliFiyat);
        System.out.println("KDV tutari    = " + kdvTutari);
    }
}
