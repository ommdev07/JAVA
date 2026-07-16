import java.util.*;

public class eligibleforvote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.print("You are eligible to vote.");
        }
        else{
            System.out.print("You are not eligible to vote.");
        }
    }
    
}
