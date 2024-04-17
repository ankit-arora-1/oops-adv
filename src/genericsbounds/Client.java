package genericsbounds;

public class Client {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.shapeName = "generic shape";

        Square square = new Square();
        square.shapeName = "square";


        ShapeCommand<Square> shapeCommand = new ShapeCommand<>();
        shapeCommand.printShape(square);
    }
}
