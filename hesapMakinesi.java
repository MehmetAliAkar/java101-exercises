import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int num1,num2;
        char islem;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayiyi giriniz : ");
        num1= input.nextInt();

        System.out.print("İkinci sayiyi giriniz : ");
        num2= input.nextInt();

        System.out.print("Yapmak istediginiz islemi seciniz : ");
        islem=input.next().charAt(0);

        switch(islem)
        {
            case '+':
                System.out.println("Girdiğiniz sayilarin toplami : "+(num1+num2));
                break;
            case '-':
                System.out.println("Girdiğiniz sayilarin farki : "+(num1-num2));
                break;
            case '*':
                System.out.println("Girdiğiniz sayilarin carpimi : "+(num1*num2));
                break;
            case '/':
                System.out.println("Girdiğiniz sayilarin bolümü : "+(num1/num2));
                break;
            default:
                System.out.println("Lütfen gecerli bir islem giriniz!");
        }
    }
}
