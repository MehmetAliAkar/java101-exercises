import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter the number to check it is is perfect number : ");
        num= inp.nextInt();
        int i = 1;
        while(i<num)
        {
            if(num%i==0)
            {
                sum+=i;
            }
            i++;
        }
        if(num==sum)
        {
            System.out.println(num + " is a perfect number.");
        }
        else
        {
            System.out.println(num +" is not a perfect number.");
        }
    }
}
