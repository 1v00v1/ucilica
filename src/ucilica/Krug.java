package ucilica;

import java.util.Scanner;

public class Krug extends GeometrijskiOblik implements Comparable<GeometrijskiOblik>{

private static double radius;

    public Krug(String naziv, double površina, double opseg, double radius) {
        super(naziv, površina, opseg);
        this.radius = radius;
    }

    public static Krug unosKruga(Scanner scanner){
        System.out.print("Unesite Ime kruga :");
        scanner.nextLine();
        String naziv = scanner.nextLine();

        System.out.print("Unesite Radijus :");
         radius  = scanner.nextDouble();

      return new Krug(naziv,površina(),opseg(),radius);
    }



    @Override
    public String toString() {
        return " Kruga " + naziv + " : \n\t\t"+"Površina = " + površina() + "\n\t\tOpseg = "  + opseg()+"\n";
    }



    static double površina() {
        return Math.pow(radius,2) *Math.PI;
    }


   static double opseg() {
        return 2*radius*Math.PI;
    }


    @Override
    public int compareTo(GeometrijskiOblik o) {
        return 0;
    }
}
