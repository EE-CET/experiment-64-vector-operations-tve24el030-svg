import java.util.Scanner;
import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> students = new Vector<>();
        
        while (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                break;
            }
            
            switch (choice) {
                case 1:
                    // TODO: Read the name and add it to the vector
                    // Print "Added"
                    
                    break;
                    
                case 2:
                    // TODO: Read the name and the 1-based index
                    // Insert the name at the correct 0-based index in the vector
                    // Print "Inserted"
                    
                    break;
                    
                case 3:
                    // TODO: Read the name and remove it from the vector
                    // Print "Removed"
                    
                    break;
                    
                case 4:
                    // TODO: Display the vector
                    
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
        }
        
        scanner.close();
    }
}
