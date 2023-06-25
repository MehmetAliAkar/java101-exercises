import java.util.Scanner;

public class aktiviteTavsiye {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sicaklik;
        System.out.print("Sicaklik giriniz : ");
        sicaklik=inp.nextByte();

        if (sicaklik<-5)
        {
            System.out.printf("Kayak");
        }
        else if(sicaklik >= -5 || sicaklik<=25)
        {
            if(sicaklik<=15)
            {
                System.out.printf("Sinema");
            }
            if(sicaklik>=10)
                System.out.printf("Piknik");
        }
        else
        {
            System.out.println("Yüzme");
        }
    }
}
