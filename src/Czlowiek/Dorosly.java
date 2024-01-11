package Czlowiek;

abstract class Dorosly extends Czlowiek{
    public void jedz(){
        System.out.println("Dorosly je kluski");
    }

    public void pij(){
        System.out.println("Dorosly pije wino");
    }

    abstract void zabawa();
    abstract void obowiazki();
    abstract void spotkania();
    abstract void aktywnoscFizyczna();
}
