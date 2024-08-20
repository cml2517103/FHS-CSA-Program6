import java.util.Scanner;

public class Program6{
    public static void main(String[] args){
        Scanner survey = new Scanner(System.in);
        final double PI = 3.14159;
        
        System.out.print("Enter the radius: ");
        double radius = survey.nextDouble();
        
        double diameter = radius * 2;
        double area = PI * (radius * radius);
        double circumference = PI * diameter;
        
        System.out.printf("\tThe Radius of the circle = %.3f", radius); System.out.println();
        System.out.printf("\tThe DIameter of the circle = %.3f", diameter); System.out.println();
        System.out.printf("\tThe Area of the circle = %.3f", area); System.out.println();
        System.out.printf("\tThe Circumference of the circle = %.3f", circumference);
    }    
}
