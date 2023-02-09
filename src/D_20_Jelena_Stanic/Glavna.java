package D_20_Jelena_Stanic;

public class Glavna {
    public static void main(String[] args) {
      /*  Zadatak 1.
        Napraviti klasu Knjiga koja ce imati naziv i zanr.
         U glavnoj klasi napraviti dve knjige, zatim proveriti
         da li imaju isti zanr i naziv, ako imaju, ispisati poruku
          da je u pitanju ista knjiga, ako je samo zanr isti,
          ispisati poruku koji je to zanr, ako nista od toga nije isto,
           ispisati poruku da su u pitanju dve razlicite knjige.
Provera 1
       Knjiga knjiga1 = new Knjiga ("Dvostruka prevara", "triler");
       Knjiga knjiga2 = new Knjiga ("Mačka među golubovima", "triler");
Provera 2
        Knjiga knjiga1 = new Knjiga ("Dvostruka prevara", "triler");
        Knjiga knjiga2 = new Knjiga ("Dvostruka prevara", "triler");

       */
        Knjiga knjiga1 = new Knjiga ("Obris", "drama");
        Knjiga knjiga2 = new Knjiga ("Mačka među golubovima", "triler");

if (knjiga1.naziv.equalsIgnoreCase(knjiga2.naziv) && knjiga1.zanr.equalsIgnoreCase(knjiga2.zanr)){
    System.out.println("U pitanji je ista knjiga sa nazivom: "+knjiga1.naziv+".");
} else if(knjiga1.zanr.equalsIgnoreCase(knjiga2.zanr)) {
    System.out.println("Isti zanr knjiga - "+knjiga1.zanr+".");
        } else {
    System.out.println("U pitanju su dve različite knjige: "+knjiga1.naziv+" i "+knjiga2.naziv+".");

        }







    }

}
