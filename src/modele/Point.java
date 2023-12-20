package modele;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point xy1 = new Point(100,200);
        Point xy2 = new Point(200,150);
        Point xy3 = new Point(800, 50);
        System.out.println(xy1);
        System.out.println(xy2);
        System.out.println(xy3);
    }
}
