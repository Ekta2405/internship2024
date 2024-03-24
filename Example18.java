import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Example18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the array
        System.out.print("Enter elements of the array separated by spaces: ");
        String input = scanner.nextLine();
        String[] array = input.split(" ");

        // Converting array elements to integers
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }

        // Sorting the array
        Arrays.sort(intArray);

        // Creating a set and adding array elements to it (which automatically sorts)
        Set<Integer> sortedSet = new HashSet<>();
        for (int num : intArray) {
            sortedSet.add(num);
        }

        // Printing the sorted set
        System.out.println("Sorted set: " + sortedSet);
        
        scanner.close();
    }
}

