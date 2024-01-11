package Figury;

public class Figura {
    public void printMessage() {
        System.out.println("Hello from MyClass!");
    }

    protected double pole;
    protected double obwod;
    //private kolor;


    protected void rysuj() {
    }

    protected void usun() {
    }

    protected void przesun() {
    }

    public Figura() {
    }

    public Figura(int pole, int obwod) {
        this.pole = pole;
        this.obwod = obwod;
    }

    protected String podajParametry() {
        return null;
    }

    public double getPole() {
        return pole;
    }

    public double getObwod() {
        return obwod;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }

    public void setObwod(double obwod) {
        this.obwod = obwod;
    }

}


