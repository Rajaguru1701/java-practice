public class pattern2 {
    public static void main(String[] args)
    {
        int n=5;
        int k=1;
        int temp =0;
        for(int i=1;i<=n;i++)
        {
            temp = k;
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%3d",temp);
                temp = temp +(n-j);
            }        
            k++;
            System.out.println();
            
        }
    }
    
}
