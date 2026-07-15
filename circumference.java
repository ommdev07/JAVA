import java.util.*;

public class circumference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        double circumference = 2 * 3.14 * radius;
        System.out.println("The circumference of the circle is: " + circumference);
    }
}