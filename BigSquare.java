public class BigSquare implements Square {
    public BigSquare (double side, Pointer topLeft) {
        ShapeType = BigCircle;
        itsSide = side;
        itsTopLeft = topLeft;
    }
}