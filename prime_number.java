import java.util.*;
public class prime {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i != 0)
            {
                continue;
            }
            else
            {
                flag = 1;
                System.out.println("Not a Prime Number");
                break;
            }
        }    
        if(flag == 0)
        {
            System.out.println("Prime Number");
        }
    }
}
