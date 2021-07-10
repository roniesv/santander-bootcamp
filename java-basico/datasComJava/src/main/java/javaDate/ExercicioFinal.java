package javaDate;
import java.util.Date;

public class ExercicioFinal {
    public static void main(String[] args) {
        long dtNasc = 644688000000L;
        long dtCompare = 1273892400000L;
        boolean ant, post;

        Date dataNascimento = new Date(dtNasc);
        Date dataCompare = new Date(dtCompare) ;

        post = dataNascimento.after(dataCompare);
        System.out.println("Depois? "+post);
        System.out.println(dataNascimento);
        System.out.println(dataCompare);

        ant = dataNascimento.before(dataCompare);
        System.out.println("Antes? " +ant);
        System.out.println(dataNascimento);
        System.out.println(dataCompare);

    }
}
