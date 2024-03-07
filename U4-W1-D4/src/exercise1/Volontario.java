package exercise1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Volontario implements Worker {
    //ATTRIBUTI

    private String nome;
    private int età;
    private String CV;




    // COSTRUTTORE
    public Volontario(String nome, int età,String CV){
        this.nome= nome;
        this.età= età;
        this.CV= CV;

    }

    @Override
    public String toString() {
        return "Volontario{" +
                "nome='" + nome + '\'' +
                ", età=" + età +
                ", CV='" + CV + '\'' +
                '}';
    }
    @Override
    public void checkIn(LocalDateTime time) {
        System.out.println("Sono un " + this.getClass().getSimpleName() + " e ho timbrato alle " + time.format(DateTimeFormatter.ISO_TIME));
    }
}
