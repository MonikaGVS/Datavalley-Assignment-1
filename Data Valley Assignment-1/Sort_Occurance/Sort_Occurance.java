import java.util.Arrays;
import java.util.Scanner;
class Sort_Occurance {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i=0,count=0,num;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        num=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                count+=1;
            }
        }
        System.out.println(count);
    }
}