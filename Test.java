import java.util.*;
public class Test
{
    // Declaration
    private static Scanner scanner;
    private static Integer inputNumber;
    private static String storedNumbers;
    
     public static void main(String []args)
     {
         // Initialization
        scanner = new Scanner(System.in);
        storedNumbers = "";
        inputNumber = 0;
        
        while (inputNumber != 42) // Continue processing input while input is not number 42.
        {
            inputNumber = scanner.nextInt();
            if (inputNumber < 100 && inputNumber > -100 && inputNumber != 42 ) // All numbers at input are integers of one or two digits.
                storedNumbers += "\n"+inputNumber;
        }
        System.out.println(storedNumbers); // Display input numbers before number 42.
    }
}



