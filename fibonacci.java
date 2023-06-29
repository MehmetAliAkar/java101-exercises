import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num1=0,num2=1;
        int newNum;
        int step,count = 0;
        System.out.printf("Step number : ");
        step=inp.nextInt();

        System.out.print(num1 + " "+ num2 + " ");
        for(;count+2<step;count++)
        {
            newNum=num1+num2;
            System.out.print(newNum + " ");
            num1=num2;
            num2=newNum;
        }
    }
}
