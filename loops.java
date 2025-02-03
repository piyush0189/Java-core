//while loop

// Print number from 1 to 100

// import java.util.*;

// public class loops {
//     public static void main(String args[]) {
//         int counter = 1;
//         while(counter <= 10) {
//         System.out.println(counter);
//         counter++;
//         }
//     }
// }

//Print number from 1 to n;

// import java.util.*;

// public class loops{
//     public static void main(String args[]){
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter range: ");
//         int range = scn.nextInt();
//         int counter = 1;

//         while(counter <= range){
//             System.out.print(counter + " ");
//             counter++;
//         }
//     }while
// }

//print sum of first n natural numbers

// import java.util.*;

// public class loops {
//     public static void main(String args[]){
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter n: ");
//         int n = scn.nextInt();
//         int sum = 0;

//         int i = 1;
//         while(i <= n){
//             sum += i;
//             i++;
//         }

//         System.out.println(sum);
//     }
// }

//For loop

//Square patter

// import java.util.*;

// public class loops {
//     public static void main(String args[]){
//         for(int line=1; line<=4; line++) {
//             System.out.println("****");
//         }
//     }
// }

//Print reverse of a number

// import java.util.*;

// public class loops{
//     public static void main(String args[]){
//         int n = 123;

//        while  ( n > 0) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit + "");
//             n/= 10;
//         }
//         System.out.println();
//     }
// }

//Reverse the given number

// import java.util.*;

// public class loops{
//     public static void main(String args[]){
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter n : ");
//         int n = scn.nextInt();
//         int rev = 0;

//         while( n>0 ) {
//             int lastDigit = n%10;
//             rev = (rev*10) + lastDigit;
//             n = n/10;
//         }
//         System.out.println(rev);
//     }
// }

//do-while loop

// import java.util.*;

// public class loops{
//     public static void main(String args[]){
//         int counter = 1;
//         do {
//             System.out.println("Hello world");
//             counter++;
//     } while(counter <= 10);
//     }
// }

// Break Statement

// import java.util.*;

// public class loops {
//     public static void main(String args[]) {
//         for(int i =1; i<=5; i++) {
//             if(i==3) {
//                 break;
//             }
//             System.out.println(i);
//         }

//         System.out.println("i am out of the loop");
//     }
// }

//Keep entering numbers till user enters a multiple of 10

// import java.util.*;

// public class loops{
//     public static void main(String args[]){
//         Scanner src = new Scanner(System.in);

//         do {
//             System.out.println("enter your number: ");
//             int n = src.nextInt();
//             if(n % 10 == 0) {
//                 break;
//             }
//             System.out.println(n);

//         } while(true);
//     }
// }

// Continue Statement

// import java.util.*;

// public class loops{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++) {
//             if(i==3) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

//Display all numbers entered by user except multiples of 10

import java.util.*;

public class loops{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("enter your number: ");
            int n = scn.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println("number was :" + n);
        }while(true);
    }
}