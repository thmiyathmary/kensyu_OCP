public class DrawingTool {
    public void DrawAllShapes(List shapeList) {
        List<Circle> circleList = shapeList.stream().filter(shape -> shape.instanceof(Circle);
        List<Square> squareList = shapeList.stream().filter(shape -> shape.instanceof(Square);
        for (Circle circle : circleList) {
            circle.Draw()
        }
        for (Square square : squareList) {
            square.Draw();
        }
    }
}