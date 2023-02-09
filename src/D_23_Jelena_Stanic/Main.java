package D_23_Jelena_Stanic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Jelo j1 = new Jelo("sarma",true);
        Jelo j2 = new Jelo("torta", false);
        Jelo j3 = new Jelo("corba", true);

        Sarma s1 = new Sarma("juneća sarma", true);
        Sarma s2 = new Sarma("sarma sa mesanim mesom", true);
        Sarma s3 = new Sarma("sarma sa vinovom lozom", false);

        Torta t1 = new Torta("Vasina torta", false);
        Torta t2 = new Torta("Madjarica", true);
        Torta t3 = new Torta("Voćna torta",true);

        Corba c1 = new Corba("teleca corba", false);
        Corba c2 = new Corba("pileca corba", true);
        Corba c3 = new Corba("corba sa povrcem", true);

        j1.listaSastojaka.add("mleveno meso");
        j1.listaSastojaka.add("kupus");
        j1.listaSastojaka.add("pirinac");

        j2.listaSastojaka.add("cokolada");
        j2.listaSastojaka.add("brasno");
        j2.listaSastojaka.add("mleko");
        j2.listaSastojaka.add("jaja");

        j3.listaSastojaka.add(" teletina");
        j3.listaSastojaka.add("povrce");
        j3.listaSastojaka.add("zacin");
        j3.listaSastojaka.add("mleko");

        s1.listaSastojaka.add("junece meso");
        s1.listaSastojaka.add("kupus");
        s1.listaSastojaka.add("mleko");

        s2.listaSastojaka.add("mesano meso");
        s2.listaSastojaka.add("vinova loza");
        s2.listaSastojaka.add("mleko");


        s3.listaSastojaka.add("junece meso");
        s3.listaSastojaka.add("kupus");
        s3.listaSastojaka.add("luk");

        t1.listaSastojaka.add("cokolada");
        t1.listaSastojaka.add("jaja");
        t1.listaSastojaka.add("orasi");

        t2.listaSastojaka.add("mleko");
        t2.listaSastojaka.add("brasno");
        t2.listaSastojaka.add("jaja");


        t3.listaSastojaka.add("maline");
        t3.listaSastojaka.add("keks");
        t3.listaSastojaka.add("šećer");

        c1.listaSastojaka.add("teletina");
        c1.listaSastojaka.add("povrce");
        c1.listaSastojaka.add("zacin");

        c2.listaSastojaka.add("piletina");
        c2.listaSastojaka.add("povrce");
        c2.listaSastojaka.add("mleko");


        c3.listaSastojaka.add("sargarepa");
        c3.listaSastojaka.add("krompir");
        c3.listaSastojaka.add("celer");

        j1.BezLaktoze();
        j2.BezLaktoze();
        j3.BezLaktoze();

        s1.BezLaktoze();
        s2.BezLaktoze();
        s3.BezLaktoze();

        t1.BezLaktoze();
        t2.BezLaktoze();
        t3.BezLaktoze();
        
        c1.BezLaktoze();
        c2.BezLaktoze();
        c3.BezLaktoze();

        j1.stampa();
        j2.stampa();
        j3.stampa();

        s1.stampa();
        s2.stampa();
        s3.stampa();

        t1.stampa();
        t2.stampa();
        t3.stampa();

        c1.stampa();
        c2.stampa();
        c3.stampa();


    }


}
