package avancado.funcional;
import java.util.function.Consumer;
public class Consumidores {
    public static void main(String[] args) {
        //apenas utiliza o parametro da forma como foi recebido

        //Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);

        //metodo de referencia esconde os parametros
        Consumer<String> imprimirUmaFrase = System.out::println;
        imprimirUmaFrase.accept("Hello World");





    }



}
