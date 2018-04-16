public class DrawingTool {
    public void DrawAllShapes(List shapeList) {
        for (int i = 0; i < shapeList.size(); i++) {
            shapeList.get(i).Draw();
        }
    }
}