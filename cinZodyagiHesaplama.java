import java.util.Scanner;

public class cinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;
        System.out.printf("Doğum yılı giriniz : ");
        year= inp.nextInt();

        String cinZodyagi = null;
        int kalan = year%12;
        switch(kalan)
        {
            case 0:
                cinZodyagi="Maymun";
                break;
            case 1:
                cinZodyagi="Horoz";
                break;
            case 2:
                cinZodyagi="Köpek";
                break;
            case 3:
                cinZodyagi="Domuz";
                break;
            case 4:
                cinZodyagi="Fare";
                break;
            case 5:
                cinZodyagi="Öküz";
                break;
            case 6:
                cinZodyagi="Kaplan";
                break;
            case 7:
                cinZodyagi="Tavşan";
                break;
            case 8:
                cinZodyagi="Ejderha";
                break;
            case 9:
                cinZodyagi="Yılan";
                break;
            case 10:
                cinZodyagi="At";
                break;
            case 11:
                cinZodyagi="Koyun";
                break;
        }

        System.out.println("Cin zodyağı burcunuz : "+cinZodyagi);
    }
}
