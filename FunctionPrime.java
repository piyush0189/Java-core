// import java.util.*;

// public class FunctionPrime {
//     public static boolean isPrime(int n){
//         boolean isPrime = true;
//         for(int i=2;i<=n-1;i++){
//             if(n%i==0){
//                 return false;
                
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         System.out.println(isPrime(4));
//     }
// }


//Optimized method

import java.util.*;

public class FunctionPrime{
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void PrimesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        PrimesInRange(17);
    }
}