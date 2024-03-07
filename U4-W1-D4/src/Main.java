import exercise1.*;


public class Main {
    public static void main(String[] args) {
        //istanze a partire dalla classe Dipendente
//        Dipendente dipendente1=new Dipendente("54120058765",2000,Dipartimento.VENDITE);
//        Dipendente dipendente2= new Dipendente("2897611235",2800,Dipartimento.PRODUZIONE);
//        Dipendente dipendente3= new Dipendente("15921476800",3500,Dipartimento.AMMINISTRAZIONE);
//
//
//
//        Dipendente[] dipendenti={dipendente1,dipendente2,dipendente3};
//
//
//
//        for (int i = 0; i <dipendenti.length; i++) {
//            Dipendente dipendenteCorrente= dipendenti[i];
//            System.out.println("La matricola del " + dipendenti[i]+"é:" + dipendenti[i].getMatricola());


//
//        }
//
//    }

        Dipendente[] dipendenti = new Dipendente[4];
       Dipendente dipendenti1 = new DipendenteFullTime("Mario Bianchi", 2000);
        Dipendente dipendenti3 = new DipendentePartTime("Giorgio DiCaprio", 15);
       Dipendente dipendenti4 = new Dirigente("Greta Sanchez", 300);
//

int salarioTotaleDipendenti=0;
        for (int i = 0; i <dipendenti.length ; i++) {
            salarioTotaleDipendenti+=dipendenti.calculateSalary();
            
        }
    }

}