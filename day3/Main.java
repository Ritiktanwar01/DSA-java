
// rectangle pattern

// class Main {
//     public static void main(String[] args) {

//         int n = 4;
//         int m = 5;

//         for (int i = 1; i<=n; i++){
//               for (int b = 1; b<=m; b++){
//                   System.out.print("*");
//               }
//             System.out.print("*\n");
//         }
//     };
// };






// hollow rectangle


// class Main{
//     public static void main(String[] args) {
        
//         int row = 4;
//         int coulmn = 5;

//         for (int i = 1; i <= row; i++){
//             for (int j = 1; j<=coulmn; j++){
//                 if (i == 1 || j==1 || row == i || coulmn == j){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     };

// };


// half pyramid


// public class Main{
//     public static void main(String [] args){
//         int s = 4;

//         for (int i = 1; i<= s; i++){
//             for (int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     };
// };





// half pyramid inverted


// public class Main{
//     public static void main(String [] args){
//         int s = 6;

//         for (int i = s; i >= 1; i--){
//             for (int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     };
// };




// half pyramid number


// public class Main{
//     public static void main(String [] args){
//         int s = 4;

//         for (int i = 1; i<= s; i++){
//             for (int j = 1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     };
// };




// half pyramid inverted with numbers


// public class Main{
//     public static void main(String [] args){
//         int s = 6;

//         for (int i = s; i >= 1; i--){
//             for (int j = 1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     };
// };






// floyed triangle


// public class Main{
//     public static void main(String [] args){
//         int s = 4;
//         int ext = 1;

//         for (int i = 1; i<= s; i++){
            
//             for (int j = 1; j<=i; j++){
//                 System.out.print(ext);
//                 ext++;
//             }
//             System.out.println();
//         }
//     };
// };



// binary half triangle

// public class Main{
//     public static void main(String [] args){
//         int s = 5;

//         for (int i = 1; i<= s; i++){
//             for (int j = 1; j<=i; j++){
//                 if ((i + j) % 2 == 0){
//                     System.out.print(1);
//                 }else{
//                     System.out.print(0);
//                 }
//             }
//             System.out.println();
//         }
//     };
// };