package ucilica;

import java.util.Scanner;

public class Pravokutnik extends GeometrijskiOblik implements Comparable<GeometrijskiOblik>{

    private static double a;
    private static double b;



    public static Pravokutnik unosPravokutnika(Scanner scanner) {
        System.out.print("Unesite Ime pravokutnika :");
        scanner.nextLine();
        String naziv = scanner.nextLine();

        System.out.print("Unesite Stranicu a :");
         a = scanner.nextDouble();
        System.out.print("Unesite Stranicu b :");
        b = scanner.nextDouble();

        return new Pravokutnik(naziv,površina(),opseg());
    }

    static double površina() {
        return a * b;
    }


    static double opseg() {
        return 2 * (a + b);
    }

    public Pravokutnik(String naziv, double površina, double opseg) {
        super(naziv, površina, opseg);
    }



    @Override
    public String toString() {
        return "Površina Pravokutnika " + naziv + " : \n\t\t" + "Površina = " + površina() + "\n\t\tOpseg = " + opseg() + "\n";
    }

    @Override
    public int compareTo(GeometrijskiOblik o) {
        return 0;
    }
}
