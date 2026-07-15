import java.util.*;

public class check{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A>B){
            System.out.println("A is greater than B");
        }
        else if(B>A){
            System.out.println("B is greater than A");
        }
        else{
            System.out.println("A and B are equal");
        }

    }

}