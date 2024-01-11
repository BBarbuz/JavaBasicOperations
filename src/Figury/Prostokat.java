package Figury;

public class Prostokat extends Wielokat {
    private int a;
    private int b;

    void info() {
        System.out.println("Jestem prostokatem");
    }

    void obliczObwod() {
        this.obwod = getA() * 2 + getB() * 2;
    }

    void obliczPole() {
        this.pole = getA() * getB();
    }


    public Prostokat(int wierzcholki, int boki, int katy_wew, int a, int b) {
        super(wierzcholki, boki, katy_wew);
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
