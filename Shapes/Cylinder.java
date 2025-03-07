//Cylinder.java
class Cylinder extends Shape implements Volume {
    public Cylinder(double radius, double height) {
        super(radius, 0, height);
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * dim_one * (dim_one + dim_three);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * dim_one;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * dim_one * dim_one * dim_three;
    }
}
