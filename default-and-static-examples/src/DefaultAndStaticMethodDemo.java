import model.Circle;
import model.Square;
import model.Shape;
import java.awt.*;

public class DefaultAndStaticMethodDemo {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.paint();
        Shape.erase();

        System.out.println("---------------------------");
        shape = new Square();
        shape.draw();
        shape.paint();
        Shape.erase();
    }
}
