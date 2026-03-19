public class pattern11{

public static void diamondNumber_pattern(int n){
    //1 half
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");

        }
        
            System.out.println();
    }

  
}

    public static void main (String [] args){
diamondNumber_pattern(4);
    }
}