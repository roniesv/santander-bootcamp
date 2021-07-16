package avancado.funcional;

import java.util.function.Supplier;

public class Supridores{
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        Supplier<Pessoa> instanciaPessoa2 = Pessoa :: new;
        System.out.println(instanciaPessoa.get());
        System.out.println(instanciaPessoa2.get());

    }
}
class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Cesar";
        idade = 23;
    }
    public String toString(){
        return String.format("nome: %s, idade: %d",nome, idade);
    }

}
