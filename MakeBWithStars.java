public class MakeBWithStars {
    public static void makeB(){
        String[][] letter = new String[5][5];
        for(int i = 0;i < 10;i++)
        {
            for (int j = 0;j < 5;j++)
            {
                if (i == 0 || i == 5 || i == 9 || j == 0 || j == 4)
                    System.out.printf("* ");
                else
                    System.out.printf("  ");
            }
            System.out.println();
        }
    }
}
