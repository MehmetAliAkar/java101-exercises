import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ucakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe,yas,yolculukTipi;
        double toplamFiyat;

        System.out.printf("Mesafeyi giriniz : ");
        mesafe = input.nextInt();
        toplamFiyat=mesafe*0.10;

        System.out.printf("Yaşınızı giriniz : ");
        yas = input.nextInt();
        if(yas >= 0)
        {
            if(yas<12)
            {
                toplamFiyat=toplamFiyat*0.5;
            }
            else if(yas >=12 && yas <=24)
            {
                toplamFiyat*=0.9;
            }
            else if(yas>=65)
            {
                toplamFiyat*=0.7;
            }
            else
                toplamFiyat=toplamFiyat;
        }
        else
        {
            System.out.printf("Hatali giris yaptınız");
        }

        System.out.printf("Yolculuk tipi seçiniz : (1=>tek yön 2=> gidiş dönüş)");
        yolculukTipi=input.nextInt();

        if(yolculukTipi==2)
        {
            toplamFiyat*=0.8;
            toplamFiyat*=2;
        }

        System.out.println("Ödemeniz gereken toplam tutar : "+toplamFiyat);
    }
}
