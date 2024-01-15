import java.util.Random;

public class Okrag {

    private final double x;
    private final double y;
    private final double promien;

    public Okrag() {
        Random rand = new Random();
        this.x = rand.nextDouble() * (95 - 5) + 5; // Losowa liczba z zakresu <5, 95>
        this.y = rand.nextDouble() * (95 - 5) + 5; // Losowa liczba z zakresu <5, 95>
        this.promien = rand.nextDouble() * (5 - 1) + 1; // Losowa liczba z zakresu <1, 5>
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getPromien() {
        return promien;
    }
} // Do zadania 4.3. Klasa Okrag

