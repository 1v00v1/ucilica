package ucilica;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pravokutnik {
    String naziv;
    private double a;
    private double b;
    private double opseg = 0.0;
    private double površina = 0.0;


    public static List<Pravokutnik> sortirajPravokutnikPoPovršini(List<Pravokutnik> pravokutnici) {
        return pravokutnici.stream()
                .sorted(Comparator.comparing(b -> b.getPovršina()))
                .collect(Collectors.toList());
    }
    public static List<Pravokutnik> sortirajPravokutnikPoOpsegu(List<Pravokutnik> krugovi) {
        return krugovi.stream()
                .sorted(Comparator.comparing(b -> b.getOpseg()))
                .collect(Collectors.toList());
    }

    public static Pravokutnik unosPravokutnika(Scanner scanner){
        System.out.print("Unesite Ime pravokutnika :");
        scanner.nextLine();
        String naziv = scanner.nextLine();

        System.out.print("Unesite Stranicu a :");
        double a  = scanner.nextDouble();
        System.out.print("Unesite Stranicu b :");
        double b = scanner.nextDouble();

        return  new Pravokutnik(naziv,a,b);
    }

    public Double povrsinaPravokutnika(double a, double b) {
        return a * b;
    }

    public Double opsegPravokutnika(double a, double b) {
        return 2 * (a + b);
    }

    public Pravokutnik(String naziv, double a, double b) {
        this.naziv = naziv;
        this.a = a;
        this.b = b;
        this.opseg = opsegPravokutnika(a, b);
        this.površina = povrsinaPravokutnika(a, b);
    }

    public String getNaziv() {
        return naziv;
    }

    public double getOpseg() {
        return opseg;
    }

    public double getPovršina() {
        return površina;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Površina Pravokutnika " + naziv +" : \n\t\t"+"Površina = " + površina + "\n\t\tOpseg = "  + opseg+"\n";
    }
}
