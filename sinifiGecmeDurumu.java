import java.util.Scanner;

public class sinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fiz,kimya,turkce,muzik;
        int dersSayisi=5;

        System.out.printf("Mat notunu giriniz : ");
        mat=input.nextInt();
        if(mat>=100 || mat<=0)
        {
            mat=0;
            dersSayisi--;
        }

        System.out.printf("Fizik notunu giriniz : ");
        fiz=input.nextInt();
        if(fiz>=100 || fiz<=0)
        {
            fiz=0;
            dersSayisi--;
        }

        System.out.printf("Kimya notunu giriniz : ");
        kimya=input.nextInt();
        if(kimya>=100 || kimya<=0)
        {
            kimya=0;
            dersSayisi--;
        }

        System.out.printf("Turkce notunu giriniz : ");
        turkce=input.nextInt();
        if(turkce>=100 || turkce<=0)
        {
            turkce=0;
            dersSayisi--;
        }

        System.out.printf("Muzik notunu giriniz : ");
        muzik=input.nextInt();
        if(muzik>=100 || muzik<=0)
        {
            muzik=0;
            dersSayisi--;
        }

        double ort=(fiz+mat+turkce+muzik+kimya)/dersSayisi;
        System.out.println("ders sayisi : "+dersSayisi);

        if(ort>=55){
            System.out.println("Sinifi gectiniz!");
            System.out.println("Ortalamanız : "+ort);}
        else
        {
            System.out.println("Sinifi geçemediniz!");
            System.out.println("Ortalamanız : "+ort);}
        }
    }

