package Figury;

public class Trojkat extends Wielokat {
    private int h;
    private int a;
    private int b;
    private int c;

    void info(){
        System.out.println("Jestem trojkatem");
    }

    void obliczObwod() {
        this.obwod = getA() + getB() + getC();
    }

    void obliczPole() {
        this.pole = getA() * getH();
    }

    public Trojkat(int wierzcholki, int boki, int katy_wew, int h, int a, int b, int c) {
        super(wierzcholki, boki, katy_wew);
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getH() {
        return h;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
