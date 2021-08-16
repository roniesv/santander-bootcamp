package optional;

import java.util.Optional;
import java.util.stream.Collectors;

public class ExemploOptionalFinal {
    public static void main(String[] args) {
        Optional<String> dataSaida = Optional.ofNullable(null);
        Optional<String> dataSaida2 = Optional.of("A definir");
        Optional<String> dataSaida3 = Optional.empty();

        dataSaida.ifPresentOrElse(System.out::println, ()-> System.out.println("Optional vazio"));
        dataSaida2.ifPresentOrElse(System.out::println, ()-> System.out.println("Optinal vazio"));
        dataSaida3.ifPresentOrElse(System.out::println, ()-> System.out.println("Optinal vazio"));

        dataSaida2.map((valor) -> valor.concat("***")).ifPresent(System.out::println);
        dataSaida2.filter((valor) -> valor.contains("A")).ifPresent(System.out::println);



        if(dataSaida3.isPresent()){
            String valor = dataSaida.get();
            System.out.println(valor);
        }
        if(dataSaida3.isEmpty()){
            String valor = dataSaida.get();
            System.out.println(valor);
        }
        dataSaida3.orElseThrow(IllegalStateException::new);

    }

}
