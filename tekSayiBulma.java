import java.util.Scanner;

public class tekSayiBulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num,sum=0;
        while(true)
        {
            System.out.printf("Sayıyı giriniz : ");
            num= inp.nextInt();
            if(num%2==0)
            {
                if(num%4==0)
                {
                    sum+=num;

                }
            }
            else
            {
                break;
            }
        }
        System.out.println("Girilen sayılardan 4 e bölünebilenlerin toplamı : "+sum);
    }
}
