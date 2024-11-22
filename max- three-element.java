import java.util.*;

class sample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,77,77,5};
        int max =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        int secmax = -1;
        for(int j=0;j<arr.length;j++)
        {
            if(secmax < arr[j] && arr[j] != max)
            {
                secmax = arr[j];
            }
        }
        int thrmax = -1;
        for(int j=0;j<arr.length;j++)
        {
            if(thrmax < arr[j] && arr[j] != max && arr[j] != secmax)
            {
                thrmax = arr[j];
            }
        }
        System.out.println(max);
        System.out.println(secmax);
        System.out.println(thrmax);
    }
}
