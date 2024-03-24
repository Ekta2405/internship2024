public class Example4 {
    
    // Function to check if a number is a Kaprekar number
    public static boolean isKaprekar(int n) {
        // Calculate square of the number
        long square = (long) n * n;
        
        // Convert square to string to find its length
        String strSquare = String.valueOf(square);
        int len = strSquare.length();
        
        // Split the square into two parts and convert them to integers
        for (int i = 1; i < len; i++) {
            String leftStr = strSquare.substring(0, i);
            String rightStr = strSquare.substring(i);
            long left = (leftStr.isEmpty()) ? 0 : Long.parseLong(leftStr);
            long right = Long.parseLong(rightStr);
            
            // Check if sum of parts is equal to the original number
            if (left + right == n) {
                return true;
            }
        }
        return false;
    }
    
    // Main method to test the code
    public static void main(String[] args) {
        int num = 3456;
        if (isKaprekar(num)) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }
    }
}
