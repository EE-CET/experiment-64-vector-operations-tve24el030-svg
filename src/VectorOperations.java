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
                    // Read the name and add it to the vector
                    String nameToAdd = scanner.next();
                    students.add(nameToAdd);
                    System.out.println("Added");
                    break;
                    
                case 2:
                    // Read the name and the 1-based index
                    String nameToInsert = scanner.next();
                    int index = scanner.nextInt();
                    
                    // Convert 1-based index to 0-based index
                    students.add(index - 1, nameToInsert);
                    System.out.println("Inserted");
                    break;
                    
                case 3:
                    // Read the name and remove it from the vector
                    String nameToRemove = scanner.next();
                    students.remove(nameToRemove);
                    System.out.println("Removed");
                    break;
                    
                case 4:
                    // Display the vector
                    System.out.println(students);
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
        }
        
        scanner.close();
    }
}