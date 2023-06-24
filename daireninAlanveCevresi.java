import java.util.Scanner;

public class daireAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yaricapi giriniz : ");
        int r=input.nextInt();

        double alan = 3.14*r*r;
        double cevre = 2*3.14*r;

        System.out.println("Dairenin alanı : "+alan);
        System.out.println("Dairenin çevresi : "+cevre);
    }
}
