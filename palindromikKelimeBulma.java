import java.util.Scanner;

public class palindromikKelimeBulma {

    static boolean isPolinrome(String word)
    {
        int len = word.length() - 1;
        int i = 0;
        char x;
        while (i < len)
        {
            if (word.charAt(i) != word.charAt(len))
                return false;
            i++;
            len--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word;
        System.out.printf("Kelimeyi giriniz : ");
        word = scan.nextLine();
        if (isPolinrome(word))
            System.out.println("Kelime polindromiktir.");
        else
            System.out.println("Kelime polindromik değildir.");
    }
}
