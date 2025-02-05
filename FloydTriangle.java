import java.util.*;

public class FloydTriangle {
    public static void Floyd_Triangle(int n){
        //outer
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Floyd_Triangle(5);
    }
}
