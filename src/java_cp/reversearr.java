package java_cp;



public class reversearr {

    public static void main(String[] args){
        int[] arr = {2,3,4,5,6};
        //reverse directly
        System.out.println("Direct reversal:");
        for(int i = arr.length-1;i>=0;i-- ){
            System.out.println(arr[i]);
        }
        System.out.println(" ");
        // taking a space complexity
        int[] arr1= new int[arr.length];
        int j=0;
        for(int i = arr.length-1;i>=0;i--){
            arr1[i]=arr[j++];
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        //using same array
        int w=0,k=arr.length-1;
        int temp =0;
        while(w<k){
            temp=arr[w];
            arr[w]=arr[k];
            arr[k]=temp;
            w++;
            k--;
        }
        System.out.println("using no space complexity");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
