public class Assignment_3_1_Part_2 extends Assignment_3_1 {
    static void perimeter(int length, int width)
    {
        // Calculate the 'perimeter' using the formula
        int perimeter = 2 * (length + width);
        
        System.out.println("The perimeter of the given rectangle of length "
            + length + " and width " + width + " = "
            + perimeter);
    }
  
    // Driver method
    public static void main(String[] args)
    {
        int length = 4;
        int width = 40;
 
        perimeter(length, width);
    }
}