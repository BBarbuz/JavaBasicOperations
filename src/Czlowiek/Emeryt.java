package Czlowiek;

public class Emeryt extends Dorosly implements Podstawowy, Emerytura{
    void zabawa() {
        System.out.println("Emeryt rozwiazuje krzyzowki");
    }

    void obowiazki() {
        System.out.println("Emeryt glaszcze kota");
    }

    void spotkania() {
        System.out.println("Emeryt sporyka sie z wnukami");
    }

    void aktywnoscFizyczna() {
        System.out.println("Emeryt ćwiczy na orbitreku");
    }

    public void odbierzEmeryture() {
        System.out.println("Emeryt odbiera emeryture");
    }

    public void idzDoLekarza() {
        System.out.println("Emeryt idzie do lekarza");
    }

    public void odpoczywaj() {
        System.out.println("Emeryt odpoczywa");
    }

    public void nakarmKota() {
        System.out.println("Karmi kota");
    }

    public void spij() {
        System.out.println("Emeryt idzie spac");
    }

    public void wstan() {
        System.out.println("Emeryt wstaje");
    }
}
