package optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {
    public static void main(String[] args) {
        System.out.println("***valor inteiro opcional***");
        OptionalInt.of(12).ifPresent(System.out::println);
        System.out.println("***valor decimal opcional***");
        OptionalDouble.of(55.2).ifPresent(System.out::println);
        System.out.println("***valor Long opcional***");
        OptionalLong.of(23L).ifPresent(System.out::println);

    }
}
