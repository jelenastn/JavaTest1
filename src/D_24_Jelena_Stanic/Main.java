package D_24_Jelena_Stanic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
Namirnica n1 = new Namirnica("secer", 150);
Namirnica n2 = new Namirnica("brasno", 180);
Namirnica n3 = new Namirnica("cokolada", 100);
Namirnica n4 = new Namirnica("keks", 120);
Namirnica n5 = new Namirnica("jabuke", 150);
Namirnica n6 = new Namirnica("limun", 180);

Korpa k1 = new Korpa();
k1.listaNamirnica.add(n1);
k1.listaNamirnica.add(n2);
k1.listaNamirnica.add(n4);
k1.listaNamirnica.add(n6);
        ArrayList<Namirnica> ukorpi=new ArrayList<Namirnica>();


k1.stampa();
if (k1.nalaziSe(n3.getNaziv())){
    System.out.println("U korpi je "+n3.getNaziv());
}else {
    System.out.println(n3.getNaziv()+" nije u korpi");
}

if (k1.nalaziSe(n6.getNaziv())){
    System.out.println("U korpi je "+n6.getNaziv()+".");
}else {
    System.out.println(n6.getNaziv()+" nije u korpi.");
        }

System.out.println("Ukupna cena kostanja namirnica u korpi je "+k1.suma()+" dinara.");
    }

}
