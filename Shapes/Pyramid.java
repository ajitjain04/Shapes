//Pyramid.java

class Pyramid extends Shape {
    public Pyramid(double baseArea, double slantHeight, double height) {
        // Use the three-parameter constructor of Shape
        super(baseArea, slantHeight, height);
    }

    @Override
    public double calculateArea() {
        double perimeterBase = Math.sqrt(dim_one) * 4; // Assuming square base
        return dim_one + (0.5 * perimeterBase * dim_two);
    }

    @Override
    public double calculatePerimeter() {
        double sideLength = Math.sqrt(dim_one); // Assuming square base
        return 4 * sideLength;
    }

    public double calculateVolume() {
        // Volume = (1/3) * Base Area * Height
        return (1.0 / 3) * dim_one * dim_three;
    }
}
