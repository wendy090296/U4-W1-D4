package exercise1;

public class DipendentePartTime extends Dipendente{
    private int pagaOraria;
    public DipendentePartTime(String nomeDipendente, int oreLavorate) {
        super(nomeDipendente,oreLavorate);
        this.pagaOraria= pagaOraria;

    }

    @Override
    public int calculateSalary() {
        return (oreLavorate * pagaOraria);


    }
}
