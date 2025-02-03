// import java.util.*;

// public class Function {
//     public static void printHelloWorld(){
//         System.out.println("Hello world");
//         return;
//     }

//     public static int calculateSum(int a, int b){
        
//         int sum = a + b;
//         return sum;
        
//     }
//    public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter a:");
//         int a = scn.nextInt();
//         System.out.println("Enter b: ");
//         int b = scn.nextInt();
//         int sum = calculateSum(a,b);
//         System.out.println("sum is: " + sum);
//    } 
// }

// Product of a and b

// import java.util.*;

// public class Function{
//     public static int multiply(int a, int b){
//         int product = a*b;
//         return product;
//     }
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter a:");
//         int a = scn.nextInt();
//         System.out.println("Enter b: ");
//         int b = scn.nextInt();
//         int product = multiply(a,b);
//         System.out.println("product is : " + product);
//     }
// }

//Factorial of a number,n

// import java.util.*;

// public class Function {
//     public static int factorial(int n){
//         int f = 1;

//         for(int i=1; i<=n; i++){
//             f = f * i;
//         }

//         return f;
//     }

//     public static int binCoeff(int n, int r) {
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nr = factorial(n-r);

//         int binCoeff = fact_n/(fact_r*fact_nr);
//         return binCoeff;
//     }
//     public static void main(String[] args) {
//         System.out.println(binCoeff(5,2));
//     }
// }


//Check if a number is Prime or not.

 import java.util.*;

 public class Function {

//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         boolean isPrime = true;
//         for(int i=2; i<=n-1; i++){
//             if(n%i==0){
//                 isPrime = false;
//                 break;
//             }
//         }
//         return isPrime;
//     }

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primesInRange(16);
    }
}

