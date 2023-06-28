import java.util.Scanner;

public class artikYilHesaplama {
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);
        System.out.printf("Yıl giriniz : ");
        year = inp.nextInt();
        boolean leap = false;
        if(year%4==0)
        {
            leap=true;
            if((year%100 ==0))
            {
                if(year%400==0)
                {
                    leap=true;
                }
                else
                {
                    leap=false;
                }
            }
        }

        if(leap==true)
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }
}
