package java_cp.sorting;

public class selectsort {
    void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_i=i;
            for(int j=0;j<n;j++)
                if(arr[j]>arr[min_i])
                    min_i=j;
                int temp=arr[min_i];
                arr[min_i]=arr[i];
                arr[i]=temp;


        }
    }
    void printarr(int arr[]){
        int n=arr.length;
        System.out.println("The array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]={64,25,46,29,34};
        selectsort obj = new selectsort();
        obj.printarr(arr);
        obj.sort(arr);
        obj.printarr(arr);

    }
}
