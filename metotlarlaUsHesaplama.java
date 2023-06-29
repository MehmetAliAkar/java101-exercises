import java.util.Scanner;

public class metotlarlaUsHesaplama {

    static int pow(int base,int pow)
    {
        if(pow==0)
            return 1;
        return pow(base,pow-1)*base;
    }

    public static void main(String[] args) {
        int pow,base;
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter the base :");
        base=inp.nextInt();

        System.out.printf("Enter the power :");
        pow=inp.nextInt();

        System.out.println(base + " base"+pow+" pow "+pow(base,pow) );
    }
}
