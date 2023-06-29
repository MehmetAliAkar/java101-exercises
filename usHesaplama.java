import java.util.Scanner;

public class usHesaplama {
    public static void main(String[] args) {
        int pow,base,result=1;
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter the base : ");
        base=inp.nextInt();
        System.out.printf("Enter the power : ");
        pow=inp.nextInt();
        while (pow>0)
        {
            result*=base;
            pow--;
        }
        System.out.printf("Result = "+result);
    }
}
