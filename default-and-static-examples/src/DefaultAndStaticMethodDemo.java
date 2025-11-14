import model.Circle;
import model.Square;
import model.Shape;
import java.awt.*;

public class DefaultAndStaticMethodDemo {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.paint();
        Shape.erase();  //here we have to call the method using interface
                        // bcz erase is marked as static in shape interface

        System.out.println("---------------------------");
        shape = new Square();
        shape.draw();
        shape.paint();
        Shape.erase();
    }
}
