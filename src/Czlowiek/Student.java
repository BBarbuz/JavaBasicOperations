package Czlowiek;

public class Student extends Dorosly implements Podstawowy, Studia, Praca {

    void zabawa() {
        System.out.println("Student bawi się na imprezie");
    }

    void obowiazki() {
        System.out.println("Student uczy sie na sesje");
    }

    void spotkania() {
        System.out.println("Student spotyka sie ze znajomymi");
    }

    void aktywnoscFizyczna() {
        System.out.println("Student cwiczy na W-F");
    }

    public void spij() {
        System.out.println("Student kladzie sie sapac");
    }

    public void wstan() {
        System.out.println("Student wstaje");
    }

    public void pracuj() {
        System.out.println("Student pracuje");
    }

    public void placPodatki() {
        System.out.println("Student placi podatki");
    }

    public void zajmijSieDzieckiem() {
        System.out.println("Student zajmuje sie dzieckiem");
    }

    public void wlaczSwojSerial() {
        System.out.println("Student wlacza swoj serial");
    }

    public void studiuj() {
        System.out.println("Student studiuje");
    }

    public void nieIdzNaZajecia() {
        System.out.println("Student nie idzei na zajecia");
    }

    public void zaliczPrzedmiot() {
        System.out.println("Student zalicza przedmiot");
    }

    public void panDaTrzy() {
        System.out.println("Student otrzymuje 3");
    }
}
