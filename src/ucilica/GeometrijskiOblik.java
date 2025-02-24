package ucilica;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class GeometrijskiOblik  {
    String naziv;
    double površina ;
    double opseg;




    public GeometrijskiOblik(String naziv, double površina, double opseg) {
        this.naziv = naziv;
        this.površina = površina;
        this.opseg = opseg;
    }

    //    public static List<GeometrijskiOblik> sortirajPoPovršini(List<GeometrijskiOblik> oblici, double površina) {
//        return oblici.stream()
//                .sorted(Comparator.comparing(o ->površina ))
//                .collect(Collectors.toList());
//    }
//    public static List<Object> sortirajPoOpsegu(List<Object> oblici, double opseg) {
//        return oblici.stream()
//                .sorted(Comparator.comparing(o ->opseg ))
//                .collect(Collectors.toList());
//    }



}
