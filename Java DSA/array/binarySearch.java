public class binarySearch{
    public static int binary_Search(int arr[],int key){
        int start = 0, end =arr.length-1;

        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]< key){
                start =mid+1;
            }else{
                end= mid=1;
            }
        }
        return -1;
       
    }

    public static void main(String [] args){
        int marks[]={2,4,6,8,10,12,14,16};
        int key =6;
        int index=binary_Search(marks,14);
        System.out.print("Key found at "+index+" index");
              

    }
}