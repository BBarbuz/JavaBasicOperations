package Czlowiek;

abstract class Dziecko extends Czlowiek{

    protected int wiek;
    protected String cechy;
    public void jedz(){
        System.out.println("Dziecko je kaszke");
    }

   public void pij(){
        System.out.println("Dziecko pije soczek");
    }

    abstract void zabawa();
    abstract void obowiazki();
    abstract void spotkania();
    abstract void aktywnoscFizyczna();
}
