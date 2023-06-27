import java.util.Scanner;

public class buyuktenKucuge {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1,n2,n3;
        System.out.printf("İlk sayiyi giriniz : ");
        n1= inp.nextByte();

        System.out.printf("İkinci sayiyi giriniz : ");
        n2= inp.nextByte();

        System.out.printf("Üçüncü sayiyi giriniz : ");
        n3= inp.nextByte();

        if((n1>n2) && (n1>n3))
        {
            if(n2>=n3)
            {
                System.out.println("n1>n2>n3");
            }
            else
            {
                System.out.println("n1>n3>n2");
            }
        }
        else if((n2>n3) && (n2>n1))
        {
            if(n1>n3)
            {
                System.out.println("n2>n1>n3");
            }
            else
            {
                System.out.println("n2>n3>n1");
            }
        }
        else if((n3>n2) && (n3>n1))
        {
            if(n1>n2)
            {
                System.out.println("n3>n1>n2");
            }
            else
            {
                System.out.println("n3>n2>n1");
            }
        }

    }
}
