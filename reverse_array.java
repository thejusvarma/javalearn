import java.util.Scanner;

class reverse_array
{
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

        //if given string then use 
        //char[] array = str.toCharArray()
        
        //main reverse logic
        int first = 0;
        int last = n-1; 
        int temp;
        while(first < last)
        {
            temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }

        //printing reversed array
        for(int j=0; j<n; j++)
        {
            System.out.print(array[j]+" ");
        }

    }

}