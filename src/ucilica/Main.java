package ucilica;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


import static ucilica.Menu.*;
import static ucilica.Trokut.unosTrokuta;

public class Main implements Comparable<GeometrijskiOblik> {
    static List<Trokut> trokuti = new ArrayList<>();
    static List<GeometrijskiOblik> oblici = new ArrayList<>();
    static List<Krug> krugovi = new ArrayList<>();
    static List<Pravokutnik> pravokutnici = new ArrayList<>();


    static int opcija = 0;
    static int unosOpcija = 0;
    static int ispisOpcija = 0;
    static int sortiraniOpcija = 0;

    public static void main(String[] args) {

        //TODO Dobili ste projektni zadatak razviti konzolnu aplikaciju „Učilica”.
        // Cilj te aplikacije je pomoći učenicima osnovne škole da lakše savladaju neke značajke osnovnih geometrijskih likova
        // Geometrijski likovi koje ćemo pokriti su: Trokut, Krug i Pravokutnik
        // Trokut je definiran s 3 stranice
        // Kruge je definiran radijusom
        // Pravokutnik je definiran s 2 stranice
        // Svaki geometrijski lik ima svoj Naziv, i možemo mu izračunati Površinu i Opseg.
        // Aplikacija mora omogućiti unos novog geometrijskog lika.
        // Aplikacija mora moći ispisati sve površine i opsege kreiranih geometrijskih likova.
        // Aplikacija mora moći sortirati sve kreirane geometrijske likove po površini uzlazno.
        Scanner scanner = new Scanner(System.in);

        Menu.glavniMenu();
        do {


            opcija = izborMenu(scanner);
            switch (opcija) {
                case 1:
                    unos(scanner);
                    continue;
                case 2:
                    ispis(scanner);
                    continue;
                case 3:
                    sortiranje(scanner);
                    continue;

                case 0:
                    opcija = 0;
                    break;

            }


        } while (opcija != 0);


    }

    public static void sortiranje(Scanner scanner) {
        menuSortirani();

    }

    public static void ispis(Scanner scanner) {
        menuIspis();
        ispisOpcija = izborMenu(scanner);
        do {
            switch (ispisOpcija) {
                case 1:
                    System.out.println(trokuti);
                    menuIspis();
                    ispisOpcija = izborMenu(scanner);
                    continue;
                case 2:
                    System.out.println(krugovi);
                    menuIspis();
                    ispisOpcija = izborMenu(scanner);
                    continue;
                case 3:
                    System.out.println(pravokutnici);
                    menuIspis();
                    ispisOpcija = izborMenu(scanner);
                case 0:
                    ispisOpcija = 0;
                    break;

            }
        } while (ispisOpcija != 0);


    }


    public static void unos(Scanner scanner) {
        menuUnos();
        unosOpcija = izborMenu(scanner);
        do {
            switch (unosOpcija) {
                case 1:
                    trokuti.add(unosTrokuta(scanner));
                    oblici.add(unosTrokuta(scanner));
                    menuUnos();
                    unosOpcija = izborMenu(scanner);
                    continue;
                case 2:
                    krugovi.add(Krug.unosKruga(scanner));
                    oblici.add(Krug.unosKruga(scanner));
                    menuUnos();
                    unosOpcija = izborMenu(scanner);
                    continue;
                case 3:
                    pravokutnici.add(Pravokutnik.unosPravokutnika(scanner));
                    oblici.add(Pravokutnik.unosPravokutnika(scanner));
                    menuUnos();
                    unosOpcija = izborMenu(scanner);
                    continue;
                case 0:
                    unosOpcija = 0;
                    break;

            }

        } while (unosOpcija != 0);
        Menu.glavniMenu();

    }

    public static int izborMenu(Scanner scanner) {
        System.out.println("Vaš Izbor : ");
        return scanner.nextInt();
    }


    @Override
    public int compareTo(GeometrijskiOblik o) {
        return 0;
    }
}
