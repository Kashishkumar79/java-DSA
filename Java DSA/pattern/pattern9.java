public class pattern9{

  public static void hollow_rohmbus(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = 1; s <= (n - i); s++) {
                System.out.print(" ");
            }

            // Print hollow stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }


// public static void rohmbus_pattern(int n){
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n-i-1;j++){
//             System.out.print(" ");
            
//         }
//         for(int j=0;j<n;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
public static void main(String [] args){
hollow_rohmbus(5);

    }
}