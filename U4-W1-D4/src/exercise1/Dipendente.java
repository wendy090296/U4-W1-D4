package exercise1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;

public abstract class Dipendente {
    // attributi
    private int matricola; // accessibile solo dalla classe stessa
    protected int stipendio;
    private Dipartimento dipartimento; // accessibile da altre classi





    // costruttore I esercizio
   public Dipendente( int stipendio, Dipartimento dipartimento){
       Random rndm= new Random();
      this.matricola = rndm.nextInt(10000,99999);
       this.stipendio = stipendio;
       this.dipartimento = dipartimento;
    }

    public abstract int calculateSalary();


   public int getMatricola() { // perché matricola é private;
        return matricola;
    }

    public Dipartimento getDipartimento(){
       return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento){
       this.dipartimento= dipartimento;
    }
 public void checkIn(LocalDateTime time){
     System.out.println("Sono un " + this.getClass().getSimpleName() + " e ho timbrato alle " + time.format(DateTimeFormatter.ISO_DATE_TIME));
 }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }
}







