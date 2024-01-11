package Figury;

public class Okrag2 extends Elipsa {
    private int x;
    private int y;
    private int r;

    void info() {
        System.out.println("Jestem okregiem");
    }

    void obliczObwod() {
        this.obwod = 2 * Math.PI * Math.PI;
    }

    void obliczPole() {
        this.pole = Math.PI * getR() * getR();
    }

    public Okrag2(int a, int b, int x, int y, int f1x, int f1y, int f2x, int f2y, int c, int x1, int y1, int r) {
        super(a, b, x, y, f1x, f1y, f2x, f2y, c);
        this.x = x1;
        this.y = y1;
        this.r = r;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    public void setR(int r) {
        this.r = r;
    }
}
