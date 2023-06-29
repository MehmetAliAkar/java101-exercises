import java.util.Scanner;

public class armstrongSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num,cnum,sum=0;
        int base,pow=0;
        System.out.println("Enter the num to check it Armstrong number or not? : ");
        num=inp.nextInt();
        cnum=num;
        while(num>0)
        {
            num/=10;
            pow++;
        }
        num=cnum;

        while(num>0)
        {
            base=num%10;
            sum+=Math.pow(base,pow);
            num/=10;
        }
        if(cnum==sum)
        {
            System.out.println(cnum+" is an armstrong number.");
        }
        else
        {
            System.out.println(cnum + " is not an armstrong number.");
        }
    }
}
