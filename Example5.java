
public class Example5{
    public static void main(String[] args)
    {
        
        int size=5;
        if (size % 2 == 0) {
            size++; 
        }
        
        int midPoint = size / 2 + 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= Math.abs(midPoint - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (midPoint - Math.abs(midPoint - i)) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
    
       
        }      
    }    
    }
