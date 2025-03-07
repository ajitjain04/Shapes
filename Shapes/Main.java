import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose a shape to calculate properties:");
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Circle");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Rectangle
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();

                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Area: " + rectangle.calculateArea());
                    System.out.println("Perimeter: " + rectangle.calculatePerimeter());
                    break;

                case 2: // Square
                    System.out.print("Enter side length: ");
                    double side = scanner.nextDouble();

                    Square square = new Square(side);
                    System.out.println("Area: " + square.calculateArea());
                    System.out.println("Perimeter: " + square.calculatePerimeter());
                    break;

                case 3: // Circle
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();

                    Circle circle = new Circle(radius);
                    System.out.println("Area: " + circle.calculateArea());
                    System.out.println("Perimeter (Circumference): " + circle.calculatePerimeter());
                    break;

                case 4: // Sphere
                    System.out.print("Enter radius: ");
                    double sphereRadius = scanner.nextDouble();

                    Sphere sphere = new Sphere(sphereRadius);
                    System.out.println("Surface Area: " + sphere.calculateArea());
                    System.out.println("Volume: " + sphere.calculateVolume());
                    break;

                case 5: // Cylinder
                    System.out.print("Enter radius: ");
                    double cylinderRadius = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double cylinderHeight = scanner.nextDouble();

                    Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                    System.out.println("Surface Area: " + cylinder.calculateArea());
                    System.out.println("Volume: " + cylinder.calculateVolume());
                    break;

                case 6: // Pyramid
                    System.out.print("Enter base area: ");
                    double baseArea = scanner.nextDouble();
                    System.out.print("Enter slant height: ");
                    double slantHeight = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();

                    Pyramid pyramid = new Pyramid(baseArea, slantHeight, height);
                    System.out.println("Surface Area: " + pyramid.calculateArea());
                    System.out.println("Perimeter: " + pyramid.calculatePerimeter());
                    System.out.println("Volume: " + pyramid.calculateVolume());
                    break;

                case 7: // Exit
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
