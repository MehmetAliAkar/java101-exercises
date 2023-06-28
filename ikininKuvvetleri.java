import java.util.Scanner;

public class ikininKuvvetleri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;
        System.out.println("Enter the number : ");
        num= inp.nextInt();
        System.out.println("4'ün kuvvetleri");
        for(int i=0;Math.pow(4,i)<=num;i++)
        {
            System.out.print(Math.pow(4,i)+" ");
        }

        System.out.println("\n5'in kuvvetleri");
        for(int i=0;Math.pow(5,i)<=num;i++)
        {
            System.out.print(Math.pow(5,i)+" ");
        }
    }
}
