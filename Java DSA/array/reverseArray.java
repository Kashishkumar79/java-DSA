public class reverseArray{

public static int[] reverseArray(int arr[]){
    int start=0,end=arr.length-1;
    while(start<end){
        int temp =arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    return arr;
}

    public static void main(String[]args){
        int arr[]={3,4,2,5,1};
         reverseArray(arr);

        for (int val : arr) {
            System.out.print(val + " ");
        }

    }
}