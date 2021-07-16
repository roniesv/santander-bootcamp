package avancado.funcional;
import java.util.function.Function;
public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroECalcularODobro = string -> Integer.valueOf(string)*2;

        //Outra maneira de declarar
        Function<String, Integer> converterStringParaInteiroECalcularODobro2 = string -> {
            return Integer.valueOf(string)*2;
        };
        Function<String, Integer> converterStringParaInteiro =  Integer::valueOf;



        System.out.println(retornarNomeAoContrario.apply("Epifania"));
        System.out.println(converterStringParaInteiroECalcularODobro.apply("20"));
        System.out.println(converterStringParaInteiroECalcularODobro2.apply("20"));
        System.out.println(converterStringParaInteiro.apply("20"));



    }
}
