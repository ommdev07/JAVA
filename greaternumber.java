import java.util.*;

public class greaternumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        if(a > b){
            System.out.print(a + " is greater than " + b);
        } else if(a < b){
            System.out.print(b + " is greater than " + a);
        } else {
            System.out.print("Both numbers are equal");
        }
    }
    
}
