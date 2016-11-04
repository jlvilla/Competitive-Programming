import java.util.*;
public class STRHH
{
    // Declaration
    private static Scanner scanner;
    private static Integer t;
    private static String k;
    private static String storedCharacters;
    
     public static void main(String []args)
     {
         // Initialization
        scanner = new Scanner(System.in);
        t = scanner.nextInt(); // number of test cases
        k = "";
        storedCharacters = "";
        
        if (1 <= t && t <= 100) // Input Positive Integer t(1 <= t <= 100)
        {
            for (int i = 0; i <= t; i++) // t lines.
            {
                k = scanner.nextLine(); // sequence characters
                if (1 <= k.length() && k.length() <= 100) // 2*k(1<=k<=100)
                {
                    storedCharacters += "\n"+k.charAt(0); // the first letter should appear
                    for (int j = 1; j < k.length()/2; j++)
                        if (j%2 == 0)
                            storedCharacters += ""+k.charAt(j); // every second character from the first half
                }}}
        System.out.println(storedCharacters); // print first letter and the every second character from the first half.
    }
}
