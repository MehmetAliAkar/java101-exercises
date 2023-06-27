import java.util.Scanner;

public class burcProgrami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int day,month;
        String burc = null;
        boolean isError=true;

        System.out.printf("Doğduğunuz ay : ");
        month= inp.nextInt();

        System.out.printf("Doğduğunuz gun : ");
        day= inp.nextInt();

        switch(month)
        {
            case 1:
                if(day>=1 && day<=31)
                {
                    if(day<22)
                        burc="Oğlak";
                    else
                        burc="Kova";
                }
                else
                    isError=false;
                break;
            case 2:
                if(day>=1 && day<=28)
                {
                    if(day<20)
                        burc="Kova";
                    else
                        burc="Balık";
                }
                else
                    isError=false;
                break;
            case 3:
                if(day>=1 && day<=31)
                {
                    if(day<22)
                        burc="Balık";
                    else
                        burc="Koç";
                }
                else
                    isError=false;
                break;
        }
        if(!isError)
        {
            System.out.println("Hatali giris yaptınız!");
        }
        else
        {
            System.out.println("Burcunuz : "+ burc);
        }
    }
}
