public class EqualsDemo {
    public static void main(String[] args) {

        Point original = new Point(30, 100);
        Point target = new Point(30, 100);

        original.equals(target);
        System.out.println(original.equals(target));
    }

}

class Point extends Object {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(x, y) = (%d, %d)%n", this.x, this.y);
    }

    @Override
    public boolean equals(Object obj) {
        Point p = (Point) obj;
        if (this.x == p.x && this.y == p.y) return true;
        else return false;
        }
    }
