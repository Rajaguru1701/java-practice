class Main {
    public static void main(String[] args) {
        int n = 54748;
        int original = n;
        int length = String.valueOf(n).length();
        int digit =0,power =1,sum=0;
        while(n > 0)
        {
            digit = n%10;
            power =1;
            for(int i=1;i<=length;i++)
            {
                power *= digit;
            }
            sum+=power;
            n/=10;
        }
        if(sum == original)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
