package SayiTahminOyunu;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(10);


        Scanner scan = new Scanner(System.in);
        int numFromUser=0;
        int count = 0;
        while (count < 5) {
            System.out.println("Sayıyı tahmin ediniz : ");
            numFromUser = scan.nextInt();
            if (randomNum == numFromUser) {
                break;
            }
            else {
                System.out.println("Tekrar deneyiniz");
            }
            count++;
        }
        if (count == 5)
            System.out.println("Kaybettiniz");
        else
            System.out.println("Tebrikler, kazandınız!");
    }
}
