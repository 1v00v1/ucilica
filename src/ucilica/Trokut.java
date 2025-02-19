package ucilica;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Trokut {
    String naziv;
    private double a;
    private double b;
    private double c;
    private double opseg = 0.0;
    private double površina = 0.0;

    public static List<Trokut> sortirajTrokutePoPovršini(List<Trokut> trokuti) {
        return trokuti.stream()
                .sorted(Comparator.comparing(b -> b.getPovršina()))
                .collect(Collectors.toList());
    }
    public static List<Trokut> sortirajTrokutePoOpsegu(List<Trokut> trokuti) {
        return trokuti.stream()
                .sorted(Comparator.comparing(b -> b.getOpseg()))
                .collect(Collectors.toList());
    }

    public static Trokut unosTrokuta(Scanner scanner){
        System.out.print("Unesite Ime trokuta :");
        scanner.nextLine();
        String naziv = scanner.nextLine();

        System.out.print("Unesite Stranicu a :");
        double a  = Double.parseDouble(scanner.nextLine());
        System.out.print("Unesite Stranicu b :");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Unesite Stranicu c :");
        double c = Double.parseDouble(scanner.nextLine());
        return  new Trokut(naziv,a,b,c);
    }

    public Double opsegTrokuta(double a, double b, double c) {
        return a + b + c;
    }

    public Double povrsinaTrokuta(double a, double b) {
        return (a * b) / 2;
    }

    public Trokut(String naziv, double a, double b, double c) {
        this.naziv = naziv;
        this.a = a;
        this.b = b;
        this.c = c;
        this.opseg = opsegTrokuta(this.a, this.b, this.c);
        this.površina = povrsinaTrokuta(this.a, this.b);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getPovršina() {
        return površina;
    }

    public double getOpseg() {
        return opseg;
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

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Trokuta " + naziv + " : \n\t\t"+"Površina = " + površina + "\n\t\tOpseg = "  + opseg+"\n";
    }
}