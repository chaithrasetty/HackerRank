package DrawShape;

abstract class Shape {
    abstract void drawShape();
}

class Square extends Shape {

    Square() {
        System.out.println("Drawing a Square");
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing a Square");
    }

}

class Circle extends Shape {

    Circle() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {

    Rectangle() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing a Rectangle");
    }
}

public class ShapeFactory {
    Shape sq = new Square();
    Shape cir = new Circle();
    Shape rec = new Rectangle();

    private void drawShape(String shape) {
        switch (shape) {
            case "Square":
                sq.drawShape();
                break;
            case "Circle":
                cir.drawShape();
                break;
            case "Rectangle":

                rec.drawShape();
                break;
            default:
                System.out.println("Drawing " + shape + " is not supported");
                break;
        }
    }

    public static void main(final String[] arguments) {
        ShapeFactory sf = new ShapeFactory();
        System.out.println();
        sf.drawShape("Square");
        sf.drawShape("Circle");
        sf.drawShape("Rectangle");
        sf.drawShape("square");

    }
}
