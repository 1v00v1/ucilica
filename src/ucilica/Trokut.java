package ucilica;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Trokut extends GeometrijskiOblik{

    private double a;
    private double b;
    private double c;




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


    double površina() {
        return (a * b) / 2;
    }


    double opseg() {
        return a + b + c;
    }



    public Trokut(String naziv, double a, double b, double c) {
        super(naziv);
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
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
        return "Trokuta " + naziv + " : \n\t\t"+"Površina = " + površina() + "\n\t\tOpseg = "  + opseg()+"\n";
    }
}