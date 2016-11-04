import java.util.*;
public class TestInt
{
     public static void main(String []args)
     {
        Scanner in = new Scanner(System.in); // Initialize Scanner
        int i = in.nextInt(); // First number
        int j = in.nextInt(); // Second number
        if (i <= 200 && j <= 200)
        System.out.println(i+j); // display sum if two numbers are less than or equal to 200
     }
}
