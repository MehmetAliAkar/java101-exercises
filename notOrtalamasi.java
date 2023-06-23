import java.util.Scanner;

public class notOrtalamasi
{
    public static void main(String[] args) {
        int mat,fiz,kimya,turkce,tarih,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        double ort = (mat+kimya+muzik+fiz+tarih+turkce)/6;

        System.out.println("Ortalamaniz : "+ort);

        if (ort>60)
            System.out.println("Gectiniz.");
        else
            System.out.println("Kaldınız.");
    }
}
