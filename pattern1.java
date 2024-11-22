import java.util.*;
public class pattern1{
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        int temp = 0;
        for (int i = 1; i <=n ; i++)
        {
          for(int k=1;k<=n-i;k++)
          {
              System.out.printf("   ");
          }
          temp = num;
          for(int j=1;j<=i;j++)
          {
            System.out.printf("%3d",temp);
            temp = temp -1;
          }
          System.out.println();
          num++;
        }
    }
}

