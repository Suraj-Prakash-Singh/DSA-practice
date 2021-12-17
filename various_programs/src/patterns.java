public class patterns {
    public static void main(String[] args) {
        System.out.println("Pattern 1");
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<11;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("Pattern2");
        for(int i=1;i<6;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.print("\n");

        }
        System.out.println("Pattern 3");
        for(int i=1;i<6;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");

            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");

            }
            System.out.print("\n");

        }


    }
}
