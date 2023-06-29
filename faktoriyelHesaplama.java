import java.util.Scanner;

public class faktoriyelHesaplama {
    public static void main(String[] args) {
        int num,factorial=1,cnum;
        Scanner inp = new Scanner(System.in);
        System.out.printf("Faktoriyeli alınacak sayıyı giriniz : ");
        num= inp.nextInt();
        cnum=num;
        while (num>0)
        {
            factorial*=num;
            num--;
        }
        System.out.println(cnum + " in faktöriyeli : "+factorial);
    }
}
