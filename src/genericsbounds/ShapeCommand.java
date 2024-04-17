package genericsbounds;

public class ShapeCommand<E extends Shape> {

    public void printShape(E shape) {
        System.out.println(shape.shapeName);
    }

    public static <T extends Shape>  void printShape2(T shape) {

    }
}
