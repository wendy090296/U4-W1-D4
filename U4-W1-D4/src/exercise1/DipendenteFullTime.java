package exercise1;

public class DipendenteFullTime extends Dipendente{
    private int pagaMensile;
    public DipendenteFullTime(String matricola, int stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
        this.pagaMensile= pagaMensile;
    }

    @Override
    public int calculateSalary() {
        return pagaMensile;

    }
}
