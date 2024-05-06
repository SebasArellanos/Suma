public class Suma {
    private int x, y;

    @Override
    public String toString() {
        return "Suma [x=" + x + ", y=" + y + "]";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int mostrarResultado() {
        return this.x + this.y;
    }
}