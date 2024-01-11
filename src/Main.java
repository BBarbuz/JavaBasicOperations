import Figury.Figura;
import Czlowiek.Uczen;
import Czlowiek.Student;
import Czlowiek.Emeryt;

import java.util.Random;
import java.util.Scanner;

class Okrag {
    private double x;
    private double y;
    private double promien;

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

                //System.out.print(tab[i][j]+" ");
            }
            //System.out.println();
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


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wpisz numer zadania: ");
        int zad = sc.nextInt();
        String a;
        int l;

        switch (zad) {
            case 1:

                System.out.println("Podaj łańcuch znaków: ");
                a = sc.next();
                System.out.println("Podaj szukany znak: ");
                char c = sc.next().charAt(0);
                System.out.println("Wynik: " + zad_3_1(a, c));

                break;

            case 2:

                System.out.println("Podaj łańcuch znaków ASCII: ");
                a = sc.next();
                System.out.println("Wynik: " + zad_3_2(a));

                break;

            case 3:

                System.out.println("Podaj liczbe <33, 126>: ");
                l = sc.nextInt();
                System.out.println("Wynik: " + zad_3_3(l));

                break;

            case 4:

                String tekst = odczytajTekst_3_4();

                String zaszyfrowanyTekst = szyfruj_3_4(tekst);
                System.out.println("Zaszyfrowany tekst: " + zaszyfrowanyTekst);

                String odszyfrowanyTekst = deszyfruj_3_4(zaszyfrowanyTekst);
                System.out.println("Odszyfrowany tekst: " + odszyfrowanyTekst);

                System.out.print("Podaj tekst do sprawdzenia czy jest palindromem: ");
                String tekstDoSprawdzenia = sc.next();

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

            case 9: // Zadanie 5.1. Klasa Okrag
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
        }

    }
}