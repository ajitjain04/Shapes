# Shapes


This repository contains the implementation of various shapes (both 2D and 3D) and their properties, such as area, perimeter, and volume. The project is implemented in Java and is designed to demonstrate the use of inheritance, abstraction, and interfaces.

# Project Structure
Shape/
├── Main.java
├── Shape.java
├── Rectangle.java
├── Square.java
├── Circle.java
├── Sphere.java
├── Cylinder.java
├── Pyramid.java
├── Volume.java
└── README.md



---

# Shape Classes

# Shape (Abstract Class)
- Description: The base abstract class for all shapes.
- Attributes:
  - `dim_one`: First dimension (e.g., length, radius, base area).
  - `dim_two`: Second dimension (e.g., width, slant height).
  - `dim_three`: Third dimension (e.g., height).
- Methods:
  - `getShapeType()`: Returns the name of the shape.
  - `calculateArea()`: Abstract method to calculate the surface area.
  - `calculatePerimeter()`: Abstract method to calculate the perimeter.

---

# 2D Shapes

# Rectangle
- Constructor:
  - `Rectangle(double length, double width)`
- Methods:
  - `calculateArea()`: Returns the area of the rectangle (`length * width`).
  - `calculatePerimeter()`: Returns the perimeter (`2 * (length + width)`).

# Square
- Constructor:
  - `Square(double sideLength)`
- Methods:
  - `calculateArea()`: Returns the area of the square (`side * side`).
  - `calculatePerimeter()`: Returns the perimeter (`4 * side`).

# Circle
- Constructor:
  - `Circle(double radius)`
- Methods:
  - `calculateArea()`: Returns the area of the circle (`π * radius²`).
  - `calculatePerimeter()`: Returns the circumference (`2 * π * radius`).

---

# 3D Shapes

# Sphere
- Implements: `Volume` interface.
- Constructor:
  - `Sphere(double radius)`
- Methods:
  - `calculateArea()`: Returns the surface area of the sphere (`4 * π * radius²`).
  - `calculateVolume()`: Returns the volume of the sphere (`(4/3) * π * radius³`).

# Cylinder
- Implements: `Volume` interface.
- Constructor:
  - `Cylinder(double radius, double height)`
- Methods:
  - `calculateArea()`: Returns the surface area (`2 * π * radius * (radius + height)`).
  - `calculateVolume()`: Returns the volume (`π * radius² * height`).

# Pyramid
- Constructor:
  - `Pyramid(double baseArea, double slantHeight, double height)`
- Methods:
  - `calculateArea()`: Returns the surface area (`base area + 0.5 * perimeter * slant height`).
  - `calculatePerimeter()`: Returns the perimeter of the base (`4 * side length`).
  - `calculateVolume()`: Returns the volume (`(1/3) * base area * height`).

---

# Volume Interface

- Description: This interface is implemented by all 3D shapes.
- Method:
  - `calculateVolume()`: Abstract method to calculate the volume of the shape.

---

# Main Class

- Description: The entry point of the application. Provides a menu-driven program to interact with the shapes.
- Features:
  - Prompts the user to select a shape and input dimensions.
  - Calculates and displays the area, perimeter, and volume (if applicable) of the selected shape.
  - Includes error handling for invalid inputs and options.

---





