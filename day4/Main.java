
public class Main {

    public static void main(String[] args) {



        // Butterfly pattern


        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     int spaces = 2 * (n - i);

        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // lower


        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     int spaces = 2 * (n - i);

        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // solid rombus


        // int n = 5;

        // for (int i =1; i<=n; i++){
        //     for (int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j =1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // number pyramid

        // int n = 5;

        // for (int i = 1; i<=n; i++){


        //     for (int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     // printing row count at row times

        //     for (int j = 1; j<=i; j++){
        //         System.out.print(i + " ");
        //     }


        //     System.out.println();
        // }

        // plindrome pyramid

        // int n = 5;

        // for (int i =1; i<=n;i++){

        //     // spaces 

        //     for (int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     // 1st half numbers 

        //     for (int j = i; j>=1 ; j--){
        //         System.out.print(j);
        //     }

        //     // 2nd half

        //     for (int j =2; j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();

        // }


        // diamond structure
        int n = 4;

        for (int i =1; i<=n; i++){
            // spaces
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            // stars

            for (int j =1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();

            
        }

         // lower

        for (int i = n; i>=1; i--){

            // spaces
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            // stars

            for (int j =1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

       


    };
};
