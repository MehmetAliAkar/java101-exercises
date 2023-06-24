import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int TAKSIACILIS = 10;
        System.out.print("Kac km gittiğini gir : ");
        int km = input.nextInt();
        double ucret = km*2.2 + TAKSIACILIS;

        if (ucret <=20)
            System.out.println("Odemeniz gereken ucret 20 TL dir");
        else
            System.out.println("Ödemeniz gereken ucret : "+ucret);
    }
}
