package ucilica;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Krug {
    private String naziv;
    private double radius;
    private double opseg = 0.0;
    private double površina = 0.0;



    public static List<Krug> sortirajTrokutePoPovršini(List<Krug> krugovi) {
        return krugovi.stream()
                .sorted(Comparator.comparing(b -> b.getPovršina()))
                .collect(Collectors.toList());
    }
    public static List<Krug> sortirajTrokutePoOpsegu(List<Krug> krugovi) {
        return krugovi.stream()
                .sorted(Comparator.comparing(b -> b.getOpseg()))
                .collect(Collectors.toList());
    }
    public static Krug unosKruga(Scanner scanner){
        System.out.print("Unesite Ime kruga :");
        scanner.nextLine();
        String naziv = scanner.nextLine();

        System.out.print("Unesite Radijus :");
        double radius  = scanner.nextDouble();
      return new Krug(naziv,radius);
    }
    public Double površinaKruga(double radius) {

        return Math.pow(radius, 2) * Math.PI;
    }

    public Double opsegKruga(double radius) {

        return 2 * radius * Math.PI;
    }


    public Krug(String naziv, double radius) {
        this.naziv = naziv;
        this.radius = radius;
        this.opseg = opsegKruga(radius);
        this.površina = površinaKruga(radius);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getOpseg() {
        return opseg;
    }

    public double getPovršina() {
        return površina;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return " Kruga " + naziv + " : \n\t\t"+"Površina = " + površina + "\n\t\tOpseg = "  + opseg+"\n";
    }
}
