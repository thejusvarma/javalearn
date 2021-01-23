import java.util.Scanner;

public class max_min_in_array {
    public static void main(String []args)
    {
        //scanning array input from user
        Scanner A = new Scanner(System.in);
        System.out.println("enter the no. of elements for array but should be less then 10");
        int n = A.nextInt();
        int[] array = new int[n];
        System.out.println("enter the elements");
        for(int i=0; i<n; i++)
        {
            array[i] = A.nextInt();
        } 

        //min and max in array logic
        int min = array[0];
        int max = array[0];
        for(int j=0;j<n-1;j++)
        {
            if(array[j]>array[j+1])
            {
                max = array[j];
            }
            else
            {
                min = array[j];
            }
        }

        System.out.println( min+" "+max);
    }
}
