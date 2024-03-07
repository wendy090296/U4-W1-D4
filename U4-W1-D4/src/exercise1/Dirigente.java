package exercise1;

public class Dirigente extends Dipendente{
    private int salarioBase;
    private int bonus;
    public Dirigente(String nomeDipendente, int bonus) {
        super(nomeDipendente,0);
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary() {
        return salarioBase + bonus;

    }
}
