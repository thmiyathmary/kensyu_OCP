public class DrawingTool {
    public void DrawAllShapes(List<Shape> shapeList, List<Shape> priorities) {
        for (Shape priority: priorities) {
            shapeList.stream().filter(shape.instansof(priority)).forEach(shape.Draw());
        }
    }
}