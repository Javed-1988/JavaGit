package designpattern;

interface Shape {
    void draw();
}

//Abstract Factory Pattern says that just define an interface or abstract class for creating families
// of related (or dependent) objects but without specifying their concrete subclasses.

// Step 2: Create Concrete Classes
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing design pattern.Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing design pattern.Rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing design pattern.Square");
    }
}

// Step 3: Create a Factory Class
class ShapeFactory {
    // Factory method to get a design pattern.Shape object
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
public class FactoryDesignPattern {
    public static void main(String[]args)
    {
        Shape shape=ShapeFactory.getShape("CIRCLE");
        shape.draw();
    }
}
