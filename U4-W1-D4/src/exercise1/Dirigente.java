package exercise1;

public class Dirigente extends Dipendente{
    public Dirigente(Dipartimento dipartimento) {
        super(1000,dipartimento);

    }

    @Override
    public int calculateSalary() {
        return this.stipendio;

    }
}
