package D_22_Jelena_Stanic;

public class Investitor extends Radnik{
    //broj zgrada
    //30% vecu platu investitoru ako je digao bar 5 zgrada.
        int brojZgrada;


    public Investitor(int ID, String naziv, int godineIskustva, double plata, int brojZgrada) {
        super(ID, naziv, godineIskustva, plata);
        this.brojZgrada = brojZgrada;
    }
        public void stampa(){
            System.out.print("Investitor sa ID brojem "+this.ID+", a pod imenom "+this.naziv + " sa "+this.godineIskustva+" godina iskustva"+ " i izgrađenih "+this.brojZgrada+" zgrada/e, dobija platu od ");
        if (brojZgrada<5){
            System.out.println(this.plata+" dinara.");
        } else {
            System.out.println(this.plata*1.3+" dinara.");
        }
        }
    }


