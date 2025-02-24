package ucilica;

public class Menu {

    public static void glavniMenu() {

        System.out.println("1 - UNOS");
        System.out.println("2 - ISPIS");
        System.out.println("3 - SORTIRANJE");
        System.out.println("0 - IZLAZ");

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
        System.out.println("1 - SORTIRAJ PO POVRŠINI");
        System.out.println("2 - SORTIRAJ PO OPSEGU");
        System.out.println("0 - POVRATAK");
    }


}
