package Figury;

class Elipsa extends Figura {
    private int a; // półoś wielka
    private int b; // półoś mała
    private int x;
    private int y;
    private int F1x;
    private int F1y;
    private int F2x;
    private int F2y;
    private double c; // odległość ognisk od środka elipsy


    void odlegloscOgniskodSrodkowElipsy() {
        setC(Math.sqrt(getA() * getA() - getB() * getB()));
    }

    public Elipsa(int a, int b, int x, int y, int f1x, int f1y, int f2x, int f2y, int c) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        F1x = f1x;
        F1y = f1y;
        F2x = f2x;
        F2y = f2y;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getF1x() {
        return F1x;
    }

    public int getF1y() {
        return F1y;
    }

    public int getF2x() {
        return F2x;
    }

    public int getF2y() {
        return F2y;
    }

    public double getC() {
        return c;
    }


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setF1x(int f1x) {
        F1x = f1x;
    }

    public void setF1y(int f1y) {
        F1y = f1y;
    }

    public void setF2x(int f2x) {
        F2x = f2x;
    }

    public void setF2y(int f2y) {
        F2y = f2y;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public void printMessage() {
        super.printMessage();
    }

    @Override
    protected void rysuj() {
        super.rysuj();
    }

    @Override
    protected void usun() {
        super.usun();
    }

    @Override
    protected void przesun() {
        super.przesun();
    }

    public Elipsa() {
        super();
    }

    public Elipsa(int pole, int obwod) {
        super(pole, obwod);
    }

    @Override
    protected String podajParametry() {
        return super.podajParametry();
    }

    @Override
    public double getPole() {
        return super.getPole();
    }

    @Override
    public double getObwod() {
        return super.getObwod();
    }

    @Override
    public void setPole(double pole) {
        super.setPole(pole);
    }

    @Override
    public void setObwod(double obwod) {
        super.setObwod(obwod);
    }
}
