package Czlowiek;

abstract class Czlowiek {
    abstract void jedz();
    abstract void pij();

    protected int wiek;
    protected String cechy;
    void ileLat(){
        System.out.println("Wiek to: " + cechy + " lat");
    }

    void cechy(){
        System.out.println("Cechy to: " + cechy);
    }

    public int getWiek() {
        return wiek;
    }

    public String getCechy() {
        return cechy;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setCechy(String cechy) {
        this.cechy = cechy;
    }
}
