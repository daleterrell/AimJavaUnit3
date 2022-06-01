
public class Assignment_3_1 {
    public static void main(String[] args) {
        
        class Rectangle{
            // define two fields
            double length, width;
            // define no arg constructor
            Rectangle()
            {
                length = 1;
                width = 1;
            }
            // define parameterized constructor
            Rectangle(double length, double width)
            {
                this.length = length;
                this.width  = width;
            }
            // define a method to return area
            double getArea()
            {
                return (length * width);
            }
            // define a method to return perimeter
            double getPerimeter()
            {
                return (2 * (length + width));
            }
        }

        final class DoStuff {

            public static void main(String[] args) {
                
                // create first object
                //and initialize with no arg constructor
                Rectangle rect1 = new Rectangle();
                
                // create first object
                //and initialize with no arg constructor
                Rectangle rect2= new Rectangle(15.0,8.0);
                
                System.out.println("Area of first object="+rect1.getArea());
                System.out.println("Perimeter of first object="+rect1.getPerimeter());
                System.out.println("Area of second object="+rect2.getArea());
                System.out.println("Perimeter of second object="+rect2.getPerimeter());
           }
            
        }
    }
}