//Check if number is prime or not

import java.util.*;

public class prime {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = scn.nextInt();

        if(n==2){
            System.out.println("n is prime");
        }else {
            boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isPrime = false;
            }
       }
    if(isPrime==true){
        System.out.println( n + " is prime");
    }else{
        System.out.println( n + " is not prime");
    }
    }
}
}
