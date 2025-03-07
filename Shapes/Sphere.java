//Sphere.java
class Sphere extends Shape implements Volume {
    public Sphere(double radius) {
        super(radius, 0, 0);
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * dim_one * dim_one;
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Perimeter is not applicable to a sphere
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(dim_one, 3);
    }
}
