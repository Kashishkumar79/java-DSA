import java.util.*;

public class arrayTwoD{
    public static void main (String[] args){
        int arr[][] = new int[3][3];
        int  n = arr.length , m = arr[0].length;

        Scanner sc= new Scanner(System.in);

        //input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}