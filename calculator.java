//calculator

import java.util.*;

public class calculator {
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = scn.nextInt();
        System.out.println("Enter b :");
        int b = scn.nextInt();
        System.out.println("Enter Operator: ");
        char operator = scn.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b);
                break;
            case '-' : System.out.println(a-b);
                break;
            case '*' : System.out.println(a*b);
                break;
            case '/' : System.out.println(a/b);
                break;
            case '%' : System.out.println(a%b);
                break;
            default: System.out.println("Wrong operator");
        
        }
    }
}