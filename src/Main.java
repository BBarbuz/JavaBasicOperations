import Figury.Figura;
import Czlowiek.Uczen;
import Czlowiek.Student;
import Czlowiek.Emeryt;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static int zad_3_1(String str, char znak) {
        int licznik = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == znak)
                licznik++;
        }
        return licznik;
    }

    public static int zad_3_2(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c) || Character.isDigit(c)) {
                sum += c;
            }
        }
        return sum;
    }

    public static char zad_3_3(int liczba) {
        return (char) liczba;
    }


    public static String odczytajTekst_3_4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        return scanner.nextLine();
    }

    public static String szyfruj_3_4(String tekst) {
        StringBuilder zaszyfrowanyTekst = new StringBuilder();
        int przesuniecie = 3; // Przesunięcie o 3 litery w prawo

        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);

            if (Character.isLetter(znak)) {
                if (Character.isUpperCase(znak)) {
                    char zaszyfrowanyZnak = (char) ((znak - 'A' + przesuniecie) % 26 + 'A');
                    zaszyfrowanyTekst.append(zaszyfrowanyZnak);
                } else {
                    char zaszyfrowanyZnak = (char) ((znak - 'a' + przesuniecie) % 26 + 'a');
                    zaszyfrowanyTekst.append(zaszyfrowanyZnak);
                }
            } else {
                zaszyfrowanyTekst.append(znak);
            }
        }

        return zaszyfrowanyTekst.toString();
    }

    public static String deszyfruj_3_4(String zaszyfrowanyTekst) {
        StringBuilder odszyfrowanyTekst = new StringBuilder();
        int przesuniecie = 3; // Przesunięcie o 3 litery w lewo

        for (int i = 0; i < zaszyfrowanyTekst.length(); i++) {
            char znak = zaszyfrowanyTekst.charAt(i);

            if (Character.isLetter(znak)) {
                if (Character.isUpperCase(znak)) {
                    char odszyfrowanyZnak = (char) ((znak - 'A' - przesuniecie + 26) % 26 + 'A');
                    odszyfrowanyTekst.append(odszyfrowanyZnak);
                } else {
                    char odszyfrowanyZnak = (char) ((znak - 'a' - przesuniecie + 26) % 26 + 'a');
                    odszyfrowanyTekst.append(odszyfrowanyZnak);
                }
            } else {
                odszyfrowanyTekst.append(znak);
            }
        }

        return odszyfrowanyTekst.toString();
    }

    public static boolean sprawdzCzyPalindrom_3_4(String tekst) {
        String tekstBezSpacji = tekst.replaceAll("\\s+", "").toLowerCase();
        String odwroconyTekst = new StringBuilder(tekstBezSpacji).reverse().toString();

        return tekstBezSpacji.equals(odwroconyTekst);
    }

    public static String dectobin_3_5() {
        System.out.println("Podaj liczbe w systemie dziesietnym: ");
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();

        System.out.println("Zadana liczba (dec): " + dec);

        StringBuilder binarny = new StringBuilder();
        while (dec > 0) {
            binarny.append((char) dec % 2);
            dec = dec / 2;

        }
        String bin = binarny.reverse().toString();
        System.out.println("Zadana liczba (bin): " + bin);

        return bin;
    }

    // Metoda pobierająca największą sekwencję zer
    public static Integer sekwencjaZer_3_5(String liczbaBinarne) {
        int maksDlugosc = 0;
        int aktualnaDlugosc = 0;

        for (int i = 0; i < liczbaBinarne.length(); i++) {
            if (liczbaBinarne.charAt(i) == '0') {
                aktualnaDlugosc++;
            } else {
                maksDlugosc = Math.max(maksDlugosc, aktualnaDlugosc);
                aktualnaDlugosc = 0;
            }
        }

        // Sprawdzenie ostatniej sekwencji na końcu liczby
        maksDlugosc = Math.max(maksDlugosc, aktualnaDlugosc);

        if (maksDlugosc > 0) {

            return maksDlugosc;
        } else {
            return null; // Brak sekwencji zer
        }
    }

    public static int[] tab1_4_1() {
        int[] tab = new int[100];
        for (int i = 0; i < 100; i++) {
            tab[i] = i;
        }
        return tab;
    }

    public static void tab2_4_1(int[] tab) {
        for (int i = 0; i < 100; i++) {
            if (tab[i] % 10 == 0)
                System.out.println();

            if (tab[i] < 10)
                System.out.print("0" + tab[i] + ", ");
            else
                System.out.print(tab[i] + ", ");
        }
        System.out.println();
        System.out.println("Średnia poszczególnych wierszy: ");

        int suma;
        for (int i = 0; i < 10; i++) {
            suma = 0;
            for (int j = 0; j < 100; j += 10) {
                suma += tab[i + j];
            }
            System.out.print(suma / 10 + ", ");
        }
    }

    public static void tab4_2() {
        Random rnd = new Random();
        int x = rnd.nextInt(11) + 10;
        int[][] tab = new int[x][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    if (rnd.nextInt(2) == 0)
                        tab[i][j] = 1;
                    else
                        tab[i][j] = -1;
                } else
                    tab[i][j] = rnd.nextInt(41) - 20;

            }

        }

        int suma_parz = 0;
        int suma_nparz = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i % 2 == 0) {
                    suma_parz += tab[i][j];

                } else
                    suma_nparz += tab[i][j];
            }
        }
        System.out.println("Stosunek sumy wynosi: " + suma_parz + " do " + suma_nparz);

    }

    public static Okrag[] utworzTabliceOkregow(int liczbaOkregow) {
        Okrag[] okregi = new Okrag[liczbaOkregow];
        for (int i = 0; i < liczbaOkregow; i++) {
            okregi[i] = new Okrag();
        }
        return okregi;
    }

    public static void wyswietlPolaOkregu(Okrag okrag) {
        System.out.println("Wspolrzedne x: " + okrag.getX());
        System.out.println("Wspolrzedne y: " + okrag.getY());
        System.out.println("Promien: " + okrag.getPromien());
        System.out.println();
    }

    public static void sprawdzWzajemnePolozenie(Okrag okrag1, Okrag okrag2) {
        double odlegloscMiedzySrodkami = Math.sqrt(Math.pow(okrag2.getX() - okrag1.getX(), 2) +
                Math.pow(okrag2.getY() - okrag1.getY(), 2));
        double sumaPromieni = okrag1.getPromien() + okrag2.getPromien();

        if (odlegloscMiedzySrodkami == sumaPromieni) {
            System.out.println("Okręgi są styczne.");
        } else if (odlegloscMiedzySrodkami > sumaPromieni) {
            System.out.println("Okręgi są rozłączne.");
        } else if (odlegloscMiedzySrodkami < sumaPromieni) {
            System.out.println("Okręgi się przecinają.");
        } else if (odlegloscMiedzySrodkami == 0 && okrag1.getPromien() == okrag2.getPromien()) {
            System.out.println("Okręgi są pokrywające się.");
        }
    }

    public static void liczbaRzeczywista_6_2() {

        Scanner scanner = new Scanner(System.in);
        double liczba;

        while (true) {
            try {
                System.out.println("Podaj liczbę zmiennoprzecinkową:");
                liczba = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Błąd: Wprowadzono niepoprawny znak. Spróbuj ponownie.");
                scanner.nextLine(); // Wyczyszczenie bufora wejściowego
            }
        }

        try {

            // Pobranie cechy i mantysy
            int cecha = (int) Math.floor(Math.abs(liczba));
            double mantysa = liczba % cecha;

            // Wyświetlenie cechy i mantysy
            System.out.println("Cecha: " + cecha);
            System.out.println("Mantysa: " + mantysa);

            // Obliczenie ilorazu cechy i mantysy
            double iloraz = cecha / mantysa;
            System.out.println("Iloraz cechy i mantysy: " + iloraz);

        } catch (InputMismatchException e) {
            System.out.println("Błąd: Wprowadzono niepoprawny znak.");
        } catch (ArithmeticException e) {
            System.out.println("Błąd: Nie można dzielić przez zero.");
        } finally {
            scanner.close();
        }

    }

    private static int pobierzLiczbe(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Podaj liczbę całkowitą z zakresu <99,999>:");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Błąd: Wprowadzono niepoprawny znak. Spróbuj ponownie.");
                scanner.nextLine(); // Wyczyszczenie bufora wejściowego
            }
        }
    }

    private static int sumaKwadratowCyfr(int liczba) {
        int suma = 0;
        while (liczba != 0) {
            int cyfra = liczba % 10;
            suma += cyfra * cyfra;
            liczba /= 10;
        }
        return suma;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Interface for main method 
        System.out.println("LABORATORIUM 3. TWORZENIE APLIKACJI OBIEKTOWYCH DO\n" +
                "PRZETWARZANIA TEKSTU.");
        System.out.println("[1] Zadanie 3.1. Obecność w łańcuchu");
        System.out.println("[2] Zadanie 3.2. Suma ASCII");
        System.out.println("[3] Zadanie 3.3. Liczba na znak");
        System.out.println("[4] Zadanie 3.4. Szyfr Cezara");
        System.out.println("[5] Zadanie 3.5. Binarna zerówka");
        System.out.println();
        System.out.println("LABORATORIUM 4. TWORZENIE APLIKACJI OBIEKTOWYCH\n" +
                "WYKORZYSTUJĄCYCH FUNKCJE MATEMATYCZNE.");
        System.out.println("[6] Zadanie 4.1. Tablica jednowymiarowa");
        System.out.println("[7] Zadanie 4.2. Tablica dwuwymiarowa");
        System.out.println("[8] Zadanie 4.3. Klasa Okrag");
        System.out.println();
        System.out.println("LABORATORIUM 5. PROGRAMOWANIE OBIEKTOWE Z WYKORZYSTANIEM\n" +
                "DZIEDZICZENIA I INTERFEJSÓW.");
        System.out.println("[9] Zadanie 5.1. Dziedziczenie");
        System.out.println("[10] Zadanie 5.2. Klasa abstrakcyjna i interfejs");
        System.out.println();
        System.out.println("LABORATORIUM 6. OBSŁUGA WYJĄTKÓW.");
        System.out.println("[11] Zadanie 6.1. Kalkulator");
        System.out.println("[12] Zadanie 6.2. Pobieranie liczby rzeczywistej");
        System.out.println("[13] Zadanie 6.3. Pobieranie liczby całkowitej");
        System.out.println();

        System.out.println("Wpisz numer zadania: ");
        int taskChoice = scanner.nextInt();

        String strScanner; // used for String input data for multiple below cases
        int intScanner; // used for input int data for multiple below cases
        
        switch (taskChoice) {
            case 1:

                System.out.println("Podaj łańcuch znaków: ");
                strScanner = scanner.next();
                System.out.println("Podaj szukany znak: ");
                char charScanner = scanner.next().charAt(0);
                System.out.println("Wynik: " + zad_3_1(strScanner, charScanner));

                break;

            case 2:
                System.out.println("Podaj łańcuch znaków ASCII: ");
                strScanner = scanner.next();
                System.out.println("Wynik: " + zad_3_2(strScanner));

                break;

            case 3:
                System.out.println("Podaj liczbe <33, 126>: ");
                intScanner = scanner.nextInt();
                System.out.println("Wynik: " + zad_3_3(intScanner));

                break;

            case 4:

                String text = odczytajTekst_3_4();

                String zaszyfrowanyTekst = szyfruj_3_4(text);
                System.out.println("Zaszyfrowany tekst: " + zaszyfrowanyTekst);

                String odszyfrowanyTekst = deszyfruj_3_4(zaszyfrowanyTekst);
                System.out.println("Odszyfrowany tekst: " + odszyfrowanyTekst);

                System.out.print("Podaj tekst do sprawdzenia czy jest palindromem: ");
                String tekstDoSprawdzenia = scanner.next();

                boolean czyPalindrom = sprawdzCzyPalindrom_3_4(tekstDoSprawdzenia);
                System.out.println("Czy tekst jest palindromem? " + czyPalindrom);

                break;

            case 5:
                Integer wynik = sekwencjaZer_3_5(dectobin_3_5());
                if (wynik == null) {
                    System.out.println("Brak sekwencji zer.");
                    break;
                }
                System.out.println("Największa sekwencja zer to: " + wynik);
                break;

            case 6: // Zadanie 4.1. Tablica jednowymiarowa
                int[] tab = tab1_4_1();
                tab2_4_1(tab);
                break;

            case 7: // Zadanie 4.2. Tablica dwuwymiarowa
                tab4_2();

                break;

            case 8: // Zadanie 4.3. Klasa Okrag
                Okrag[] okregi = utworzTabliceOkregow(3);

                for (Okrag okrag : okregi) {
                    wyswietlPolaOkregu(okrag);
                }

                Okrag okrag1 = okregi[0];
                Okrag okrag2 = okregi[1];

                sprawdzWzajemnePolozenie(okrag1, okrag2);
                break;

            case 9: // Zadanie 5.1. Dziedziczenie
                Figura zadanie5_1 = new Figura();
                zadanie5_1.printMessage();
                break;

            case 10: // Zadanie 5.2. Klasa abstrakcyjna i interfejs
                Uczen wojtus = new Uczen(8, "lubi sie bawic zabawkami");
                Student piotrek = new Student();
                Emeryt zbigniew = new Emeryt();

                zbigniew.setWiek(87);
                zbigniew.setCechy("Przytulny dziadus");

                wojtus.wstan();
                wojtus.getWiek();
                wojtus.getCechy();
                wojtus.odrobLekcje();
                wojtus.bawSieZPrzyjaciolmi();
                wojtus.pij();
                wojtus.uczSie();
                wojtus.odprezSie();
                wojtus.jedz();
                wojtus.spij();

                System.out.println();

                piotrek.wstan();
                piotrek.nieIdzNaZajecia();
                piotrek.spij();
                piotrek.wstan();
                piotrek.wlaczSwojSerial();
                piotrek.jedz();
                piotrek.studiuj();
                piotrek.zaliczPrzedmiot();
                piotrek.panDaTrzy();
                piotrek.spij();

                System.out.println();

                zbigniew.getWiek();
                zbigniew.getCechy();
                zbigniew.wstan();
                zbigniew.nakarmKota();
                zbigniew.idzDoLekarza();
                zbigniew.spij();
                zbigniew.wstan();
                zbigniew.nakarmKota();
                zbigniew.odbierzEmeryture();
                zbigniew.jedz();
                zbigniew.pij();
                zbigniew.odpoczywaj();
                break;

            case 11: // Zadanie 6.1. Kalkulator

                try (Scanner scanner2 = new Scanner(System.in)) {
                    System.out.println("Podaj pierwszą liczbę:");
                    double liczba1 = scanner2.nextDouble();

                    System.out.println("Podaj operator (+, -, *, /, sqrt, ^):");
                    String operator = scanner2.next();
                    scanner2.close();

                    if (operator.equals("sqrt")) {
                        // Pierwiastkowanie
                        if (liczba1 < 0) {
                            throw new IllegalArgumentException("Nie można obliczyć pierwiastka z liczby ujemnej.");
                        }
                        double wynik2 = Math.sqrt(liczba1);
                        System.out.println("Wynik: " + wynik2);
                    } else {
                        System.out.println("Podaj drugą liczbę:");
                        double liczba2 = scanner2.nextDouble();

                        double wynik2;

                        switch (operator) {
                            case "+":
                                wynik2 = liczba1 + liczba2;
                                break;
                            case "-":
                                wynik2 = liczba1 - liczba2;
                                break;
                            case "*":
                                wynik2 = liczba1 * liczba2;
                                break;
                            case "/":
                                // Dzielenie
                                if (liczba2 == 0) {
                                    throw new ArithmeticException("Nie można dzielić przez zero.");
                                }
                                wynik2 = liczba1 / liczba2;
                                break;
                            case "^":
                                // Potęgowanie
                                wynik2 = Math.pow(liczba1, liczba2);
                                break;
                            default:
                                throw new IllegalArgumentException("Niepoprawny operator.");
                        }

                        System.out.println("Wynik: " + wynik2);
                    }

                } catch (Exception e) {
                    System.out.println("Błąd: " + e.getMessage());
                }

                break;

            case 12: // Zadanie 6.2. Pobieranie liczby rzeczywistej
                liczbaRzeczywista_6_2();
                break;

            case 13: // Zadanie 6.3. Pobieranie liczby całkowitej

                Scanner scanner3 = new Scanner(System.in);

                while (true) {
                    try {

                        int liczba = pobierzLiczbe(scanner3);

                        // Sprawdź, czy liczba należy do zakresu <99,999>
                        if (liczba < 99 || liczba > 999) {
                            throw new IllegalArgumentException("Liczba musi być z zakresu <99,999>.");
                        }

                        // Zwróć sumę kwadratów cyfr
                        int sumaKwadratow = sumaKwadratowCyfr(liczba);
                        System.out.println("Suma kwadratów cyfr liczby " + liczba + " to: " + sumaKwadratow);
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Błąd: Wprowadzono niepoprawny znak. Spróbuj ponownie.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Błąd: " + e.getMessage());
                    }
                }
                scanner3.close();
                scanner.close();
                break;
        }

    }
}
