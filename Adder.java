import java.util.*;

class Adder {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("x=");
        int x = sc.nextInt();
        System.out.print("y=");
        int y = sc.nextInt();

        // Process
        int z = x + y;

        // Output
        System.out.println(z);

    }
}