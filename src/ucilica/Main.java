package ucilica;

import java.util.*;
import java.util.stream.Collectors;

import static ucilica.Trokut.*;

public class Main {
    static List<Trokut> trokuti = new ArrayList<>();
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

        menu();
        do {


            opcija = izborMenu(scanner);
            switch (opcija) {
                case 1:
                    unos(unosOpcija, scanner);
                    continue;
                case 2:
                    ispis(ispisOpcija, scanner);
                    continue;
                case 3:
                    sortiranje(sortiraniOpcija, scanner);
                    continue;

                case 0:
                    opcija = 0;
                    break;

            }


        } while (opcija != 0);


    }

    public static void ispis(int ispisOpcija, Scanner scanner) {
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


    public static void sortiranje(int sortiraniOpcija, Scanner scanner) {
        menuSortirani();
        sortiraniOpcija = izborMenu(scanner);

        do {
            switch (sortiraniOpcija) {
                case 1:
                    System.out.println(Trokut.sortirajTrokutePoOpsegu(trokuti));
                    menuSortirani();
                    sortiraniOpcija = izborMenu(scanner);
                    continue;
                case 2:
                    Krug.sortirajTrokutePoOpsegu(krugovi);
                    menuSortirani();
                    sortiraniOpcija = izborMenu(scanner);
                    continue;
                case 3:

                    menuSortirani();
                    sortiraniOpcija = izborMenu(scanner);
                case 0:
                    unosOpcija = 0;
                    break;

            }

        } while (sortiraniOpcija != 0);
        menu();

    }


    public static void unos(int unosOpcija, Scanner scanner) {
        menuUnos();
        unosOpcija = izborMenu(scanner);
        do {
            switch (unosOpcija) {
                case 1:
                    trokuti.add(unosTrokuta(scanner));
                    menuUnos();
                    unosOpcija = izborMenu(scanner);
                    continue;
                case 2:
                    krugovi.add(Krug.unosKruga(scanner));
                    menuUnos();
                    unosOpcija = izborMenu(scanner);
                    continue;
                case 3:
                    pravokutnici.add(Pravokutnik.unosPravokutnika(scanner));
                    menuUnos();
                    unosOpcija = izborMenu(scanner);
                case 0:
                    unosOpcija = 0;
                    break;

            }

        } while (unosOpcija != 0);
        menu();

    }

    public static int izborMenu(Scanner scanner) {
        System.out.println("Vaš Izbor : ");
        return scanner.nextInt();
    }

    public static void menuUnos() {
        System.out.println("1 - UNOS TROKUTA");
        System.out.println("2 - UNOS KRUGA");
        System.out.println("3 - UNOS PRAVOKUTNIKA");
        System.out.println("0 - POVRATAK");
    }

    public static void menuIspis() {
        System.out.println("1 - ISPIŠI TROKUTE");
        System.out.println("2 - ISPIŠI KRUGOVE");
        System.out.println("3 - ISPIŠI PRAVOKUTNIKE");
        System.out.println("0 - POVRATAK");
    }

    public static void menuSortirani() {
        System.out.println("1 - SORTIRAJ TROKUTE");
        System.out.println("2 - SORTIRAJ KRUGOVE");
        System.out.println("3 - SORTIRAJ PRAVOKUTNIKE");
        System.out.println("0 - POVRATAK");
    }

    public static void menu() {

        System.out.println("1 - UNOS");
        System.out.println("2 - ISPIS");
        System.out.println("3 - SORTIRANJE");
        System.out.println("0 - IZLAZ");


    }


}
