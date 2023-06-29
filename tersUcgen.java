import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int digitNum;
        System.out.printf("Enter the digit num : ");
        digitNum= inp.nextInt();

        for(int i=digitNum;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
