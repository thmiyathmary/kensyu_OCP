public class Main{
    public static void main (String args[]){
        Main main = new Main();
        main.testDrawAllShapes();
    }

    public void testDrawAllShapes() {

        Circle circle = new BigCircle(10, new Point(20,20));
        Square square = new BigSquare(/*side*/ 50, /*topLeft*/ new Point(10,10));
        DrawingTool drawingTool = new DrawingTool();
        List<Shape> shapeList = new ArrayList<Shape>();
        List<Shape> priorities = Arrays.asList(Circle, Square);
        shapeList.add(circle);
        shapeList.add(square);
        drawingTool.DrawAllShapes(shapeList, priorities);
    }
}

