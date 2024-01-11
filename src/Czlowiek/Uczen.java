package Czlowiek;

public class Uczen extends Dziecko implements Podstawowy, Szkola {

    protected int wiek;
    protected String cechy;
    void zabawa() {
        System.out.println("Uczen bawi się zabawkami");
    }

    void obowiazki() {
        System.out.println("Uczen odrabia lekcje");
    }

    void spotkania() {
        System.out.println("Uczen odrabia lekcje");
    }

    void aktywnoscFizyczna() {
        System.out.println("Uczen cwiczy na W-F");
    }

    public void spij() {
        System.out.println("Uczen idze spac");
    }

    public void wstan() {
        System.out.println("Uczen wstaje z lozka");
    }

    public void uczSie() {
        System.out.println("Uczen uczy sie");
    }

    public void odrobLekcje() {
        System.out.println("Uczen w odrabia lekcje");
    }

    public void odprezSie() {
        System.out.println("Uczen sie odpreza");
    }

    public void bawSieZPrzyjaciolmi() {
        System.out.println("Uczen bawi sie z przyjaciolmi");
    }

    public Uczen(int wiek, String cechy) {
        this.wiek = wiek;
        this.cechy = cechy;
    }
}
