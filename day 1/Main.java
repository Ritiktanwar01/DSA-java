import java.util.*;


// public class Main {
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.print(sum);
//     };
// };


public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button){
            case 1 : System.out.println("Hello Its 1");
            break;
            case 2 : System.out.println("It's 2");
            break;
            case 3 : System.out.println("it's 3");
            break;
            default : System.out.println("it's default");
        };
    };
};