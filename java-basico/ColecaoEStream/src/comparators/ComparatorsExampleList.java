package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    public static void main(String[] args) {
        List<Estudante> estudantesNarutoClassico = new ArrayList<>();
        estudantesNarutoClassico.add(new Estudante("Lee", 13));
        estudantesNarutoClassico.add(new Estudante("Neji", 13));
        estudantesNarutoClassico.add(new Estudante("Tentei", 13));
        estudantesNarutoClassico.add(new Estudante("Naruto", 12));
        estudantesNarutoClassico.add(new Estudante("Sasuke", 12));
        estudantesNarutoClassico.add(new Estudante("Sakura", 12));
        estudantesNarutoClassico.add(new Estudante("Kakashi", 26));
        estudantesNarutoClassico.add(new Estudante("Might Guy", 26));
        estudantesNarutoClassico.add(new Estudante("Jiraiya", 50));
        estudantesNarutoClassico.add(new Estudante("Orochimaru", 50));
        estudantesNarutoClassico.add(new Estudante("Tsunade", 51));
        estudantesNarutoClassico.add(new Estudante("Konohamaru", 8));

        System.out.println("---ordem de insercao");
        System.out.println(estudantesNarutoClassico);

        estudantesNarutoClassico.sort((first,second) -> first.getIdade() - second.getIdade());
        System.out.println("---ordem natural dos numeros - idade");
        System.out.println(estudantesNarutoClassico);

        estudantesNarutoClassico.sort((first,second) -> second.getIdade()-first.getIdade() );
        System.out.println("---ordem natural dos numeros reversa - idade");
        System.out.println(estudantesNarutoClassico);

        estudantesNarutoClassico.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("--- ordem natural dos numeros - idade (method reference) ---");
        System.out.println(estudantesNarutoClassico);

        estudantesNarutoClassico.sort(Comparator.comparingInt(Estudante::getIdade).reversed());

        System.out.println("--- ordem natural dos numeros reverse - idade (method reference) ---");
        System.out.println(estudantesNarutoClassico);

        Collections.sort(estudantesNarutoClassico);
        System.out.println("--- ordem natural dos numeros - idade (Interface Comparable) ---");
        System.out.println(estudantesNarutoClassico);

        Collections.sort(estudantesNarutoClassico, new EstudanteOrdemIdadeReversaComparator());
        System.out.println("--- ordem natural dos numeros reversa - idade (Interface Comparator) ---");
        System.out.println(estudantesNarutoClassico);










    }
}
