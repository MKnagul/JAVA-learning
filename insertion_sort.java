// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void swap(int arr[],int a , int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {50,4,0,8,9,11};
        for(int i = 0; i < arr.length;i++)
        {
            int j = i;
            int k = j-1;
            while( j>=0 && k>=0 && arr[k] > arr[j]  )
            {
                swap(arr,k,j);
                k--;
                j--;
            }
        }
        for(int i = 0; i< arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}