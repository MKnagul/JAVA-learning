

public class Main
{
    public static void mergesort(int arr[],int start,int end)
    {
        if(start < end){
        int mid = (start+end) / 2 ; 
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        
        merge(arr,start,mid,end);
        }
        
    }
    
    public static void merge(int arr[],int start,int mid,int end)
    {
        int n1  = mid - start + 1;
        int n2  = end - mid ;
        int L[] = new int[mid - start + 1];
        int R[] = new int[end - mid ];
        int i = 0;
        int j = 0;
        int k = start;
        while(i < n1)
        {
            L[i] = arr[k];
            i++;
            k++;
        }
        while(j<n2)
        {
            R[j] = arr[k];
            j++;
            k++;
        }
        
        i=0;
        j=0;
        k = start;
        
        while(i<n1 &&  j< n2)
        {
            if(L[i] < R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
                
            }
            k++;
        }
        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while(j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        } 
        
        
    }
	public static void main(String[] args) {
	int arr[] = { 1,3,55,32,4,0};
	mergesort(arr,0,arr.length - 1);
	for(int i : arr)
	{
	    System.out.print(i + " ");
	}
	}
}
