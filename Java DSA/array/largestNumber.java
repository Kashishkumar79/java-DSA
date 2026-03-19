public class largestNumber{

    public static int lagestNumber(int arr[]){
        int max = Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;;
       
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }
        if(arr[i]<min){
            min = arr[i];
        }
       }
       System.out.println("Minimum value is : " + min);
        return max;

    }

    public static void main(String [] args){
        int marks[]={1,2,6,3,5};
        int max = lagestNumber(marks);
        System.out.print("Maxmimum value is : "+ max);

    }
}