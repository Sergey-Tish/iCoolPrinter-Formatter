package Practic2week.Zadacha6;

public class Vector2D extends Vector{
    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1, 0, x2, y2, 0);
    }

    @Override
    double getLength() {
        return 0;
    }

    @Override
    String getVectorCords() {
        return null;
    }
}
