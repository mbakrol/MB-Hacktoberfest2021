import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x1, x2, y1, y2, z1, z2;
        double distance = 0;
        System.out.println("Enter the coordinates of the first point (x1,y1,z1): ");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        z1 = scanner.nextInt();
        System.out.println("Enter the coordinates of the second point (x2,y2,z3): ");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        z2 = scanner.nextInt();
        distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)+ (z2-z1)*(z2-z1));
        System.out.println("The distance between the two points is " + distance);
        scanner.close();
    }
}