import java.util.Arrays;

public class minMaxFinder {
    public static void minMaxFind(int val, int[] arr, int sizeArr){

        Arrays.sort(arr);
        int i = Arrays.binarySearch(arr,val);
        if (i == 0) {
            System.out.println("Girilen sayidan küçük sayı yoktur");
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + arr[i + 1]);
        }
        else if(i == sizeArr - 1) {
            System.out.println("Girilen sayıdan büyük sayı yoktur");
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + arr[i - 1]);
        }
        else{
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + arr[i - 1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + arr[i + 1]);
        }
    }
}
