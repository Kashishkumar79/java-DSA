public class maxSubArraySum{


public static void maxSubArraySum(int arr[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;



    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            currSum=0;
            for(int k=i;k<=j;k++){
                currSum+=arr[k];
                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
            }
        }
            
        }
            System.out.println("Maximum sum = "+maxSum);
    }

    //2 approach

public static void maxSubArraySum1(int arr[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    int prefix[] = new int[arr.length];
    prefix[0] = arr[0];

    // build prefix sum array
    for (int i = 1; i < arr.length; i++) {
        prefix[i] = prefix[i - 1] + arr[i];
    }

    // check all subarrays using prefix sums
    for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
            currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];

            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
    }

    System.out.println("Maximum sum = " + maxSum);
}

//kadanes's algorithm
public static void kadanes(int arr[]){
    int ms=Integer.MIN_VALUE;
    int cs=0;
    for(int i=0;i<arr.length;i++){
        cs=Math.max(arr[i], cs + arr[i]);
        ms = Math.max(cs,ms);
    }
    System.out.println("Maximum sum = " + ms);

}



// public static int kadanesAllCases(int arr[]) {
//     int currentSum = arr[0];
//     int maxSum = arr[0];

//     for (int i = 1; i < arr.length; i++) {
//         currentSum = Math.max(arr[i], currentSum + arr[i]);
//         maxSum = Math.max(maxSum, currentSum);
//     }

//     System.out.println("Maximum sum = " + maxSum);
//     return maxSum;
// }

    public static void main(String []args){
        int arr[]={-1,-2,-6,-1,-3};
        kadanes(arr);

    }
}