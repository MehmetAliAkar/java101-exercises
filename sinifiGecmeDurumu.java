import java.util.Scanner;

public class sinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fiz,kimya,turkce,muzik;

        System.out.printf("Mat notunu giriniz : ");
        mat=input.nextInt();

        System.out.printf("Fizik notunu giriniz : ");
        fiz=input.nextInt();

        System.out.printf("Kimya notunu giriniz : ");
        kimya=input.nextInt();

        System.out.printf("Turkce notunu giriniz : ");
        turkce=input.nextInt();

        System.out.printf("Muzik notunu giriniz : ");
        muzik=input.nextInt();

        double ort=(fiz+mat+turkce+muzik+kimya)/5;

        if(ort>=55){
            System.out.println("Sinifi gectiniz!");
            System.out.println("Ortalamanız : "+ort);}
        else
        {
            System.out.println("Sinifi geçemediniz!");
            System.out.println("Ortalamanız : "+ort);}
        }

    }

