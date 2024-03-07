package exercise1;

public class DipendenteFullTime extends Dipendente{

    public DipendenteFullTime(int stipendio, Dipartimento dipartimento) {
        super( stipendio, dipartimento);

    }

    @Override
    public int calculateSalary() {
        return this.stipendio;

    }
}
