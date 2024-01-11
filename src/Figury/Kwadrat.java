package Figury;

public class Kwadrat extends Wielokat {

    private int a;

    void info() {
        System.out.println("Jestem kwadratem");
    }

    void obliczObwod() {
        this.obwod = getA() * 4;
    }

    void obliczPole() {
        this.pole = getA() * getA();
    }

    public Kwadrat(int wierzcholki, int boki, int katy_wew, int a) {
        super(wierzcholki, boki, katy_wew);
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
