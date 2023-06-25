import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adı giriniz : ");
        userName = input.nextLine();

        System.out.printf("Şifrenizi giriniz : ");
        password = input.nextLine();

        if(userName.equals("patika")&& password.equals("java123"))
        {
            System.out.printf("Başarıyla kullanıcı girişi yapildi!");
        }
        else
        {
            System.out.println("Kullanıcı girişi sağlanamadi!");
        }
    }
}
