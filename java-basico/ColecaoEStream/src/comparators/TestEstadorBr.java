package comparators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestEstadorBr {

    public static void main(String[] args) {
            List<Estado> estados = new ArrayList<Estado>();
            Estado df = new Estado("Distrito Federal", 3);
            Estado go= new Estado("Goias", 3);
            Estado mt = new Estado("Mato Grosso", 3);
            Estado mts = new Estado("Mato Grosso do Sul", 3);

            Estado sp = new Estado("Sao Paulo", 4);
            Estado rj= new Estado("Rio de Janeiro", 4);
            Estado es = new Estado("Espirito Santo", 4);
            Estado mg = new Estado("Minas Gerais", 4);


            TestEstadorBr lista = new TestEstadorBr();
            estados.add(df);
            estados.add(go);
            estados.add(mt);
            estados.add(mts);

            estados.add(rj);
            estados.add(sp);
            estados.add(es);
            estados.add(mg);

            //streams

        //transforme cada estado em uma string com os atributos do ob
        String str = estados.stream()
                //.peek(System.out::println)
                .map(estado -> estado.getDescricao().concat("--").concat(String.valueOf(estado.getDescricao().length())))
                //.peek(System.out::println)
                //.filter(estado -> estado.toLowerCase().contains("r"))
                //.collect(Collectors.toList()));
                .collect(Collectors.joining(", "));

        //System.out.println(str);


            System.out.println("Contagem: "+estados.stream().count());
            //selecionar regioes 1 e trocar por sua descricao norte
              System.out.println(estados.stream()
                   // .peek(System.out::println)
                    .filter(estado -> estado.getRegiao() == 3)
                    .map(estado -> estado.getDescricao()+" filtro: Centro Oeste")
                    .collect(Collectors.toList()));

//            System.out.println(estados.stream()
//                    .filter(estado -> estado.getRegiao()==4)
//                    .map(estado -> estado.getDescricao()+" Sudeste")
//                    .collect(Collectors.toList()));


            System.out.println("Maior numero de letras: "+estados.stream().
                    max(Comparator.comparingInt(estado -> estado.getDescricao().length())).
                    map(estado -> estado.getDescricao().concat("--").concat(String.valueOf(estado.getDescricao().length())))
            );

            //imprimindo cada elemento
            System.out.println(estados.stream().peek(System.out::println).collect(Collectors.toList()));

            //estado com a letr D
            System.out.println( estados.stream().filter(estado -> estado.getDescricao().contains("M")).
                    collect(Collectors.toList()));

            //este algum com a letra D
           System.out.println(estados.stream().anyMatch(estado -> estado.getDescricao().contains("D")));
           // menor e maior
           System.out.println(estados.stream().max(Comparator.comparingInt(estado -> estado.getDescricao().length())));
            System.out.println(estados.stream().min(Comparator.comparingInt(estado -> estado.getDescricao().length())));

    }
}
