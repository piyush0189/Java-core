import java.util.*;

public class InvertedRotated {
    public static void Inverted_Rotated(int n){
        //outer
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Inverted_Rotated(4);
    }
}
