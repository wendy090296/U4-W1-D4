package exercise1;

import java.util.Arrays;

public abstract class Dipendente {
    // attributi
    private String matricola; // accessibile solo dalla classe stessa
    private int stipendio;
    public Dipartimento dipartimento; // accessibile da altre classi

    


    // costruttore I esercizio
//    public Dipendente(String matricola, int stipendio, Dipartimento dipartimento){
//        this.matricola = matricola;
//        this.stipendio = stipendio;
//        this.dipartimento = dipartimento;
//    }

    // costruttore II esercizio

    public Dipendente(String matricola, int stipendio, Dipartimento dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }




    //public Dipendente()
//    public String getMatricola() { // perché matricola é private;
//        return matricola;
//    }

//    @Override
//    public String toString() {
//        return "Dipendente{" +
//                "matricola='" + matricola + '\'' +
//
//                '}';
//
//
//    }

    public abstract int calculateSalary();


}


