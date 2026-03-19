public class pattern10{

public static void diamond_pattern(int n){
    //1 half
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
            System.out.println();
    }

    //2 half
     for(int i=n;i>=1;i--){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
            System.out.println();
    }
}

    public static void main (String [] args){
diamond_pattern(4);
    }
}