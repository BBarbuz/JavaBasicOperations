package Figury;

class Wielokat extends Figura {
    private int wierzcholki;
    private int boki;
    private int katy_wew;

    void sumaKatowWew() {
        setKaty_wew((getBoki() - 2) * 180);
    }

    public Wielokat() {
    }

    public Wielokat(int wierzcholki, int boki, int katy_wew) {
        this.wierzcholki = wierzcholki;
        this.boki = boki;
        this.katy_wew = katy_wew;
    }

    public int getWierzcholki() {
        return wierzcholki;
    }

    public int getBoki() {
        return boki;
    }

    public int getKaty_wew() {
        return katy_wew;
    }

    public void setWierzcholki(int wierzcholki) {
        this.wierzcholki = wierzcholki;
    }

    public void setBoki(int boki) {
        this.boki = boki;
    }

    public void setKaty_wew(int katy_wew) {
        this.katy_wew = katy_wew;
    }
}
