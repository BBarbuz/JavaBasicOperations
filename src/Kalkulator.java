import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Podaj pierwszą liczbę:");
            double liczba1 = scanner.nextDouble();

            System.out.println("Podaj operator (+, -, *, /, sqrt, ^):");
            String operator = scanner.next();

            if (operator.equals("sqrt")) {
                // Pierwiastkowanie
                if (liczba1 < 0) {
                    throw new IllegalArgumentException("Nie można obliczyć pierwiastka z liczby ujemnej.");
                }
                double wynik = Math.sqrt(liczba1);
                System.out.println("Wynik: " + wynik);
            } else {
                System.out.println("Podaj drugą liczbę:");
                double liczba2 = scanner.nextDouble();

                double wynik;

                switch (operator) {
                    case "+":
                        wynik = liczba1 + liczba2;
                        break;
                    case "-":
                        wynik = liczba1 - liczba2;
                        break;
                    case "*":
                        wynik = liczba1 * liczba2;
                        break;
                    case "/":
                        // Dzielenie
                        if (liczba2 == 0) {
                            throw new ArithmeticException("Nie można dzielić przez zero.");
                        }
                        wynik = liczba1 / liczba2;
                        break;
                    case "^":
                        // Potęgowanie
                        wynik = Math.pow(liczba1, liczba2);
                        break;
                    default:
                        throw new IllegalArgumentException("Niepoprawny operator.");
                }

                System.out.println("Wynik: " + wynik);
            }

        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}