package exercise1;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;

    public DipendentePartTime(int stipendio, Dipartimento dipartimento) {
        super(stipendio, dipartimento);
        this.oreLavorate = 0;

    }

    @Override
    public int calculateSalary() {
        return oreLavorate * this.stipendio;
    }

    public void aggiungiOre(int ore) {
        if (ore < 0)
            this.oreLavorate += ore;
        else System.out.println("Il numero di ore deve essere positivo");
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + this.getMatricola() +
                ", stipendio=" + this.calculateSalary() +
                ", dipartimento=" + this.getDipartimento() +
                '}';


    }
}