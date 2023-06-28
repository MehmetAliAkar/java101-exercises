import java.util.Scanner;

public class ciftBulma {
    public static void main(String[] args) {
        int num,sum=0,count=0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Sayı giriniz : ");
        num=input.nextInt();
        for(int i=0;i<=num;i++)
        {
            if(i%3==0 && i%4==0)
            {
                sum+=i;
                count++;
            }
        }
        System.out.println("Sayıların ortalaması : "+(sum/count));
    }
}
