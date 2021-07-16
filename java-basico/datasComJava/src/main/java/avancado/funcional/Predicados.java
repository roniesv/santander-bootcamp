package avancado.funcional;
import java.util.function.Predicate;
public class Predicados {
    //qualidade predicado - true ou false
    public static void main(String[] args) {
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        //outra forma
        //Predicate<String> estaVazio = String::isEmpty;

        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Ronie"));

    }
}
